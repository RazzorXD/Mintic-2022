#Mostrar un numero de cuatro digitos en una lista
from re import split
numero = input("Digite un numero de cuatro digitos: ")

resultado = split("", numero)

for n in resultado:
    print(n)

#Es una manera mas facil y basica
for num in "1024":
    print(num)