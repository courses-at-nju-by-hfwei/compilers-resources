$ALGORITHM = $1;
$INPUT = $2;
$OUTPUT = $3;

echo "algorithm: " + $ALGORITHM;
echo "input: " + $INPUT;
echo "output: " + $OUTPUT;

# Load the formula.
load $f -c LBTT $INPUT;

echo "formula: " + $f;

# Translate the formula.
if $ALGORITHM == "tableau" || $ALGORITHM == "tester" ||
   $ALGORITHM == "inctableau" || $ALGORITHM == "gpvw" ||
   $ALGORITHM == "gpvw+" || $ALGORITHM == "ltl2aut" ||
   $ALGORITHM == "ltl2aut+" || $ALGORITHM == "modella" then
  $a = translate -m $ALGORITHM -t ngbw $f;
elif $ALGORITHM == "ltl2aut+-pe" then
  $a = translate -m ltl2aut+ -pe -t ngbw $f;
elif $ALGORITHM == "ltl2aut+-pi" then
  $a = translate -m ltl2aut+ -pi -t ngbw $f;
elif $ALGORITHM == "ltl2aut+-pe-pi" then
  $a = translate -m ltl2aut+ -pe -pi -t ngbw $f;
elif $ALGORITHM == "ltl2ba" || $ALGORITHM == "pltl2ba" || 
     $ALGORITHM == "couvreur" || $ALGORITHM == "ltl2buchi" then
  $a = translate -m $ALGORITHM -t ntgbw $f;
else
  echo "Unknown translation algorithm: " + $ALGORITHM;
  exit;
fi

echo "automaton: " + $a;

# Save the automaton.
save $a -c LBTT $OUTPUT;
