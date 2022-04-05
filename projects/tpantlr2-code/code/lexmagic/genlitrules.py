import sys
import re
i = 1
matcher = re.compile("('.*')")
for line in sys.stdin.readlines():
     print "LIT_%d : %s ;" % (i,matcher.match(line).group())
     i += 1
