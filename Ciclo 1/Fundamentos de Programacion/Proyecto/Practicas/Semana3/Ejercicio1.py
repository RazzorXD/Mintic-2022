#Funcion mostrar (altura) para mostrar la escalera de numeros iguales
#1
#22
#333
"""
def mostrar (altura):
    if altura > 0:
        for i in range(1, altura + 1):
            for j in range(1, i + 1):
                print(i, end = "")
            print("")
    else:
        print('El numero no se puede mostrar')

altura = int(input('Ingrese un numero entero: '))
mostrar(altura)
"""
#Funcion palindromo (word) para mostrar True si es o False si no

def palindromo(word):
    """
    Funcion palindromo (word) para mostrar True si es o False si no
    """
    reverso = ''
    for caracter in reversed(word):
        reverso = reverso + caracter
    if reverso == word:
        print(True)
    else:
        print(False)

word = input('Ingrese una palabra: ')
palindromo(word)