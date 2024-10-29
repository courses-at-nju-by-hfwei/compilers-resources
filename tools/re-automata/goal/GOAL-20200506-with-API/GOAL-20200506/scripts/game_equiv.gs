#!./goal batch

if $# < 9 then
  echo "Usage: game_equiv NUM SOLVER1 SOLVER2 ... SOLVERn ACC SIZE PROPS DT DA AS [ ROUNDS ]";
  echo;
  echo "NUM: number of solvers";
  echo "SOLVER1 SOLVER2 ... SOLVERn: at least two solvers are required.";
  echo "ACC: types of games, for example, npg (nondeterministic parity game).";
  echo "SIZE: the state size of generated games.";
  echo "PROPS: the number of symbols in the alphabet.";
  echo "DT: the transition density.";
  echo "DA: the acceptance density.";
  echo "AS: the number of acceptance sets.";
  exit;
fi

$num = $1;
$ints = seq 1 $num;
for $i in $ints do
  $algorithms = $algorithms + $*[$i] + " ";
done
$acc = $*[$num + 1];
$size = $*[$num + 2];
$props = $*[$num + 3];
$dt = $*[$num + 4];
$da = $*[$num + 5];
$as = $*[$num + 6];
if $# == $num + 8 then
  $rounds = $*[$num + 7];
fi

$players = "P0 P1";
$REGION = "WinningRegion";
$STRATEGY = "WinningStrategy";

$count = 0;
while true do
  $count = $count + 1;
  echo $count + " => ";

  $game = generate -t game -m density -A classical
          -a $acc -s $size -n $props -dt $dt -da $da -as $as;

  for $player in $players do
    $regions[$player] = null;
  done

  for $alg in $algorithms do
   echo -n "  " + $alg + ": ";
    $sol = solve -m $alg $game;
    for $player in $players do
      $region = $sol[$player][$REGION];
      echo -n "(" + $player + ": " + $region + ")";
      if $regions[$player] == null then
        $regions[$player] = $region;
      elif $regions[$player] != $region then
        echo;
        echo "Error Found!";
        echo "Counterexample:";
        echo $game;
        exit;
      fi
    done
    echo;
  done

  if $rounds != null && $count >= $rounds then
    break;
  fi
done
