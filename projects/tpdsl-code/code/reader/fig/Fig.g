// START: header
grammar Fig;

@header {
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
}
// END: header

// START: member
@members {
/** Map object names to their instances */
public Map<String,Object> instances = new HashMap<String,Object>();
}
// END: member

// START: file
file returns [Map<String,Object> instances]
    :   object+  {$instances = this.instances;} // return instances table
    ;
// END: file

// START: object
object returns [Object o] // return object that we create
    :   type v=ID
        {
        $o = RunFig.newInstance($type.text); // simulate "new type()"
        instances.put($v.text, $o); // track in instances dictionary
        }
        '{' property[$o]* '}'       // match properties
    ;
// END: object

type:   ID ('.' ID)* ; // qualified ID like java.util.List
    
// START: property
property[Object o]     // accept instance parameter from object rule
    :   ID '=' expr ';'
        // set o's ID property with expr result
        {RunFig.setObjectProperty(o,$ID.text,$expr.value);}
    ;
// END: property

// START: expr
expr returns [Object value]
    :   STRING  {String s = $STRING.text; // get string value
                 $value = s.substring(1, s.length()-1);} // strip quotes
    |   INT     {$value = Integer.valueOf($INT.text);}
    |   '$' ID  {$value = instances.get($ID.text);} // object reference
    |   list    {$value = $list.elements;} // return list's return value
    ;
// END: expr

// START: list
list returns [List<Object> elements]
@init {
    $elements = new ArrayList<Object>(); // init return value
}
    :   '[' e=expr {$elements.add($e.value);}
            (',' e=expr {$elements.add($e.value);})*
        ']'
    |   '[' ']' // empty list
    ;
// END: list

INT :   '0'..'9'+ ;
ID  :   ('_'|'a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')* ;
STRING : '"' .* '"' ;
WS  :   (' '|'\n'|'\t')+   {skip();} ;
SLCMT:  '//' .* '\r'? '\n' {skip();} ;
CMT :   '/*' .* '*/'       {skip();} ;
