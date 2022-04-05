#!./goal batch

if $1 == "" then
  echo "Usage: translation_equiv_simple.gs ALGORITHM [
         PROP_SIZE FORMULA_LENGTH WEIGHT_BOOL WEIGHT_FUTURE WEIGHT_PAST ]";
  exit;
fi

echo "Check the correctness of a translation algorithm.";
echo;

$alg = $1;
$prop = $2;
$len = $3;
$wb = $4;
$wf = $5;
$wp = $6;
if $prop == null || $len == null || $wb == null || $wf == null || $wp == null then
  $prop = 2;
  $len = 6;
  $wb = 1;
  $wf = 1;
  $wp = 0;
fi

$eq = 1;
$count = 0;
while $eq do
  $formula = generate -t qptl -of -n $prop -l $len -w $wb $wf $wp -of -mcp 1;
  echo "#" + $count + ": " + $formula;
  
  echo -n "  Translating + by " + $alg + ": ";
  $o1 = translate -m $alg $formula;
  ($s, $t) = stat $o1;
  echo "(" + $s + ", " + $t + ")";
  
  echo -n "  Translating - by " + $alg + ": ";
  $neg = "~(" + $formula + ")";
  $o2 = translate -m $alg $neg;
  ($s, $t) = stat $o2;
  echo "(" + $s + ", " + $t + ")";

  echo -n "  Taking intersection: ";
  $o = intersection $o1 $o2;
  ($s, $t) = stat $o;
  echo "(" + $s + ", " + $t + ")";

  echo -n "  Testing emptiness of the intersection: ";
  $emp = emptiness $o;
  echo $emp;
  
  if ! $emp then
    $eq = 0;
    echo "Counterexample found!";
    echo "";
    echo $formula;
  fi

  echo -n "  Testing emptiness of +: ";
  $emp1 = emptiness $o1;
  echo $emp1;

  echo -n "  Testing emptiness of -: ";
  $emp2 = emptiness $o2;
  echo $emp2;

  if $emp1 && $emp2 then
    $eq = 0;
    echo "Counterexample found!";
    echo "";
    echo $formula;
  fi

  $count = $count + 1;
done
