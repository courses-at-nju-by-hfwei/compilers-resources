#!./goal batch

procedure usage {
  echo "Check the correctness of the translation of omega-regular expressions.";
  echo;
  echo "Usage: ore.gs STATE_SIZE SYMBOL_SIZE TRAN_DENSITY ACC_DENSITY [ ROUNDS ]";
  exit;
}

if $1 == "-h" || $1 == "--help" then
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
  echo -n "  Generating an NBW: ";
  $o = generate -t fsa -a NBW -A classical -m density -s $state_size -n $prop_size -dt $dt -da $da;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  echo -n "  Converting NBW -> ORE: ";
  $ore = convert -t ore $o;
  echo $ore;

  echo -n "  Translating ORE -> NBW: ";
  $o2 = translate ore -se -sa $ore;
  ($s, $t) = stat $o2;
  echo $s + ", " + $t;

  echo -n "  Checking equivalence: ";
  $equiv = equivalence $o $o2;
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
