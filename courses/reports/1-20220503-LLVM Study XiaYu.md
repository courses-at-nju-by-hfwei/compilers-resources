# Tutorial阅读记录

## LLVM Tutorial

### 从词法分析器开始

```c++
enum Token {
  tok_eof = -1,

  // commands
  tok_def = -2,
  tok_extern = -3,

  // primary
  tok_identifier = -4,
  tok_number = -5,
};

static std::string IdentifierStr; // Filled in if tok_identifier
static double NumVal;             // Filled in if tok_number
```

### 实现语法分析器和语法树

**关键点：递归下降的语法分析、运算符优先级解析**

基本语法单元：

+ expression（语句）
  + 常量
  + 变量
  + 二元操作语句
  + 函数调用
+ prototype（函数声明）
  + 包含了函数的名字、参数列表
+ function object（函数体）
  + 包含函数原型和函数体

递归下降的语法分析：

```c++
static int CurTok;			// 标识待识别的词法单元
static int getNextToken() {	// 消费当前词法单元，获取下一个词法单元
  return CurTok = gettok();
}
```

**重点：二元表达式解析**

二元表达式解析的难点在于不同的运算符有不同的优先级。

解析流程：

+ 利用map存储不同运算符的优先级，非运算符的优先级为-1（帮助退出`ParseBinOpRHS`方法的循环）
+ 调用`ParseExpression`解析二元表达式，利用`ParsePrimary`方法解析左侧，然后调用`ParseBinOpRHS`方法解析二元表达式运算符及右侧（需要传入已经解析部分的优先级）
+ 在`ParseBinOpRHS`方法中，有一个while循环，先获取二元运算符的优先级，如果其小于传入的优先级，解析结束；否则，消费当前运算符，并解析表达式右侧，解析之后，取下一个运算符，判断其优先级是否大于当前运算符，如果大于，则要继续解析，递归调用`ParseBinOpRHS`；否则以当前运算符为中心的表达式合并成为LHS。然后继续while循环知道满足下一个字符不是运算符为止。



整体流程：

```C++
static void MainLoop() {
  while (1) {
    fprintf(stderr, "ready> ");
    switch (CurTok) {
    case tok_eof:
      return;
    case ';': 			// ignore top-level semicolons.
      getNextToken();
      break;
    case tok_def:
      HandleDefinition();
      break;
    case tok_extern:
      HandleExtern();
      break;
    default:
      HandleTopLevelExpression();
      break;
    }
  }
}
```

### LLVM的中间代码生成

步骤：

+ 在`ExprAST`定义虚方法`virtual Value *codegen() = 0;`，在每个具体的语法单元中实现该方法用于生成llvm的中间代码（当然也可以利用`visitor`模式替代实现此虚方法）

+ 定义几个静态变量

  + `static LLVMContext TheContext`：包含了llvm的核心数据结构，包括类型和常量值表

    + ```C++
      std::vector<Type*> Doubles(Args.size(),
                                   Type::getDoubleTy(TheContext))
      FunctionType *FT =		// 创建一个函数，返回值位double，参数为doubles的列表，不是可变长参数
          FunctionType::get(Type::getDoubleTy(TheContext), Doubles, false)
      ```

  + `static IRBuilder<> Builder(TheContext)`：记录要插入IR的位置；提供生成IR的方法

    + ```C++
      Builder.CreateCall(CalleeF, ArgsV, "calltmp");
      Builder.CreateFCmpULT(L, R, "cmptmp");
      ```

  + `static std::unique_ptr<Module> TheModule`：包含了函数和全局变量，拥有用来生成IR的所有信息

    + ```C++
      // Look up the name in the global module table.
      Function *CalleeF = TheModule->getFunction(Callee);
      ```

  + `static std::map<std::string, Value *> NamedValues`：类似于一张符号表，不过是局部作用域的

