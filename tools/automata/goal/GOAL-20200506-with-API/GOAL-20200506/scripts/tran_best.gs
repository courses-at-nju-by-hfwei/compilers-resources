# Description:
#   This script finds from several translation algorithms
#   the best result after applying simulation simplification.
#
# Author: Ming-Hsien Tsai <mhtsai208@gmail.com>

$file = $1;
if $file == "" then
  echo "Usage: goal batch tran_best.gs FILE";
  echo "";
  echo "FILE  a file containing QPTL formulae";
  exit;
fi

$falgs = "inctableau gpvw gpvw+ ltl2aut ltl2aut+
          ltl2ba pltl2ba couvreur ltl2buchi ltl2buchi+";
$palgs = "inctableau gpvw ltl2aut ltl2aut+ pltl2ba";

$index = 1;
$formulae = readline $file;
for $formula in $formulae do
  echo "#" + $index + ": " + $formula;

  # Check if the formula is a past formula.
  $p = qptl -p $formula;
  if $p then
    $algs = $palgs;
  else
    $algs = $falgs;
  fi

  # Initialize the best result;
  $bo = null;
  $bs = 0;
  $bt = 0;
  
  # Translate the formula.
  for $alg in $algs do
    echo -n "  Translating by " + $alg + ": ";
    $o = translate -m $alg $formula;
    $o = simplify $o;
    ($s, $t) = stat $o;
    echo $s + ", " + $t;
    if (($s < $bs || $bs == 0) || ($s == $bs && $t < $bt)) then
      $bo = $o;
      $bs = $s;
      $bt = $t;
    fi
  done
  echo "  Best: " + $bs + ", " + $bt;
  $index = $index + 1;
done
