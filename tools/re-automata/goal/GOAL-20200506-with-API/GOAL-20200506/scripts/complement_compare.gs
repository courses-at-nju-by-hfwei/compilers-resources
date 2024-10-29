#!./goal batch

procedure usage {
  echo "Compare complementation algorithms.";
  echo;
  echo "Usage: complement_compare.gs BASE_ALGORITHM BASE_OPTIONS
         TEST_ALGORITHM TEST_OPTIONS [ STATE_SIZE PROP_SIZE TRAN_DENSITY
         ACC_DENSITY ] [ ROUNDS ]";
  exit;
}


if $1 == null || $2 == null then
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

$st1 = 0;
$tr1 = 0;
$st2 = 0;
$tr2 = 0;
$st_diff_accum = 0;
$tr_diff_accum = 0;
$count = 0;
while true do
  echo "#" + $count + ": ";
  echo -n "  Generating an automaton: ";
  $o = generate -t fsa -a NBW -m density -s $state_size -n $prop_size -dt $dt -da $da -r -ms;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Complementing by " + $base_alg + ": ";
  $o1 = complement -m $base_alg --option $base_options $o;
  ($s1, $t1) = stat $o1;
  $st1 = $st1 + $s1;
  $tr1 = $tr1 + $t1;
  echo $s1 + ", " + $t1 + " (" + $st1 + ", " + $tr1 + ")";

  echo -n "  Complementing by " + $test_alg + ": ";
  $o2 = complement -m $test_alg --option $test_options $o;
  ($s2, $t2) = stat $o2;
  $st2 = $st2 + $s2;
  $tr2 = $tr2 + $t2;
  echo $s2 + ", " + $t2 + " (" + $st2 + ", " + $tr2 + ")";

  $st_diff = $s1 - $s2;
  $tr_diff = $t1 - $t2;
  $st_diff_accum = $st_diff_accum + $st_diff;
  $tr_diff_accum = $tr_diff_accum + $tr_diff;
  echo "  Diff: " + $st_diff + ", " + $tr_diff +
       " (" + $st_diff_accum + ", " + $tr_diff_accum + ")";

  $count = $count + 1;
  if $rounds != null && $count >= $rounds then
    break;
  fi
done
