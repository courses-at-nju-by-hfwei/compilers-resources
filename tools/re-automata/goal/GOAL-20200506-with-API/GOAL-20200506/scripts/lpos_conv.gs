#!./goal batch

procedure usage {
  echo "Check the correctness of the label position conversion.";
  echo;
  echo "Usage: lpos_conv.gs STATE_SIZE PROP_SIZE TRAN_DENSITY ACC_DENSITY [ ROUNDS ]";
  echo "";
  echo "STATE_SIZE: number of states";
  echo "PROP_SIZE: number of atomic propositions";
  echo "TRAN_DENSITY: transition density";
  echo "ACC_DENSITY: acceptance density";
  exit;
}

if $1 == "help" || $1 == "-h" || $1 == "--help" then
  call usage;
fi
if $1 == null || $2 == null || $3 == null || $4 == null then
  call usage;
fi

$state_size = $1;
$prop_size = $2;
$dt = $3;
$da = $4;
$rounds = $5;

$count = 0;
$eq = 1;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating an automaton: ";
  $o = generate -t fsa -a NBW -m density -s $state_size -n $prop_size -dt $dt -da $da -r;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Convert to label-on-state: ";
  $o1 = convert -t losnbw $o;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Convert to label-on-transition: ";
  $o2 = convert -t nbw $o1;
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