+ 完成每种类型的节点的翻译

  + ```C++
    Value *NumberExprAST::codegen() {
      return ConstantFP::get(*TheContext, APFloat(Val));
    }
    
    Value *VariableExprAST::codegen() {
      // Look this variable up in the function.
      Value *V = NamedValues[Name];
      if (!V)
        return LogErrorV("Unknown variable name");
      return V;
    }
    
    Value *BinaryExprAST::codegen() {
      Value *L = LHS->codegen();
      Value *R = RHS->codegen();
      if (!L || !R)
        return nullptr;
    
      switch (Op) {
      case '+':
        return Builder->CreateFAdd(L, R, "addtmp");
      case '-':
        return Builder->CreateFSub(L, R, "subtmp");
      case '*':
        return Builder->CreateFMul(L, R, "multmp");
      case '<':
        L = Builder->CreateFCmpULT(L, R, "cmptmp");
        // Convert bool 0/1 to double 0.0 or 1.0
        return Builder->CreateUIToFP(L, Type::getDoubleTy(*TheContext), "booltmp");
      default:
        return LogErrorV("invalid binary operator");
      }
    }
    
    Value *CallExprAST::codegen() {
      // Look up the name in the global module table.
      Function *CalleeF = TheModule->getFunction(Callee);
      if (!CalleeF)
        return LogErrorV("Unknown function referenced");
    
      // If argument mismatch error.
      if (CalleeF->arg_size() != Args.size())
        return LogErrorV("Incorrect # arguments passed");
    
      std::vector<Value *> ArgsV;
      for (unsigned i = 0, e = Args.size(); i != e; ++i) {
        ArgsV.push_back(Args[i]->codegen());
        if (!ArgsV.back())
          return nullptr;
      }
    
      return Builder->CreateCall(CalleeF, ArgsV, "calltmp");
    }
    
    Function *PrototypeAST::codegen() {
      // Make the function type:  double(double,double) etc.
      std::vector<Type *> Doubles(Args.size(), Type::getDoubleTy(*TheContext));
      FunctionType *FT =
          FunctionType::get(Type::getDoubleTy(*TheContext), Doubles, false);
    
      Function *F =
          Function::Create(FT, Function::ExternalLinkage, Name, TheModule.get());
    
      // Set names for all arguments.
      unsigned Idx = 0;
      for (auto &Arg : F->args())
        Arg.setName(Args[Idx++]);
    
      return F;
    }
    
    Function *FunctionAST::codegen() {
      // First, check for an existing function from a previous 'extern' declaration.
      Function *TheFunction = TheModule->getFunction(Proto->getName());
    
      if (!TheFunction)
        TheFunction = Proto->codegen();
    
      if (!TheFunction)
        return nullptr;
    
      // Create a new basic block to start insertion into.
      BasicBlock *BB = BasicBlock::Create(*TheContext, "entry", TheFunction);
      Builder->SetInsertPoint(BB);
    
      // Record the function arguments in the NamedValues map.
      NamedValues.clear();
      for (auto &Arg : TheFunction->args())
        NamedValues[std::string(Arg.getName())] = &Arg;
    
      if (Value *RetVal = Body->codegen()) {
        // Finish off the function.
        Builder->CreateRet(RetVal);
    
        // Validate the generated code, checking for consistency.
        verifyFunction(*TheFunction);
    
        return TheFunction;
      }
    
      // Error reading body, remove function.
      TheFunction->eraseFromParent();
      return nullptr;
    }
    
    ```

### 添加JIT和优化

#### IRBuilder自身就能完成一些代码优化

譬如常量折叠

```shell
ready> def test(x) 1+2+x;
Read function definition:
define double @test(double %x) {
entry:
        %addtmp = fadd double 3.000000e+00, %x
        ret double %addtmp
}
```

然而IRBUILDER的优化是有局限性的，它所作的优化取决于它在生成这条中间代码时所能看见的内容

```shell
ready> def test(x) (1+2+x)*(x+(1+2));
ready> Read function definition:
define double @test(double %x) {
entry:
        %addtmp = fadd double 3.000000e+00, %x
        %addtmp1 = fadd double %x, 3.000000e+00
        %multmp = fmul double %addtmp, %addtmp1
        ret double %multmp
}
```

#### llvm利用“passes”进行中间代码优化

