
$method = $1;
$size = $2;
$props = $3;
$dt = $4;
$da = $5;
$rounds = $6;

if $method == null || $size == null || $props == null || $dt == null || $da == null then
  echo "Usage: determinization_equiv.gs METHOD STATE_SIZE PROP_SIZE TRAN_DENSITY";
  echo "       ACC_DENSITY [ ROUNDS ]";
  echo "";
  echo "Check if the output of a determinization algorithm for NBW is equivalent to its input.";
  exit;
fi

$i = 1;
while true do

  echo "#" + $i + " ==>";
  $o = generate -t fsa -a nbw -n $props -s $size -m density -dt $dt -da $da;

  ($s, $t) = stat $o;
  echo "  Input: (" + $s + ", " + $t + ")";

  echo -n "  Determinizing by " + $method + ": ";
  $d = determinization -m $method $o;
  ($s, $t) = stat $d;
  $ts1 = $ts1 + $s;
  echo "(" + $s + ", " + $t + ")";

  echo -n "  Checking Equivalence: ";
  $eq = equivalence $o $d;
  echo $eq;

  if !$eq then
    echo "  Saving the counterexample to ce.gff";
    save $o "ce.gff";
    exit;
  fi

  $i = $i + 1;
  if $rounds != null && $i >= $rounds then
    break;
  fi
done
