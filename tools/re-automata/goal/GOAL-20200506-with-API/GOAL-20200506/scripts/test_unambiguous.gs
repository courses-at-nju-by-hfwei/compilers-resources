# This is a script which checks if the results of unambiguous tests
# produced by GOAL and Spot coincide.

$TMP = "/tmp";
$AUTFILT = "autfilt";
$CE = "test_unambiguous_ce.gff";

$FILE = $TMP + "/test_unambiguous.hoa";

$max = $1;

$count = 0;
$eq = true;
while $eq do
  $count = $count + 1;

  $states = generate -t int 3 10;
  $props = generate -t int 1 2;
  $dt = generate -t float 1.0 3.0;
  $da = generate -t float 0 1;

  $a = generate -t fsa -a nbw -A propositional -m density -s
       $states -n $props -dt $dt -da $da;
  $a = reduce $a;
  ($s, $t) = stat $a;
  echo "#" + $count + ":";
  echo "  Size: " + $s + ", " + $t;

  $u1 = unambiguous $a;
  echo "  GOAL: " + $u1;

  save -c HOAF $a $FILE;
  $u2 = `${AUTFILT} --count --is-unambiguous ${FILE}` == 1;
  echo "  Spot: " + $u2;

  $eq = $u1 == $u2;
  if !$eq then
    echo "Counterexample is found and saved in " + $CE;
    save $a $CE;
  fi

  if $max != null && $count >= $max then
    echo "Finished";
    break;
  fi
done