[LLVM Pass入门导引](https://zhuanlan.zhihu.com/p/122522485)

那么 **LLVM Pass** 又是什么呢？ Pass就是“遍历一遍IR，可以同时对它做一些操作”的意思。翻译成中文应该叫“趟”。 在实现上，LLVM的核心库中会给你一些 Pass类 去继承。你需要实现它的一些方法。 最后使用LLVM的编译器会把它翻译得到的IR传入Pass里，给你遍历和修改。



**LLVM Pass**既支持全局视角下的中间代码优化也支持单个函数视角下的优化



引入**llvm pass**的流程

```C++
void InitializeModuleAndPassManager(void) {
  // Open a new module.
  TheModule = std::make_unique<Module>("my cool jit", TheContext);

  // Create a new pass manager attached to it.
  TheFPM = std::make_unique<legacy::FunctionPassManager>(TheModule.get());

  // Do simple "peephole" optimizations and bit-twiddling optzns.
  TheFPM->add(createInstructionCombiningPass());
  // Reassociate expressions.
  TheFPM->add(createReassociatePass());
  // Eliminate Common SubExpressions.
  TheFPM->add(createGVNPass());
  // Simplify the control flow graph (deleting unreachable blocks, etc).
  TheFPM->add(createCFGSimplificationPass());

  TheFPM->doInitialization();
}
```

```C++
if (Value *RetVal = Body->codegen()) {
  // Finish off the function.
  Builder.CreateRet(RetVal);

  // Validate the generated code, checking for consistency.
  verifyFunction(*TheFunction);

  // Optimize the function.
  TheFPM->run(*TheFunction);

  return TheFunction;
}
```

#### llvm引入JIT Compiler

JIT引擎的ExecutionManager类调用LLVM代码生成器，产生目标平台机器指令的二进制代码保存在内存中，并返回指向编译后函数的指针。然后通过函数指针指向指令所在内存区域即可执行该函数。

```C++
static std::unique_ptr<KaleidoscopeJIT> TheJIT;
...
int main() {
  InitializeNativeTarget();
  InitializeNativeTargetAsmPrinter();
  InitializeNativeTargetAsmParser();

  // Install standard binary operators.
  // 1 is lowest precedence.
  BinopPrecedence['<'] = 10;
  BinopPrecedence['+'] = 20;
  BinopPrecedence['-'] = 20;
  BinopPrecedence['*'] = 40; // highest.

  // Prime the first token.
  fprintf(stderr, "ready> ");
  getNextToken();

  TheJIT = std::make_unique<KaleidoscopeJIT>();

  // Run the main "interpreter loop" now.
  MainLoop();

  return 0;
}

void InitializeModuleAndPassManager(void) {
  // Open a new module.
  TheModule = std::make_unique<Module>("my cool jit", TheContext);
  TheModule->setDataLayout(TheJIT->getTargetMachine().createDataLayout());

  // Create a new pass manager attached to it.
  TheFPM = std::make_unique<legacy::FunctionPassManager>(TheModule.get());
  ...
```

JIT的使用方式

```C++
static void HandleTopLevelExpression() {
  // Evaluate a top-level expression into an anonymous function.
  if (auto FnAST = ParseTopLevelExpr()) {
    if (FnAST->codegen()) {

      // JIT the module containing the anonymous expression, keeping a handle so
      // we can free it later.
      auto H = TheJIT->addModule(std::move(TheModule));
      InitializeModuleAndPassManager();

      // Search the JIT for the __anon_expr symbol.
      auto ExprSymbol = TheJIT->findSymbol("__anon_expr");
      assert(ExprSymbol && "Function not found");

      // Get the symbol's address and cast it to the right type (takes no
      // arguments, returns a double) so we can call it as a native function.
      double (*FP)() = (double (*)())(intptr_t)ExprSymbol.getAddress();
      fprintf(stderr, "Evaluated to %f\n", FP());

      // Delete the anonymous expression module from the JIT.
      TheJIT->removeModule(H);
    }
     ...
         
     
ready> 4+5;
Read top-level expression:
define double @0() {
entry:
  ret double 9.000000e+00
}

Evaluated to 9.000000
    
    
    
    
    
ready> def testfunc(x y) x + y*2;
Read function definition:
define double @testfunc(double %x, double %y) {
entry:
  %multmp = fmul double %y, 2.000000e+00
  %addtmp = fadd double %multmp, %x
  ret double %addtmp
}

ready> testfunc(4, 10);
Read top-level expression:
define double @1() {
entry:
  %calltmp = call double @testfunc(double 4.000000e+00, double 1.000000e+01)
  ret double %calltmp
}

Evaluated to 24.000000

ready> testfunc(5, 10);
ready> LLVM ERROR: Program used external function 'testfunc' which could not be resolved! 
```



可以把每一个函数放到各自的module中以解决此问题，这还能使得函数可以在不同moudle中重复定义（现场联系toturial来看，这边就不拷贝代码了）



### 控制流—— if/then/else  &&  for

#### 词法分析的扩展

#### 语法分析的扩展

#### llvm IR生成的扩展

if/then/else

```shell
define double @baz(double %x) {
entry:
  %ifcond = fcmp one double %x, 0.000000e+00
  br i1 %ifcond, label %then, label %else

then:       ; preds = %entry
  %calltmp = call double @foo()
  br label %ifcont

else:       ; preds = %entry
  %calltmp1 = call double @bar()
  br label %ifcont

ifcont:     ; preds = %else, %then
  %iftmp = phi double [ %calltmp, %then ], [ %calltmp1, %else ]
  ret double %iftmp
```

对于上述IR，产生的问题是代码如何知道返回哪一个值？文章中说利用SSA的方式创建phi节点，并在第七章讲述。

[LLVM SSA 介绍](https://blog.csdn.net/qq_29674357/article/details/78731713)

[Phi node 是如何实现它的功能的？](https://www.zhihu.com/question/24992774)

对于控制流语句的翻译，本质上涉及的是在何处插入新的block，并且在当前block生成以后，需要重新更新block（因为在递归翻译的过程中会修改当前block）



### 增加用户自定义操作符

### 增加变量



### 将中间代码翻译为目标代码

获取本机的体系结构（大概是跟本机相关的一些信息，用于生成以本机为目标平台的代码）

```C++
auto TargetTriple = sys::getDefaultTargetTriple();
// x86_64-pc-linux-gnu  在我的电脑上是这个
auto Target = TargetRegistry::lookupTarget(TargetTriple, Error);
if (!Target) {
  errs() << Error;
  return 1;
}
```

在命令行输入`llvm-as < /dev/null | llc -march=x86 -mattr=help`可以查看llvm支持哪些cpu和特性（16位/32位......)

下面将CPU设置为通用CPU并不需要其它任何特性

```C++
auto CPU = "generic";
auto Features = "";

TargetOptions opt;
auto RM = Optional<Reloc::Model>();
auto TargetMachine = Target->createTargetMachine(TargetTriple, CPU, Features, opt, RM);
```

进行模块配置（此设置不是必要的，但是配置之后对于优化有好处）

```
TheModule->setDataLayout(TargetMachine->createDataLayout());	
TheModule->setTargetTriple(TargetTriple);
```

生成目标代码

```C++
auto Filename = "output.o";		// 定义输出文件
std::error_code EC;
raw_fd_ostream dest(Filename, EC, sys::fs::OF_None);

if (EC) {
  errs() << "Could not open file: " << EC.message();
  return 1;
}

// 定义生成目标代码的桩
legacy::PassManager pass;
auto FileType = CGFT_ObjectFile;

if (TargetMachine->addPassesToEmitFile(pass, dest, nullptr, FileType)) {
  errs() << "TargetMachine can't emit a file of this type";
  return 1;
}

pass.run(*TheModule);	// 运行该桩以生成目标代码
dest.flush();
```



### 增加调试信息

### 总结

应该是官方对于llvm的展望？

#### llvm ir的特性

+ 目标无关性：llvm ir可以运行在任何llvm支持的平台上并能够产生相同的运行效果
+ 安全保障：llvm ir本身并不能保证安全（这包括不安全的指针转换、释放后再使用、缓冲区溢出登），如果要保证llvm ir的安全性，需要在llvm之上作为一个单独的层面来考虑
+ 针对特定语言的优化：llvm ir会丢失来自高级语言的信息；llvm可能做到针特性高级语言的优化



## A tutorial on how to write a compiler using LLVM

本文主题

+ 利用Antlr构建编译器前端
+ 利用LLVM生成机器代码
+ 为源码级别的调试生成调试信息

### LLVM是什么

+ llvm能生成运行快速的可执行代码，提供了很多的优化功能
+ llvm能够为不同平台生成机器吗
+ llvm能够支持编译的所有阶段，包括前端、中间代码生成、代码优化等

### 利用Antlr实现LLVM的前端

+ 前端部分整体思路与上学期的Antlr实验相同，除了该文章中自行利用visitor模式构建了抽象语法树
+ 抽象语法树的每一个节点都实现`accept`方法供访问者在遍历语法分析树时调用，此accept方法接受一个Generator对象，并调用该对象的visit方法（依据多态的特性决定调用哪一个方法），生成中间代码

### 生成LLVM IR的API

三大利器

+ **llvm::Module**：存储代码的容器，提供了定义函数和全局变量的方法
+ **llvm::IRBuilder**：提供了生成LLVM指令的方法，并且记录应该在何处插入中间代码，并提供方法设置插入的位置
+ **llvm::Context**：保存了LLVM内部的数据结构

重要概念：

+ **llvm::Value**：是LLVM中所有变量、指令、函数的基类
+ **llvm:BasicBlock**：一个带有终止指令的代码块（例如带有返回指令的函数体、带有跳转指令的分支语句块）

==典型使用例子==

```C++
llvm::Value* GeneratorLLVM::visit(SubroutineDeclaration *subroutine) {
    /* Lookup if the Module to find the function definition */
    llvm::Function *function = module->getFunction(subroutine->getName());
    if(function) {
        /* Creates a new BasicBlock as the body of the function. */
        llvm::BasicBlock *body = 
            llvm::BasicBlock::Create(llvmContext, "entry", function);
        // Instruct the builder to generate the instruction in the body
        builder->SetInsertPoint(body);

        /* Emit the subroutine body, non-terminating instructions */
        for (auto stmt = s>getNodes().begin(); stmt != s->getNodes().end();) {
            stmt->get()->accept( this );
        }

        /* Insert the block terminator */
        llvm::Value *ret = 
         llvm:: ConstantInt::get(llvmContext, llvm::APInt(32, 0, true));
        builder->CreateRet(ret);

    } else {
        std::cout << subroutine->getName() << " not found!" << std::endl;
    }
}
```

### LLVM IR的生成之数据声明篇

把符号表转为数据声明

```C++
void  GeneratorLLVM::process(std::shared_ptr<SymbolTable> symbolTable,std::shared_ptr<AST> ast) {
 
 // Generates data declaration  
 std::map<...> global = symbolTable->getSymbols(0);   
 for(auto symbol = global.begin(); symbol != global.end();symbol++) { 
   declare(symbol->second.get());
 }

 // Generates the runtime initialization function
 initializeRunTime(symbolTable);

 // Generates code
 for(node = ast->getNodes().begin();node!= ast->getNodes().end();++node) {
   node->get()->accept(this);
 }
}
```

GeneratorLLVM中的declare方法利用llvm::Module来生成全局变量

```C++
void GeneratorLLVM::declare(class Symbol *symbol) {    
 // Declares a global variable
 SymbolSpecifier *variable = symbol->getSpecifier();
  if(variable) {
      // 检查变量是否已经定义
    if( !module->getNamedGlobal(symbol->getName())) {
      if(variable->getDecimals() == 0) {
          		// 创建变量
                module->getOrInsertGlobal(
                                          symbol->getName(),
                                          builder->getInt64Ty()
                                        );
       }
       // Creates the variable
       llvm::GlobalVariable *var =
             module->getNamedGlobal(symbol->getName());
       
       if(var) {
           llvm::Constant *initValue =
           llvm::ConstantInt::get(
                 llvmContext, llvm::APInt(64, 0, true)
           );
           		// 设置变量初始值
                var->setInitializer(initValue);
                var->setLinkage(llvm::GlobalValue::CommonLinkage);

            }
      }
}
```

### LLVM IR的生成之代码生成篇

遍历抽象语法树生成中间代码

复制语句的翻译

```C++
llvm::Value* GeneratorLLVM::visit(AssignmentStatement *assignment,void *param) {
    /* Retrieve the global variable */
    // 因为源代码只支持全局变量
    llvm::GlobalVariable* target =    
         module->getGlobalVariable(assignment->getTarget());
    if(!target) {
        std::cout << assignment->getTarget() << " not found!" << std::endl;
        return nullptr;
    }
    if(assignment->getExpression()) {
        /* Visit and resolve the expression  */
        llvm::Value* v = assignment->getExpression()->accept(this);
        if(v) {
            /* Emit the store instruction */
            builder->CreateStore(v, target);
        }
    }
    return  target;
}
```

二元运算符的翻译

```C++
llvm::Value* GeneratorLLVM::visit(MathExpression *expression) {
    std::cout << expression->toString() << std::endl;

    llvm::Value* L = expression->getLeft()->accept(this,param);
    llvm::Value* R = expression->getRight()->accept(this,param);

    switch (expression->getType()) {
        case Token::PLUS:
            return builder->CreateAdd(L, R, "addtmp");;

        case Token::MINUS:
            return builder->CreateSub(L, R, "subtmp");

        case Token::MULTIPLY:
            return builder->CreateMul(L, R, "multmp");

        case Token::DIVIDE:
            return builder->CreateSDiv(L, R, "divtmp");
    }
    return nullptr;
}
```

其余不再列举

### 外部方法的调用

想要调用`printf`方法就需要提供函数的定义，格式化串和返回值

```C++
/* Emit the format string for the printf */
    std::string str = "%lld\n";
	// 定义一个8位的数据类型
    auto charType = llvm::IntegerType::get(llvmContext, 8);

    /*  Initialize the  vector */
    std::vector<llvm::Constant *> chars(str.length());
    for(unsigned int i = 0; i < str.size(); i++) {
        chars[i] = llvm::ConstantInt::get(charType, str[i]);
    }
    /*  Add '\0' at the end of the string */
    chars.push_back(llvm::ConstantInt::get(charType, 0));

    /* Initialize the string from the characters */
    auto stringType = llvm::ArrayType::get(charType, chars.size());

    /* declaration statement */
	// 声明一个"%lld\n"的全局变量
    auto globalDeclaration = (llvm::GlobalVariable*) module->getOrInsertGlobal("pstr", stringType);
    globalDeclaration->setInitializer(llvm::ConstantArray::get(stringType, chars));
    globalDeclaration->setConstant(true);
    globalDeclaration->setLinkage(llvm::GlobalValue::LinkageTypes::PrivateLinkage);
    globalDeclaration->setUnnamedAddr (llvm::GlobalValue::UnnamedAddr::Global);

	// 设置参数，一个指向Int8的指针类型
    std::vector<llvm::Type*> pparams;
    pparams.push_back(llvm::Type::getInt8PtrTy(llvmContext));

	// 定义函数类型（返回值类型，参数类型，是否是可变长参数）
    llvm::FunctionType *pft = llvm::FunctionType::get(llvm::Type::getInt32Ty(llvmContext),pparams, true);
	// 声明printf方法为external
    llvm::Function *printf = llvm::Function::Create(pft, llvm::Function::ExternalLinkage, "printf", this->module.get());
```

### 添加调试信息

为了能够支持源代码级别的调试，编译器必须包含附加信息以识别机器码和源代码之间位置的对应关系

LLVM使用**llvm::DIBuilder**来生成调试信息，在生成中间代码时添加-debug选项可以生成调试信息

```shell
strumenta@system-76:~fib$./rpg --debug CALCFIB.rpgle > calcfib.ll
strumenta@system-76:~fib$ clang -x ir calcfib.ll -o calcfib.out 
```



## LLVM by TerenceP

首先介绍了编译工作是一项比较复杂的工作，因此复用已有的工具来翻译新的语言是一个好方法，由此引出LLVM。

LLVM IR既可以被翻译成汇编，然后转为机器码来执行；也可以直接解释执行

关于LLVM IR的一些规则

+ 一个.ll文件对应于一个module
+ 全局变量以@开头，而局部变量和寄存器以%开头
+ 对于外部函数的声明要早于全局变量和内部方法
+ 全局变量定义的是指针值
+ 每一个basic block都以一个标志开始



定义了一些源代码和LLVM IR的映射规则（直接在网页上查看）



### 构建AST

### 构建符号表



### 中间代码生成

利用的是一种Tree Grammar而不是手动构建访问者模式

在访问抽象语法树节点的过程中，会创建并使用StringTemplate，并利用StringTemplate来生成中间代码。（可以做到仅通过替换StringTemplate的方式指定我们想要生成的中间代码）

Tree Grammar应该会去选择某个树节点应该使用哪个StringTemplate。

```java
// GENERATE CODE
nodes.reset(); // rewind tree node stream to walk again
Gen walker = new Gen(nodes, symtab);
walker.setTemplateLib(templates); // set templates to use!
walker.translation_unit();    // walk to create template hierarchy
```

Tree Grammar负责逻辑处理（选择哪个模板），StringTemplate负责生成具体的中间代码。

```
translation_unit
  :  ^(FILE d+=external_declaration+)
    -> file(decls={$d}, strings={strings})	// 选择对应的模板，并注入属性
  ;
```

```
file(decls, strings) ::= <<
declare i32 @printf(i8 *, ...) 
<strings:{s | @s<i> = internal constant <string_type(s)> c"<s>"}; separator="\n">
<decls; separator= "\n">
>>
```

```
declare i32 @printf (i8 *, ...)
@s1 = internal constant [4 x i8] c"%d\0A\00"
```



赋值语句的模板

—>  表明了选择哪一个模板

```
statement:  
	...  
	|  ^('=' ID expression) -> assign(id={$ID.text}, rhs={$expression.st})
	...
```

```
assign(id, rhs, descr) ::= <<
; <descr>
<rhs>	// 猜测：递归的调用rhs的模板翻译
store i32 %r<rhs.reg>, i32* %<id>
>>
```

C语言版本的翻译（The "interface" (template name and argument list) is the same. Only the template content differs.）

```
assign(id, rhs, descr) ::= "<id> = <rhs>;"
```
