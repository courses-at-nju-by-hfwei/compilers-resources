/** Rows are two real numbers:
    0.9962269825793676, 0.9224608616182103
    0.91673278673353,  -0.6374985722530822
    0.9841464019977713, 0.03539546030010776
    ...
 */
grammar CSV;

@members {
double x, y; // keep column sums in these fields
}

file: row+ {System.out.printf("%f, %f\n", x, y);} ;

row : a=field ',' b=field '\r'? '\n'
      {
      x += Double.valueOf($a.start.getText());
      y += Double.valueOf($b.start.getText());
      }
    ;
     
field  
    : TEXT
    ;  

TEXT : ~[,\n\r]+ ;
