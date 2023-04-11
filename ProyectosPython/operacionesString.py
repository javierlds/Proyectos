def buscarLetra(cadena, letraBusca):
    contador = 0
    for letra in cadena:
        if letraBusca == letra:
            contador +=1
    return contador

def contarVocales(cadena):
    texto = cadena.lower()
    listaVocales = {}
    contador = 0
    for vocal in "aeiou":
        conteo = texto.count(vocal)
        listaVocales[vocal] = conteo
    print("Total vocales en texto: " + str(listaVocales))
    
def contarDifVocales(cadena):
    texto = cadena.lower()
    listaPalabras ={}    
    contador = 0
    for letra in texto:
        if letra not in "aeiou" :
            listaPalabras[letra] = texto.count(letra)
       
    print("Conteo de no vocales: " + str(listaPalabras))

def menu():
    opcion = input('''
                   1-> Buscar letras
                   2-> Contar vocales de una cadena de texto
                   3-> Contar de una cadena las letras que no son vocales
                   4-> Cambiar cadena a mayuscula
                   5-> Cambiar cadena a minuscula
                   6-> Primera letra en mayuscula
                   7-> Eliminar espacios
                   ''' )

if __name__ == "__main__":
#    menu()
    cadena = input("Indique la cadena de texto a utilizar: ")
    letra = input("Indique la letra que desea buscar: ")
    totalLetras = buscarLetra(cadena, letra)
    print("numero total de letras: (" + letra +  ")-> es: " + str(totalLetras))
    print(f"numero total de letras: ({letra}) es {totalLetras}")
    contarVocales(cadena)
    contarDifVocales(cadena)