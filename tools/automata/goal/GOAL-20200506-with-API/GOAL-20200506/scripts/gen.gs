#!./goal batch

$size = $1;
$props = $2;
$num = $3;
$basedir = $4;

if $size == null || $props == null || $num == null || $basedir == null then
  echo "Usage: gen.gs STATE_SIZE ALPHABET_SIZE NUM_AUTOMATA BASEDIR";
  exit;
fi

$dts = "1.0 1.2 1.4 1.6 1.8 2.0 2.2 2.4 2.6 2.8 3.0";
$das = "0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0";

for $dt in $dts do
  for $da in $das do
    for $i in `seq 1 $num` do
      $file = $basedir +  "/aut-" + $size + "-" + $props + "-" + $dt + "-" + $da + "-" + $i + ".gff";
      echo "Generating " + $file;
      $o = generate -t fsa -a nbw -A classical -m density -s $size -n $props -dt $dt -da $da;
      save $o $file;
    done
  done
done
