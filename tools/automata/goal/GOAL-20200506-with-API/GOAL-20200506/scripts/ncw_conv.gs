#!./goal batch

procedure usage {
  echo "Check the correctness of the conversion to NCW.";
  echo;
  echo "Usage: ncw_conv.gs STATE_SIZE PROP_SIZE TRAN_DENSITY ACC_DENSITY [ ROUNDS ]";
  exit;
}

if $1 == "-h" || $1 == "--help" then
  call usage;
fi

if $1 == null || $2 == null || $3 == null || $4 == null then
  call usage;
fi

$size = $1;
$props = $2;
$dt = $3;
$da = $4;
$rounds = $5;

$count = 0;
$eq = 1;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating a Buchi automaton: ";
  $o = generate -t fsa -a NBW -s $size -m density -n $props -dt $dt -da $da;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Converting NBW -> NCW: ";
  $o1 = convert -t NCW $o;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Checking equivalence: ";
  $equiv = equivalence $o $o1;
  echo $equiv;

  if !$equiv then
    echo -n "  Checking containment: ";
    ($equiv, $ce) = containment $o $o1;
    echo $equiv;
  fi

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
