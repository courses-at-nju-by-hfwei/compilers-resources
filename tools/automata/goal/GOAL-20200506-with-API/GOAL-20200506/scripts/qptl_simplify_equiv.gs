#!./goal batch

if $1 == null || $2 == null then
  echo "Usage: simplify_equiv.gs FORMULA_LENGTH PROP_SIZE";
  exit;
fi

echo "Check the correctness of the formula simplification.";
echo;

$formula_length = $1;
$prop_size = $2;

$count = 0;
$eq = 1;
while $eq do
  echo -n "#" + $count + ": ";
  $f = generate -t qptl -l $formula_length -n $prop_size -w 1 1 0;
  echo -n $f + " => ";

  $g = simplify $f;
  echo $g;

  $a1 = translate -m ltl2ba $f;
  $a2 = translate -m ltl2ba $g;

  $eq = equivalence $a1 $a2;

  if ! $eq then
    echo "Not Equivalent!";
    exit;
  fi

  $count = $count + 1;
done
