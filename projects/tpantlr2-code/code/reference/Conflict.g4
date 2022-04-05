grammar Conflict;
stat: 'return' e ';' # Return
    | 'break'    ';' # Break
    ;
e   : e '*' e        # e
    | e '+' e        # Stat
    | INT            # Int
    ;
