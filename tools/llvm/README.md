# [LLVM](https://llvm.org/)

- [LLVM Documentation](https://llvm.org/docs/index.html)

## Overview
- [LLVM @ wiki](https://en.wikipedia.org/wiki/LLVM)
- [LLVM Home](https://llvm.org/)
- [LLVM for Grad Students](https://www.cs.cornell.edu/~asampson/blog/llvm.html)
  - This is an introduction to doing research with the LLVM compiler infrastructure. It should be enough for a grad student to go from mostly uninterested in compilers to excited to use LLVM to do great work.

## Tutorials

- [LLVM编译器入门 @ bilibili](https://www.bilibili.com/video/BV18j411B7TF/?share_source=copy_web&vd_source=afddc1f6e07c3046ed07519aa34370fd)
  - LLVM 整体设计
  - Clang 前端
  - IR 优化
  - 代码生成 (上)
  - 代码生成 (下)

- [LLVM Getting Started Tutorials](https://llvm.org/docs/GettingStartedTutorials.html)
  - [Getting Started with the LLVM System](https://llvm.org/docs/GettingStarted.html)
    > Discusses how to get up and running quickly with the LLVM infrastructure. Everything from unpacking and compilation of the distribution to execution of some tools.
  - [Getting Started with the LLVM System using Microsoft Visual Studio](https://llvm.org/docs/GettingStartedVS.html)
    > An addendum to the main Getting Started guide for those using Visual Studio on Windows.
  - [LLVM Tutorial: Table of Contents](https://llvm.org/docs/tutorial/index.html)
    > Tutorials about using LLVM. Includes a tutorial about making a custom language with LLVM.
  - [LLVM Programmer’s Manual](https://llvm.org/docs/ProgrammersManual.html)
    > Introduction to the general layout of the LLVM sourcebase, important classes and APIs, and some tips & tricks.

## On LLVM IR
- [LLVM Language Reference Manual](https://llvm.org/docs/LangRef.html)

## On Writing Compilers with (ANTLR and) LLVM (Recommended in this order)

### Tutorials
- [A Tutorial on How to Write a Compiler using LLVM @ tomassetti.me](https://tomassetti.me/a-tutorial-on-how-to-write-a-compiler-using-llvm/)
  - In this article we will explore the implementation of a simple compiler able to translate the IBM RPG programming language into executable machine code for modern hardware. It uses ANTLR4.
  - [Strumenta/article-llvm-rpg @ github](https://github.com/Strumenta/article-llvm-rpg)
- [LLVM by TerenceP](https://theantlrguy.atlassian.net/wiki/spaces/ANTLR3/pages/2687062/LLVM)
  - To use ANTLR+StringTemplate with LLVM to build a compiler. However, it uses ANTLR3.
- [LLVM Tutorial](https://llvm.org/docs/tutorial/)
  - Kaleidoscope: Implementing a Language with LLVM
### Projects
- [yutao33 / antlr4Expr @ github](https://github.com/yutao33/antlr4Expr)
  - ANTLR4 with LLVM, Expr example grammar
- [quantumsheep / llvm-antlr4-starter @ github](https://github.com/quantumsheep/llvm-antlr4-starter)
  - Pre-configured LLVM and ANTLR4 for C++
- [JunguangJiang / TinyCCompiler @ github](https://github.com/JunguangJiang/TinyCCompiler)
  - A tiny C compiler based on LLVM and ANTLR4
- [ChenQiqian / cpp2llvm @ github](https://github.com/ChenQiqian/cpp2llvm)
  - A C to LLVM compiler, using ANTLR4
- [paraka / c-compiler-antlr4-cpp-llvm @ github](https://github.com/paraka/c-compiler-antlr4-cpp-llvm)
  - C compiler using ANTLR4 with CPP backend and using LLVM for code generation
- [ciupam / noble-script @ github](https://github.com/ciupam/noble-script)
  - ANTLR4/LLVM based compiler
- [AndreaOrru / Lucy @ github](https://github.com/AndreaOrru/Lucy)
  - Compiler for a toy language in a couple hundred lines. Just messing around with ANTLR4 and LLVM really
- [quangIO / Lucix @ github](https://github.com/quangIO/Lucix)
- [eugeneai / Java-oberon-compiler @ github](https://github.com/eugeneai/Java-oberon-compiler)
  - Compiler for Oberon programming language implemented with Java, Antlr4, LLVM
- [quantumsheep / demo-antlr4-llvm @ github](https://github.com/quantumsheep/demo-antlr4-llvm)
  - JIT compiler demo using ANTLR4 and LLVM
- [noterpopo / wenyan-lang-llvm @ github](https://github.com/noterpopo/wenyan-lang-llvm)
  - 文言文语言编译器，前端采用 ANTLR 做 Lexer 和 Parser，利用 AST 生成 LLVM IR

## On Passes and Optimizations

### Tutorials
- [LLVM Tutor](https://github.com/banach-space/llvm-tutor)
  - A collection of out-of-tree LLVM passes for teaching and learning
- [LLVM; By Chris Lattner](http://www.aosabook.org/en/llvm.html)
  - This chapter discusses some of the design decisions that shaped LLVM.
- [The LLVM Compiler Framework and Infrastructure Tutorial](https://llvm.org/pubs/2004-09-22-LCPCLLVMTutorial.html)
- [Writing an LLVM Pass](https://llvm.org/docs/WritingAnLLVMPass.html)
  - Information on how to write LLVM transformations under the new pass manager.
- [LLVM’s Analysis and Transform Passes](https://llvm.org/docs/Passes.html)
  - A list of optimizations and analyses implemented in LLVM.

### Documentations
- [LLVM + Doxygen](https://llvm.org/doxygen/)
- [LLVM Programmer’s Manual](https://llvm.org/docs/ProgrammersManual.html)
  - Introduction to the general layout of the LLVM sourcebase, important classes and APIs, and some tips & tricks.
- [Performance Tips for Frontend Authors](https://llvm.org/docs/Frontend/PerformanceTips.html)

## On Code Generation
- [Writing an LLVM Backend](https://llvm.org/docs/WritingAnLLVMBackend.html)
  - This document describes techniques for writing compiler backends that convert the LLVM Intermediate Representation (IR) to code for a specified machine or other languages.
## LLVM Developers' Meeting (LLVMDEV)
- [2017 European LLVM Developers' Meeting](https://eurollvm2017.sched.com/)
- [2019 European LLVM Developers' Meeting](https://eurollvm2019.sched.com/)
  - [LLVMDev2019: LLVM基础知识入门](https://www.bilibili.com/video/BV1Pf4y117S7?share_source=copy_web)

## Books
- [LLVM Cookbook](../../books/LLVM%20Cookbook.pdf)
- [Getting Started with LLVM Core Libraries](../../books/Getting%20Started%20with%20LLVM%20Core%20Libraries.pdf)
