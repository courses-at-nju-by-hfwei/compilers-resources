#!./goal batch

procedure usage {
  echo "Check the correctness of the conversion to DCW.";
  echo;
  echo "Usage: dcw_conv.gs STATE_SIZE PROP_SIZE TRAN_DENSITY ACC_DENSITY [ ROUNDS ]";
  exit;
}

if $1 == "-h" || $1 == "--help" then
  call usage;
fi

$size = $1;
$props = $2;
$dt = $3;
$da = $4;
$rounds = $5;

if $size == null || $props == null || $dt == null || $da == null then
  call usage;
fi

$count = 0;
$eq = 1;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating a Buchi automaton: ";
  $o = generate -t fsa -a NBW -s $size -m density -n $props -dt $dt -da $da;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Converting NBW -> DCW: ";
  $o1 = convert -t DCW $o;
  ($s, $t) = stat $o1;
  echo $s + ", " + $t;

  echo -n "  Checking if NBW contains DCW: ";
  ($equiv, $ce) = containment $o1 $o;
  echo $equiv;

  if !$equiv then
    echo -n "  Checking if DCW contains NBW: ";
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
