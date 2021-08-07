#pedir un nombre y un apellido y mostrarlos
"""nombre = input('Cual es tu nombre?: ')
apellido = input(f"Muy bien {nombre}, Cual es tu apellido?: ")
#nombreCompleto = nombre + apellido
print("Su nombre completo es:", nombre, apellido)
edad = int(input("Tu edad: "))
print("Genial {} {} tu edad es".format(nombre, apellido), edad)
"""

#Pedir dos numeros y ver si uno es divisible por el otro 
"""num1 = int(input("Ingrese un numero: "))
num2 = int(input("Ingrese un numero: "))

if(num1%num2 == 0 ):
    print('El numero {} es divisible por {} :)'.format(num1, num2))
else:
    print('El numero {} no es divisible por {} :('.format(num1, num2))
    """

#Leer tres números enteros y determinar si con ellos se puede construir un triángulo o no.
cateto1 = int(input("Ingrese el primer cateto: "))
cateto2 = int(input("Ingrese el segundo cateto: "))
hipotenusa = int(input("Ingrese la hipotenusa: "))

if(cateto1**2 + cateto2**2 == hipotenusa**2 or cateto2**2 + cateto1**2 == hipotenusa**2 or cateto1 == cateto2 == hipotenusa):
    print(f"Se puede contruir un triangulo con los valores {cateto1, cateto2, hipotenusa} :)")
else:
    print(f"NO se puede contruir un triangulo con los valores {cateto1, cateto2, hipotenusa} :(")