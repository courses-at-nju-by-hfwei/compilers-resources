# This is a script which tests the conversion of NBW to SDBW.

$CE = "test_sdbw_conv_ce.gff";

$max = $1;

$count = 0;
$eq = true;
while $eq do
  $count = $count + 1;

  $states = generate -t int 3 6;
  $props = 2;
  $dt = generate -t float 1.0 3.0;
  $da = generate -t float 0 1;

  $a = generate -t fsa -a nbw -A classical -m density -s
       $states -n $props -dt $dt -da $da;
  $a = reduce $a;
  ($s, $t) = stat $a;
  echo "#" + $count + ":";
  echo "  Size: " + $s + ", " + $t;

  $o = convert -t sdbw $a;
  ($s, $t) = stat $o;
  echo "  SDBW: " + $s + ", " + $t;

  $empty1 = null;
  $empty2 = null;

  echo -n "  NBW contains SDBW: ";
  $ca = complement -m piterman -r -macc -sim -eq $a;
  $prod = intersection $ca $o;
  $empty1 = emptiness $prod;
  echo $empty1;

  if $empty1 then
    echo -n "  SDBW contains NBW: ";
    $co = complement -m sdbw -a -r $o;
    $prod = intersection $a $co;
    $empty2 = emptiness $prod;
    echo $empty2;
  fi

  $eq = $empty1 && ($empty2 == null || $empty2);
  echo "  Equivalence: " + $eq;

  if !$eq then
    echo "Counterexample is found and saved in " + $CE;
    save $a $CE;
  fi

  if $max != null && $count >= $max then
    echo "Finished";
    break;
  fi
done
