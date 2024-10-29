#!./goal batch

if $1 == "" || $2 == "" || $3 == "" then
  echo "Usage: translation_equiv.gs BASE_ALGORITHM TEST_ALGORITHM FILE";
  exit;
fi

echo "Check the correctness of a translation algorithm.";
echo;

$base_alg = $1;
$test_alg = $2;
$file = $3;
$formulae = readline $file;

$eq = 1;
$count = 0;
for $formula in $formulae do
  echo "#" + $count + ": " + $formula;
  
  echo "  Translating by " + $base_alg;
  $o1 = translate -m $base_alg $formula;
  
  echo "  Translating by " + $test_alg;
  $o2 = translate -m $test_alg $formula;

  echo -n "  Checking equivalence: ";
  $equiv = equivalence $o1 $o2;
  echo $equiv;
  
  if ! $equiv then
    $eq = 0;
    echo "Counterexample found!";
    echo "";
    echo $formula;
    exit;
  fi

  $count = $count + 1;
done
