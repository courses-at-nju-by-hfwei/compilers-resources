$method1 = $1;
$method2 = $2;
$size = $3;
$props = $4;
$dt = $5;
$da = $6;
$rounds = $7;

if $method1 == null || $method2 == null || $size == null || $props == null || $dt == null || $da == null then
  echo "Usage: containment_equiv.gs METHOD1 METHOD2 STATE_SIZE ALPHABET_SIZE";
  echo "       TRAN_DENSITY ACC_DENSITY [ ROUNDS ]";
  echo "";
  echo "Perform containment tests by two methods and check if the results";
  echo "are consistent.";
  exit;
fi

$i = 1;
$tt1 = 0;
$ft1 = 0;
$tt2 = 0;
$ft2 = 0;
while true do

  echo "#" + $i + " ==>";

  echo "  Generating automata.";
  $aut1 = generate -t fsa -a nbw -A classical -m density -s $size -n $props -dt $dt -da $da;
  $aut2 = generate -t fsa -a nbw -A classical -m density -s $size -n $props -dt $dt -da $da;

  echo -n "  Checking containment by " + $method1 + ": ";
  $t1 = time;
  ($c1, $ce1) = containment -m $method1 $aut1 $aut2;
  $t2 = time;
  $t = $t2 - $t1;
  if $c1 then
    $tt1 = $tt1 + $t;
  else
    $ft1 = $ft1 + $t;
  fi
  echo $c1 + ", " + $t;

  echo -n "  Checking containment by " + $method2 + ": ";
  $t1 = time;
  ($c2, $ce2) = containment -m $method2 $aut1 $aut2;
  $t2 = time;
  $t = $t2 - $t1;
  if $c2 then
    $tt2 = $tt2 + $t;
  else
    $ft2 = $ft2 + $t;
  fi
  echo $c2 + ", " + $t;

  echo "  Accumulated True Time: " + $tt1 + ", " + $tt2;
  echo "  Accumulated False Time: " + $ft1 + ", " + $ft2;

  if ($c1 == $c2) then
    echo "  Consistent";
  else
    echo "  NOT CONSISTENT";
    echo "  Saving the automata to ce1.gff and ce2.gff.";
    save $aut1 "ce1.gff";
    save $aut2 "ce2.gff";
    exit;
  fi

  $i = $i + 1;
  if $rounds != null && $i >= $rounds then
    break;
  fi
done
