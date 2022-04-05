grammar CSV;

@header {
import java.util.*;
}

/** Derived from rule "file : hdr row+ ;" */
file
locals [int i=0]
     : hdr ( rows+=row[$hdr.text.split(",")] {$i++;} )+
       {
       System.out.println($i+" rows");
       for (RowContext r : $rows) {
           System.out.println("row token interval: "+r.getSourceInterval());
       }
       }
     ;

hdr : row[null] {System.out.println("header: '"+$text.trim()+"'");} ;

/** Derived from rule "row : field (',' field)* '\r'? '\n' ;" */
row[String[] columns] returns [Map<String,String> values]
locals [int col=0]
@init {
    $values = new HashMap<String,String>();
}
@after {
    if ($values!=null && $values.size()>0) {
        System.out.println("values = "+$values);
    }
}
// rule row cont'd...
    :   field
        {
        if ($columns!=null) {
            $values.put($columns[$col++].trim(), $field.text.trim());
        }
        }
        (   ',' field
            {
            if ($columns!=null) {
                $values.put($columns[$col++].trim(), $field.text.trim());
            }
            }
        )* '\r'? '\n'
    ;

field
    :   TEXT
    |   STRING
    |
    ;

TEXT : ~[,\n\r"]+ ;
STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote
