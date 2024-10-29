#!./goal batch

if $# < 3 then
  echo "Usage: translation_compare_with_file ALG1 ... ALGn FILE";
fi

$algorithms = "";
$ints = seq 0 ($# - 2);
for $i in $ints do
  $algorithms = $algorithms + $*[$i] + " ";
done
$formulae = readline $*[$# - 1];

$count = 1;
for $formula in $formulae do
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
