import sys
for line in sys.stdin:               # for each line from stdin
    values = line.strip().split(',') # break into columns
    values = map(str.strip, values)  # strip whitespace around elements
    if values[2]=="M":               # filter for males
        print line,                  # print that row (minus \n)
