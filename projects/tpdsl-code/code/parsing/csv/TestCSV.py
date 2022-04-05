import sys
import antlr3
from CSVLexer import CSVLexer
from CSVParser import CSVParser

cStream = antlr3.StringStream(sys.stdin.read()) # create char stream
lexer = CSVLexer(cStream)                       # lexer feeds off chars
tStream = antlr3.CommonTokenStream(lexer)       # buffer up tokens
parser = CSVParser(tStream)                     # parser feeds off tokens
parser.file()                                   # begin parse w/rule file
