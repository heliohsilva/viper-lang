import sys
import re
from antlr4 import *
from viperLexer import *
from viperParser import *



def getTokenClass():
    with open("viper.tokens", "r") as f:
        idTokenFile = f.readlines()
        idTokenFile = ["" if x[0] == "'" else x for x in idTokenFile]

    classTK = []
    idTK = []

    for i in idTokenFile:
        if re.search(r"=", i):

            c, d = i.split("=")
            d.replace("\n", "")

            d = int(d)

            classTK.append(c)
            idTK.append(d)

    return classTK, idTK




def main(argv):
    
    
    # A api padrao do antlr para python nao possui nenhum metodo para pegar o a classe do token.
    # o mais proximo disso que ele consegue é o id daquela classe, que seria a "posicao" dela no array de tokens
    # para resolver isso, eu extrai do arquivo viper.tokens, gerado pelo antlr, essa informacao
    
    input_stream = FileStream(argv[1])

    lexer = viperLexer(input_stream)
    stream = CommonTokenStream(lexer)

    classTK, idTK = getTokenClass() 

    tk = lexer.nextToken()

    while tk.type != Token.EOF:
        tk = lexer.nextToken()

        if tk.type == Token.EOF:
            classe = "EOF"
        else:
            classe = classTK[int(idTK.index(tk.type))]
        lexema = tk.text

        print(f"Token: <Classe: {classe} , Lexema:  {lexema} >")
    
    
    #Imprimir a árvore sintática
    if len(argv) < 2:
        print("Usage: python main.py <input_file>")
        sys.exit(1)

    input_stream = FileStream(argv[1])

    lexer = viperLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = viperParser(stream)

    # Inicia a análise sintática
    tree = parser.program()  
    print(tree.toStringTree(recog=parser))

   
   

if __name__ == "__main__":
    main(sys.argv)
