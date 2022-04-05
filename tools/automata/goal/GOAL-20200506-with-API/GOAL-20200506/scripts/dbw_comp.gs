
# Test the complementation of DBW.

$ss = $1;
$ps = $2;
$da = $3;
$rounds = $4;

if $ss == null || $ps == null || $da == null then
  echo "dbw_comp.gs STATE_SIZE PROP_SIZE ACC_DENSITY [ ROUNDS ]";
  exit;
fi

$count = 0;
$ts1 = 0;
$tt1 = 0;
$ts2 = 0;
$tt2 = 0;
while true do
  $count = $count + 1;

  $o = generate -t fsa -a dbw -A propositional -m density -s $ss -n $ps -da $da;
  ($s, $t) = stat $o;
  echo "#" + $count + " (" + $s + ", " + $t + ") =>";

  $o1 = complement -m kurshan $o;
  ($s, $t) = stat $o1;
  $ts1 = $ts1 + $s;
  $tt1 = $tt1 + $t;
  echo "  by Kurshan: " + $s + ", " + $t + " (" + $ts1 + ", " + $tt1 + ")";

  $o2 = complement -m deterministic $o;
  $o2 = convert -t nbw $o2;
  ($s, $t) = stat $o2;
  $ts2 = $ts2 + $s;
  $tt2 = $tt2 + $t;
  echo "  DBW->DCW->NBW: " + $s + ", " + $t + " (" + $ts2 + ", " + $tt2 + ")";

  $eq = equivalence $o1 $o2;
  echo "  Equivalent: " + $eq;

  if !$eq then
    echo "  CE FOUND!";
    save $o "ce.gff";
    exit;
  fi
  if $rounds != null && $count >= $rounds then
    break;
  fi
done
