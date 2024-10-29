#!./goal batch

if $1 == "-h" || $1 == "--help" then
  echo "Usage: reverse.gs [ STATE_SIZE PROP_SIZE TRAN_DENSITY ACC_DENSITY ]";
  exit;
fi

echo "Check the reverse of classic finite state automata.";
echo;

$state_size = $1;
$prop_size = $2;
$dt = $3;
$da = $4;
if $state_size == null || $prop_size == null || $dt == null || $da == null then
  $state_size = 4;
  $prop_size = 2;
  $dt = 1.0;
  $da = 0.5;
fi

$count = 0;
$eq = 1;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating an automaton: ";
  $o = generate -t fsa -a NFW -m density -s $state_size -n $prop_size -dt $dt -da $da -r;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;
  
  echo -n "  Reverse then complement: ";
  $o1 = reverse $o;
  $o1 = complement $o1;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;
  
  echo -n "  Complement then reverse: ";
  $o2 = complement $o;
  $o2 = reverse $o2;
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
done
