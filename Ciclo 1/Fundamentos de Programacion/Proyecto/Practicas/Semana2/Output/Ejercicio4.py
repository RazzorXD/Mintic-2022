#Ingresar números enteros de manera indefinida, hasta que ingrese un número negativo, 
#y al final imprimir la suma de los números enteros pares sin incluir el número negativo en la suma.

suma = 0
while True:
    num = int(input("Ingrese un numero: "))
    if num < 0:
        break
    elif num > 0 and num%2 == 0:
        suma = num + suma
    
print("la suma de todos los pares es:", suma)