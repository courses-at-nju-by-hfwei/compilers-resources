echo "Testing if two formulae are congruent.";

$f = $1;
$g = $2;

if $f == null || $g == null then
  echo "Usage: congruent.gs FORMULA FORMULA";
  exit;
fi

echo "Formula #1: " + $f;
echo "Formula #2: " + $g;

$h = "[]( (" + $f + ") --> (" + $g + ") )";

echo "->";

echo "  Translating";
$a = translate -m couvreur $h;

echo "  Complementing";
$a = complement -m piterman -macc -eq -sim $a;

echo "  Testing emptiness";
$res = emptiness $a;

if $res == true then
  echo "  Passed";
else
  echo "  Failed";
  exit;
fi

$h = "[]( (" + $f + ") <-- (" + $g + ") )";

echo "<-";

echo "  Translating";
$a = translate -m couvreur $h;

echo "  Complementing";
$a = complement -m piterman -macc -eq -sim $a;

echo "  Testing emptiness";
$res = emptiness $a;

if $res == true then
  echo "  Passed";
else
  echo "  Failed";
  exit;
fi
