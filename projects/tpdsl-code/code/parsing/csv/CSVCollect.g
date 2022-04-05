// START: file
grammar CSVCollect;
options {language=Python;}

file returns [rows]
@init { $rows=[]; }
    :   header
        (   row
            {
            d = dict(zip($header.columns,$row.values))
            rows.append(d)
            }
        )+
        EOF
    ;
// END: file

// START: header
header returns [columns]
    :   row {$columns = $row.values;}
    ;
// END: header

// START: row
row returns [values]
@init { $values=[] }
    : a=STRING {$values.append($a.text)}
      (',' b=STRING {$values.append($b.text)})* '\n'
    ;
// END: row

// START: STRING
/** Match \" or anything but " in ".." */
STRING
    :   '"' ('\\' '"'|~'"')* '"'
        {$text = $text[1:-1].replace('\\"','"')}
    ;
// END: STRING

CMT: '#' ~'\n'+ '\n' {self.skip();} ;
WS : ' '+ {self.skip();} ;
