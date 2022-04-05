#!./goal batch

procedure usage {
  echo "Check the correctness of a translation algorithm.";
  echo;
  echo "Usage: translation_equiv.gs BASE_ALGORITHM BASE_OPTIONS
         TEST_ALGORITHM TEST_OPTIONS [ PROP_SIZE FORMULA_LENGTH
         WEIGHT_BOOL WEIGHT_FUTURE WEIGHT_PAST ] [ ROUNDS ]";
  exit;
}

if $1 == null || $2 == null || $3 == null || $4 == null then
  call usage;
fi

$base_alg = $1;
$base_options = $2;
$test_alg = $3;
$test_options = $4;
$prop = $5;
$len = $6;
$wb = $7;
$wf = $8;
$wp = $9;
$rounds = $10;
if $len == null && $wb == null && $wf == null && $wp == null then
  $rounds = $prop;
  $prop = null;
fi
if $prop == null && $len == null && $wb == null && $wf == null && $wp == null then
  $prop = 2;
  $len = 6;
  $wb = 1;
  $wf = 1;
  $wp = 0;
elif $prop == null || $len == null || $wb == null || $wf == null || $wp == null then
  call usage;
fi

$eq = 1;
$count = 0;
while $eq do
  $formula = generate -t qptl -of -n $prop -l $len -w $wb $wf $wp -of -mcp 1;
  echo "#" + $count + ": " + $formula;

  echo "  Translating by " + $base_alg;
  $o1 = translate -m $base_alg $formula;

  echo "  Translating by " + $test_alg;
  $o2 = translate -m $test_alg $formula;

  echo -n "  Checking equivalence: ";
  $equiv = equivalence $o1 $o2;
  echo $equiv;

  if ! $equiv then
    $eq = 0;
    echo "Counterexample found!";
    echo "";
    echo $formula;
  fi

  $count = $count + 1;
  if $rounds != null && $count >= $rounds then
    break;
  fi
done
