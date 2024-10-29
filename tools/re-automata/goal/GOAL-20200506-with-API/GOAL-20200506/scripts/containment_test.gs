$method = $1;
$size = $2;
$props = $3;
$dt = $4;
$da = $5;
$rounds = $6;

if $method == null || $size == null || $props == null || $dt == null || $da == null then
  echo "Usage: containment_test.gs METHOD STATE_SIZE ALPHABET_SIZE TRAN_DENSITY";
  echo "       ACC_DENSITY [ ROUNDS ]";
  echo "";
  echo "Perform containment tests and check if the counterexamples found";
  echo "are real counterexamples.";
  exit;
fi

$i = 1;
while true do

  echo "#" + $i + " ==> ";

  echo "  Generating automata.";
  $aut1 = generate -t fsa -a nbw -A classical -m density -s $size -n $props -dt $dt -da $da;
  $aut2 = generate -t fsa -a nbw -A classical -m density -s $size -n $props -dt $dt -da $da;

  echo "  Checking containment.";
  ($contained, $ce) = containment -m piterman $aut1 $aut2;
  echo "    Contained: " + $contained;
  echo "    Counterexample: " + $ce;

  if $ce != null then
    echo "  Verifying the counterexample.";
    echo -n "    Accepted in the first automaton: ";
    ($accepted1, $run1) = input $aut1 $ce;
    echo $accepted1;

    echo -n "    Accepted in the second automaton: ";
    ($accepted2, $run2) = input $aut2 $ce;
    echo $accepted2;

    if $accepted1 && !$accepted2 then
      echo "    Correct";
    else
      echo "    WRONG COUNTEREXAMPLE!";
      echo "    Saving the automata to ce1.gff and ce2.gff.";
      save $aut1 "ce1.gff";
      save $aut2 "ce2.gff";
      exit;
    fi
  fi

  $i = $i + 1;
  if $rounds != null && $i >= $rounds then
    break;
  fi
done
