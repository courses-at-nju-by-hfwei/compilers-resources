#!./goal batch

if $# < 4 then
  echo "Usage: parity SIZE PROPS DT AS [ ROUNDS ]";
  echo;
  echo "SIZE: the state size of generated games.";
  echo "PROPS: the number of atomic propositions.";
  echo "DT: the transition density.";
  echo "AS: the number of acceptance sets.";
  exit;
fi

$size = $1;
$props = $2;
$dt = $3;
$as = $4;
$rounds = $5;

$count = 0;
while true do
  echo -n $count + " => ";

  $aut = generate -t fsa -m density -A propositional
         -a npw -s $size -n $props -dt $dt -as $as;

  $aut2 = parity propagate $aut;
  $aut2 = parity compress $aut2;
  $aut2 = simplify -m rabinindex $aut2;

  $eq = equivalence $aut $aut2;
  echo $eq;

  if !$eq then
    echo "COUNTEREXAMPLE FOUND!";
    echo $aut;
    exit;
  fi

  $count = $count + 1;
  if $rounds != null && $count >= $rounds then
    break;
  fi
done
