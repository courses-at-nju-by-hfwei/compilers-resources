#!./goal batch

if $1 == "-help" || $1 == "--help" || $1 == "-h" then
  echo "Usage: sdbw.gs [ PROP_SIZE N_SIZE D_SIZE C_SIZE N_TRAN_DENSITY
         C_TRAN_PROBABILITY D_ACC_DENSITY ]";
  exit;
fi

echo "Check the correctness of the complementation construction for SDBW.";
echo;

$prop_size = $1;
$n_size = $2;
$d_size = $3;
$c_size = $4;
$n_dt = $5;
$c_pt = $6;
$d_da = $7;
if $prop_size == null then
  $prop_size = 2;
fi
if $n_size == null then
  $n_size = 2;
fi
if $d_size == null then
  $d_size = 2;
fi
if $c_size == null then
  $c_size = 1;
fi
if $n_dt == null then
  $n_dt = 1.0;
fi
if $c_pt == null then
  $c_pt = 0.3;
fi
if $d_da == null then
  $d_da = 0.5;
fi

$count = 0;
$eq = 1;
$ss1 = 0;
$tt1 = 0;
$ss2 = 0;
$tt2 = 0;
while $eq do
  echo "#" + $count + ": ";
  echo -n "  Generating an SDBW: ";
  $o = generate -t sdbw -A classical -m density -n $prop_size -ns $n_size -ds $d_size -cs $c_size -cps $c_pt -ndt $n_dt -dda $d_da -r;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;

  $o = simplify -m fair -ru -rd $o;
  ($s, $t) = stat $o;
  echo "  Simplified: " + $s + ", " + $t;
  
  echo -n "  Complementing by Safra-Piterman: ";
  $o1 = complement -m piterman -macc -sim -eq -r $o;
#  $o1 = complement -m sdbw -r $o;
  ($s, $t) = stat $o1;
  $ss1 = $ss1 + $s;
  $tt1 = $tt1 + $t;
  echo $s + ", " + $t + " (" + $ss1 + ", " + $tt1 + ")";
  
  echo -n "  Complementing by SDBW construction: ";
  $o2 = complement -m sdbw -a -r $o;
  ($s, $t) = stat $o2;
  $ss2 = $ss2 + $s;
  $tt2 = $tt2 + $t;
  echo $s + ", " + $t + " (" + $ss2 + ", " + $tt2 + ")";
  
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
