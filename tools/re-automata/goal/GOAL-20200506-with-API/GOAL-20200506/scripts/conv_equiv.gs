#!./goal batch

echo "Check the correctness of some conversions.";
echo;

$state_size = 4;
$prop_size = 2;
$pt = 0.3;
$ps = 0.5;
$pa = 0.5;
$as = 4;
$count = 0;
$eq = 1;
$rounds = $1;

while $eq do

  echo "#" + $count + ": ";
  echo -n "  Generating a parity automaton: ";
  $o = generate -t fsa -a NPW -s $state_size -n $prop_size -pt $pt -ps $ps -pa $pa -as $as -r;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Converting NPW -> NBW: ";
  $o1 = convert -t NBW $o;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Converting NPW -> NRW -> NBW: ";
  $o2 = convert -t NRW $o;
  $o2 = convert -t NBW $o2;
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
