import sys
for line in sys.stdin:                # for each line from stdin
    if line.startswith('#'): continue # ignore comment lines
    values = line.strip().split(',')  # break into columns
    values = map(str.strip, values)   # strip whitespace around elements
    print values
