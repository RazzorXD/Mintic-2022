nombre = input("entre su nombre ")

estadoCivil = int(input(f"{nombre} entre su estado civil "))

edad = int(input(f"{nombre} entre su edad "))

salario = int(input(f"{nombre} entre su salario "))

if   estadoCivil == 1:

            desc = "Soltero"

            if edad < 30:

                pau = 0.10

            else:
                pau = 0.12

elif estadoCivil == 2:

            desc = "Casado"

            if edad < 25:

                pau = 0.12

            else:
                pau = 0.15

elif   estadoCivil == 3:

            desc = "Separado"

            if edad < 20:

                pau = 0.08

            else:

                pau = 0.10

elif    estadoCivil == 4:

            desc = "Viudo"

            if edad < 30:

                pau = 0.15

            else:

                pau = 0.12

elif    estadoCivil == 5:

            desc = "Unión libre"

            if salario < 1000:

                pau = 0.20

            else:

                pau = 0.12

else:

            desc = "Estado civil inválido"

            pau = 0.0

aumento = salario * pau

nuevoSalario = salario + aumento

print(nombre, desc, "edad", edad, "salario", salario, "Porcentaje de aumento", pau, "Aumento", end=": ")

print(aumento, "Nuevo salario", nuevoSalario)