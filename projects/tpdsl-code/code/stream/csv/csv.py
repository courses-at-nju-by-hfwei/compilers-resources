import sys
for line in sys.stdin:               # for each line from stdin
    values = line.strip().split(',') # break into columns
    values = map(str.strip, values)  # strip whitespace around elements
    # process line or values; values[i] is ith column value
    print values                     # e.g., print columns as list
