#!./goal batch

if $1 == "" then
  echo "Usage: simplify_equiv.gs ALGORITHM [ FORMULA_LENGTH PROP_SIZE ]";
  exit;
fi

echo "Check the correctness of a simplification algorithm.";
echo;

$alg = $1;
$formula_length = $2;
$prop_size = $3;
if $formula_length == null || $prop_size == null then
  $formula_length = 5;
  $prop_size = 2;
fi

$count1 = 0;
$count2 = 0;
$eq = 1;
while $eq do
  echo "#(" + $count1 + "," + $count2 + "): ";
  echo -n "  Generating a formula: ";
  $f = generate -t qptl -l $formula_length -n $prop_size -w 1 2 0;
  echo -n $f + ": ";

  $o = translate -m ltl2aut $f;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;
  
  echo -n "  Simplify by " + $alg + ": ";
  $o1 = simplify -m $alg $o;
  ($s1, $t1) = stat $o1;
  echo $s1 + ", " + $t1;

  if $s1 < $s then
    $count1 = $count1 + 1;  
  fi
  if $t1 < $t then
    $count2 = $count2 + 1;
  fi

  if $s1 < $s || $t1 < $t then 
    echo -n "  Checking equivalence: ";
    $equiv = equivalence $o $o1;
    echo $equiv;

    if !$equiv then
      $eq = 0;
      echo "Counterexample found!";
      echo "";
      echo $o;
    fi
  fi
done
