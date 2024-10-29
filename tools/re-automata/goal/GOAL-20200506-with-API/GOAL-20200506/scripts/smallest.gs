$formula = $1;
$file = $2;

$algs = "ltl2ba couvreur ltl2buchi";
$min = null;
$min_s = 0;
$min_t = 0;

echo "Translating " + $formula + ": ";
for $alg in $algs do
  echo -n "  by " + $alg + ": ";
  $o = translate -m $alg -art -rbm $formula;
  $o = simplify $o;
  $o = simplify -m fair $o;
  ($s, $t) = stat $o;
  echo $s + ", " + $t;
  if $min == null || $s < $min_s || $s == $min_s && $t < $min_t then
    $min = $o;
    $min_s = $s;
    $min_t = $t;
  fi
done

if $file == null then
  echo "The smallest automaton is:";
  echo $min;
else
  save $min $file;
  echo "Saved the automaton to the file " + $file + ".";
fi
