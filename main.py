import sys
from antlr4 import *
from viperLexer import *


def main(argv):
    input_stream = FileStream(argv[1])

    lexer = viperLexer(input_stream)
    stream = CommonTokenStream(lexer)

    tk = lexer.nextToken()

    while tk.type != Token.EOF:
        print("token: " + str(tk.type) + " " + tk.text)
        tk = lexer.nextToken()


if __name__ == "__main__":
    main(sys.argv)
