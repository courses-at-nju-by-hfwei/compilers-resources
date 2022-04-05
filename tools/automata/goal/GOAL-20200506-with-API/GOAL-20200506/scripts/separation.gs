$alg1 = $1;
$alg2 = $2;
$props = $3;
$len = $4;
$wb = $5;
$wf = $6;
$wp = $7;

if $alg1 == null || $alg2 == null || $props == null || $len == null ||
   $wb == null || $wf == null || $wp == null then
  echo "Usage: separation ALG1 ALG2 PROPS LEN WB WF WP";
  echo "";
  echo "ALG1: the algorithm to be used in translating the input formulae with past";
  echo "      operators.";
  echo "ALG2: the algorithm to be used in translating the separated future formulae";
  echo "PROPS: the number of atomic propositions in the randomly generated formulae";
  echo "LEN: the length of the randomly generated formulae.";
  echo "WB: the weight of boolean operators in the random formulae generation.";
  echo "WF: the weight of future operators in the random formulae generation.";
  echo "WP: the weight of past operators in the random formulae generation.";
  exit;
fi

$count = 0;
$tsf = 0;
$ttf = 0;
$tsg = 0;
$ttg = 0;

while true do
  $count += 1;

  $f = generate -t qptl -n $props -l $len -w $wb $wf $wp -mcp -of;

  echo "#" + $count + ": ";
  echo "  Formula: " + $f;

  $g = separation -e $f;
  echo "  Equivalent Future Formula: " + $g;

  echo -n "  Translating the input formula: ";
  $af = translate -m $alg1 $f;
  ($sf, $tf) = stat $af;
  $tsf += $sf;
  $ttf += $tf;
  echo "(" + $sf + ", " + $tf + ")" + " (" + $tsf + ", " + $ttf + ")";

  echo -n "  Translating the future formula: ";
  $ag = translate -m $alg2 $g;
  ($sg, $tg) = stat $ag;
  $tsg += $sg;
  $ttg += $tg;
  echo "(" + $sg + ", " + $tg + ")" + " (" + $tsg + ", " + $ttg + ")";

  echo -n "  Testing equivalence: ";
  $eq = equivalence $af $ag;

  if $eq == true then
    echo "Yes";
  else
    echo "No";
    break;
  fi

done
