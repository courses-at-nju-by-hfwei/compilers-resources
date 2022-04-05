grammar DynScope;

prog:   block
    ;

block
/* List of symbols defined within this block */
locals [
    List<String> symbols = new ArrayList<String>()
]

    :   '{' decl* stat+ '}'
        // print out all symbols found in block
        // $block::symbols evaluates to a List as defined in scope
        {System.out.println("symbols="+$symbols);}
    ;

/** Match a declaration and add identifier name to list of symbols */
decl:   'int' ID {$block::symbols.add($ID.text);} ';'
    ;

/** Match an assignment then test list of symbols to verify
 *  that it contains the variable on the left side of the assignment.
 *  Method contains() is List.contains() because $block::symbols
 *  is a List.
 */
stat:   ID '=' INT ';'
        {
        if ( !$block::symbols.contains($ID.text) ) {
            System.err.println("undefined variable: "+$ID.text);
        }
        }
    |   block
    ;

ID  :   [a-z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\r\n]+ -> skip ;

