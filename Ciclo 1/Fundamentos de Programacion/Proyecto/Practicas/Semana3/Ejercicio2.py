import operaciones

num1 = int(input('Ingrese un numero entero mayor que cero: '))      
num2 = int(input('Ingrese otro numero entero mayor que cero: '))    

#MCD Maximo Comun Divisor
resulMCD = operaciones.max_com_div(num1, num2)
print(f'\nEl numero {resulMCD} es maximo comun divisor de {num1} y {num2}')

#MCM Minimo Comun Multiplo
resulMCM = operaciones.min_com_mul(num1, num2)
print(f'El numero {resulMCM} es minimo comun multiplo de {num1} y {num2}\n')

#Evaluar si el numero es primo
num1_esPrimo = operaciones.es_primo(num1)
num2_esPrimo = operaciones.es_primo(num2)
print(f'El numero {num1} es primo:', num1_esPrimo)
print(f'El numero {num2} es primo:', num2_esPrimo)

#digito con el que comienza cada uno de ellos
letra1, letra2 = operaciones.primer_digito(num1, num2)

print(f'\nEl primer digito de {num1} es {letra1} y de {num2} es {letra2}')