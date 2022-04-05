grammar AltLabels;
stat: 'return' e ';' # Return
    | 'break'    ';' # Break
    ;
e   : e '*' e        # Mult
    | e '+' e        # Add
    | INT            # Int
    ;
