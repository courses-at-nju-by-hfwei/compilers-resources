#
# Tokenize data like following:
# ID, FIRST_NAME, SEX, MAJOR, CITIZENSHIP
# "9578", "Mohammad \"Mo\"", "M", "PSY", "AE"
# "7277", "Javier \"Jay\"", "M", "ART", "PM"
#
# Really, the tokenize method should be in a Tokenizer
# class, but it is so unreadable with "self." in front of every
# field reference that I converted it back to plain function. blech!
#
import sys
from cStringIO import StringIO

EOF = "<EOF>"
sep = ','
quote = '"'
esc = '\\'
cmt = '#'

# START: Tokenizer
def tokenize(buf):
    tokens = []
    i = 0
    while i < len(buf):                 # for each char in stream buffer
	if buf[i]==' ':                 # skip whitespace
	    i = i + 1
	elif buf[i]==cmt:               # kill comment
	    while buf[i]!='\n':
		i = i + 1               # skip til \n
	    i = i + 1
	elif buf[i]==sep:               # found the column separator
	    i = i + 1
	    tokens.append(sep)
	elif buf[i]=='\n':
	    i = i + 1
	    tokens.append('\n')
	elif buf[i]==quote:
	    i = i + 1                   # consume initial '"'
	    field = StringIO()          # make buffer for field
	    while buf[i]!=quote:
		# For \", skip past \
		if buf[i]==esc and buf[i+1]==quote:
		    i = i + 1
		field.write(buf[i]) # append char to field
		i = i + 1
	    i = i + 1                   # consume final '"'
	    v = field.getvalue()
	    if v.isdigit(): v = int(v)  # attempt to convert to numeric
	    tokens.append(v)
	else:
            print "unexpected: "+buf[i] # give error message
            i = i + 1                   # recover: consuming char
    tokens.append(EOF)
    return tokens
# END: Tokenizer

# START: Parser
class Parser:
    def __init__(self,tokens):
        self.tokens = tokens;
        self.i = -1
        self.consume()        # prime pipe; get token

    def match(self, t):
        if self.token==t: self.consume(); return
        print "expecting "+t+" found "+str(self.token)
        self.consume()

    def consume(self):
        self.i = self.i + 1
        if self.i<len(tokens): self.token = self.tokens[self.i]
# END: Parser

# START: file
    def file(self): 
        """ file : header row+ EOF ; """
        columns = self.header()          # match header row, get column names
        rows = []
        while self.token != EOF:         # while not past last row
            values = self.row()          # match a row of data
            values = dict(zip(columns,values)) # dict from (name,value)
            rows.append(values)
        self.match(EOF)                  # consume last token: EOF
        return rows
# END: file

# START: header
    def header(self):
        """ header : row ; """
        return self.row()                # header row is like regular row
# END: header

# START: row
    def row(self):                       # parse element (',' element)* '\n'
        """ row : STRING (',' STRING)* '\n' ; """
        values = []
        values.append(self.token)        # match element
        self.consume()                   # skip over element
        while self.token == ',':         # match (',' element)*
            self.match(',')              # match the ','; skip to element
            values.append(self.token)    # add element to values list
            self.consume()               # skip past element
        self.match('\n')                 # make sure we terminate with \n
        return values
# END: row

# START: run
tokens = tokenize(sys.stdin.read())      # tokenize entire input file
parser = Parser(tokens)                  # parser feeds off of tokens
print parser.file()                      # go match all the data rows
# END: run
