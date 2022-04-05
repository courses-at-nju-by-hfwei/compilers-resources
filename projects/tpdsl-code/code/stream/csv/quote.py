import sys
# START: hdr
header = sys.stdin.readline()         # read first line
header = header.replace('"','')       # remove quotes around column names
columns = header.strip().split(',')
columns = map(str.strip, columns)     # strip whitespace from column names
# END: hdr

# split "9578", "Mohammad \"Mo\"", "M", "PSY,MTH", "AE" into list
# convert strings of digits into numeric values
# START: split
def split(line,sep,quote,esc):
    cols = []
    from cStringIO import StringIO
    field = StringIO()                  # make buffer for field
    i = 0
    while i < len(line):                # while more characters to process
        if line[i]==' ':                # ignore whitespace
            i = i + 1
            continue 
        if line[i]==sep:                # found the column separator
            v = field.getvalue()
            if v.isdigit(): v = int(v)  # attempt to convert to numeric
            cols.append(v)
            field = StringIO()          # reset buffer
            i = i + 1
            continue
        if line[i]==quote:
            i = i + 1                   # consume initial '"'
            while line[i]!=quote:
                # For \", skip past \
                if line[i]==esc and line[i+1]==quote: i = i + 1
                field.write(line[i])    # append char to field
                i = i + 1
            i = i + 1                   # consume final '"'
    return cols
# END: split

# get all row dictionaries into a list
def getrows(stream):
    rows = []
    for line in stream:
	values = split(line.strip(),',','"','\\')
	cols = dict(zip(columns,values)) # dict from (name,value) pairs
        rows.append(cols)
    return rows
# END: getrows

rows = getrows(sys.stdin)
print rows
