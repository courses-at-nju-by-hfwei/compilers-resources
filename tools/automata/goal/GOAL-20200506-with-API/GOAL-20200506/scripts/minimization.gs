#!./goal batch

procedure usage {
  echo "Check the correctness of the NFW minimization algorithm.";
  echo;
  echo "Usage: minimization.gs STATE_SIZE PROP_SIZE ACC_DENSITY [ ROUNDS ]";
  exit;
}

if $1 == "-h" || $1 == "--help" then
  call usage;
fi
if $1 == null || $2 == null || $3 == null then
  call usage;
fi

$state_size = $1;
$prop_size = $2;
$da = $3;
$rounds = $4;

$count = 0;
$eq = 1;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating an automaton: ";
  $o = generate -t fsa -a DFW -m density -s $state_size -n $prop_size -da $da;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Minimizing: ";
  $o1 = minimization $o;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Checking equivalence: ";
  $equiv = equivalence $o $o1;
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
