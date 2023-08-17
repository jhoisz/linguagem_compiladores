from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker
from gen.LanguageLexer import LanguageLexer
from gen.LanguageListener import LanguageListener
from gen.LanguageParser import LanguageParser


def main(stream):
    input_stream = InputStream(stream)
    lexer = LanguageLexer(input_stream)
        
    tokens = CommonTokenStream(lexer)
    parser = LanguageParser(tokens)

    tree = parser.prog()
    walker = ParseTreeWalker()
    l = LanguageListener()
    walker.walk(l, tree)


if __name__ == '__main__':
    with open('input.txt', 'r') as f:
        stream = f.read()
    main(stream)