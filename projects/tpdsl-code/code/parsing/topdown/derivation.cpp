/* Simulate derivation list => [ elements ] => [ NAME ] using
 * macros to implement rule replacement.
 */
#define list     [ elements ]  // list : '[' elements ']' ;
#define elements NAME          // elements : NAME ;

// replace list with "[ elements ]", replace elements with NAME
list 
