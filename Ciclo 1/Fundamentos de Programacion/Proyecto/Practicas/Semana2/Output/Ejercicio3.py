#Mostrar la suma, resta, multi, divi, mod de dos numero enteros (primero por el segundo)
num1 = int(input("Ingrese el primer numero entero: "))
num2 = int(input("Ingrese el segundo numero entero: "))

print(f"\nLa suma es: {num1} + {num2} =", num1 + num2)
print(f"La resta es: {num1} - {num2} =", num1 - num2)
print(f"La maultiplicación es: {num1} x {num2} =", num1 * num2)
if num2!= 0:
    print(f"La división es: {num1} / {num2} =", num1 / num2)
    print(f"El módulo es: {num1} % {num2} =", num1 % num2)
else:
    print("No se puede dividir entre cero (0). La división y módulo no existen.")
    
#Este fue el que me acepto Moodle
"""
num1 = int(input("Ingrese el primer numero entero: "))
num2 = int(input("Ingrese el segundo numero entero: "))

print(num1 + num2)
print(num1 - num2)
print(num1 * num2)
if num2!=0:
    print(num1 / num2)
    print(num1 % num2)
else:
    print("La división y módulo entre cero (0) no se puede.")
    """