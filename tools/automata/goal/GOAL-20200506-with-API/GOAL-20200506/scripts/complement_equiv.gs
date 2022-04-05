#!./goal batch

procedure usage {
  echo "Check the correctness of a complementation algorithm.";
  echo;
  echo "Usage: complement_equiv.gs BASE_ALGORITHM BASE_OPTIONS TEST_ALGORITHM
         TEST_OPTIONS [ STATE_SIZE PROP_SIZE TRAN_DENSITY ACC_DENSITY ]
         [ ROUNDS ]";
  exit;
}

if $1 == null || $2 == null || $3 == null || $4 == null then
  call usage;
fi

$base_alg = $1;
$base_options = $2;
$test_alg = $3;
$test_options = $4;
$state_size = $5;
$prop_size = $6;
$dt = $7;
$da = $8;
$rounds = $9;
if $prop_size == null && $dt == null && $da == null then
  $rounds = $state_size;
  $state_size = null;
fi
if $state_size == null && $prop_size == null && $dt == null && $da == null then
  $state_size = 4;
  $prop_size = 2;
  $dt = 1.0;
  $da = 0.5;
elif $state_size == null || $prop_size == null || $dt == null || $da == null then
  call usage;
fi

$count = 0;
$eq = 1;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating an automaton: ";
  $o = generate -t fsa -a NBW -m density -s $state_size -n $prop_size -dt $dt -da $da -r -ms;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Complementing by " + $base_alg + ": ";
  $o1 = complement -m $base_alg --option $base_options $o;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Complementing by " + $test_alg + ": ";
  $o2 = complement -m $test_alg --option $test_options $o;
  ($s, $t) = stat $o2;
  echo $s + ", " + $t;

  echo -n "  Checking equivalence: ";
  $equiv = equivalence $o1 $o2;
  echo $equiv;

  if !$equiv then
    $eq = 0;
    echo "Counterexample found!";
    echo "";
    echo $o;
  fi

  $count = $count + 1;
  if $rounds != null && $count >= $rounds then
    break;
  fi
done
