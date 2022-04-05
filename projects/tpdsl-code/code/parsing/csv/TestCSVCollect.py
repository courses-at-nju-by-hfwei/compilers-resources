import sys
import antlr3
from CSVCollectLexer import CSVCollectLexer
from CSVCollectParser import CSVCollectParser

cStream = antlr3.StringStream(sys.stdin.read()) # create char stream
lexer = CSVCollectLexer(cStream)                # lexer feeds off chars
tStream = antlr3.CommonTokenStream(lexer)       # buffer up tokens
parser = CSVCollectParser(tStream)              # parser feeds off tokens
result = parser.file()                          # get list of dicts
print result
