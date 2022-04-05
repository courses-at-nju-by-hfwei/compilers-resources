grammar Q;

@members {
    Interpreter interp;
    public QParser(TokenStream input, Interpreter interp) {
        this(input);
        this.interp = interp;
    }
}

program
    :   stat+
    ;

stat:   table
    |   insert
    |   assign
    |   query
    |   print
    ;

print:  'print' expr ';' {interp.print($expr.value);}
    ;

// START: table
table
    :   'create' 'table' tbl=ID
        '(' 'primary' 'key' key=ID (',' columns+=ID)+ ')' ';'
        {interp.createTable($tbl.text, $key.text, $columns);}
    ;
// END: table

// START: assign
assign : ID '=' expr ';'  {interp.store($ID.text, $expr.value);} ;
// END: assign

// START: insert
insert
    : 'insert' 'into' ID 'set' setFields[interp.tables.get($ID.text)] ';'
      {interp.insertInto($ID.text, $setFields.row);}
    ;
// END: insert
    
// START: fields
setFields[Table t] returns [Row row]
@init { $row = new Row(t.columns); } // set return value
    :   set[$row] (',' set[$row])*
    ;
set[Row row] // pass in Row we're filling in
    :   ID '=' expr {row.set($ID.text, $expr.value);}
    ;
// END: fields
    
query returns [Object value]
    :   'select' columns+=ID (',' columns+=ID)* 'from' tbl=ID
        (   'where' key=ID '=' expr
            {$value = interp.select($tbl.text, $columns, $key.text, $expr.value);}
        |   {$value = interp.select($tbl.text, $columns);}
        )
    ;

// START: expr
// Match a simple value or do a query
expr returns [Object value] // access as $expr.value in other rules
    :   ID      {$value = interp.load($ID.text);}
    |   INT     {$value = $INT.int;}
    |   STRING  {$value = $STRING.text;}
    |   query   {$value = $query.value;}
    ;
// END: expr

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT :   '0'..'9'+ ;

STRING
    :   '\'' ~'\''* '\''
        {setText(getText().substring(1, getText().length()-1));}
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
