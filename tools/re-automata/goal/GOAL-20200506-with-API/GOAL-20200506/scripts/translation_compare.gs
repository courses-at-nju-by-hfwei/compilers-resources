#!./goal batch

if $# < 6 then
  echo "Usage: translation_compare ALG1 ALG2 ... ALGHn PROPS LEN WB WF WP";
  exit;
fi

$algorithms = "";
$ints = seq 0 ($# - 6);
for $i in $ints do
  $algorithms = $algorithms + $*[$i] + " ";
done
$props = $*[$# - 5];
$len = $*[$# - 4];
$wb = $*[$# - 3];
$wf = $*[$# - 2];
$wp = $*[$# - 1];

$count = 1;
while true do
  $formula = generate -t qptl -n $props -l $len -w $wb $wf $wp -of -mcp;

  echo "#" + $count + ": Translating " + $formula;

  for $alg in $algorithms do
    echo "  by " + $alg;
    $ti = time;
    $o = translate -m $alg $formula;
    $ti = time - $ti;
    ($s, $t) = stat $o;
    $tst[$alg] = $tst[$alg] + $s;
    $ttr[$alg] = $ttr[$alg] + $t;
    $tti[$alg] = $tti[$alg] + $ti;
    echo "    # of states: " + $s;
    echo "    # of transitions: " + $t;
    echo "    time: " + $ti;
  done

  echo "  ===== Summary =====";
  for $alg in $algorithms do
    echo "  " + $alg + ": States = " + $tst[$alg] + ", Trans = " + $ttr[$alg] + 
      ", Time = " + $tti[$alg];
  done

  $count = $count + 1;
done
