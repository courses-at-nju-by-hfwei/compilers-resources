if $1 == "" then
  echo "Usage: translation_equiv.gs ALGORITHM [
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
  $formula = generate -t qptl -spin -of -n $prop -l $len -w $wb $wf $wp 1;
  echo "#" + $count + ": " + $formula;

  echo -n "  Translating by " + $alg + ": ";
  $o1 = translate -m $alg $formula;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Translating by SPIN: ";
  $formula = echo -spin $formula;
  $res = `spin -f "${formula}"`;
  import -c Promela $o2 $res;
  ($s, $t) = stat $o2;
  echo $s + ", " + $t;

  $eq = equivalence $o1 $o2;
  if ! $eq then
    echo;
    echo "Not Equivalent!!!";
    echo "SPIN:";
    echo $res;
  fi

  $count = $count + 1;
done
