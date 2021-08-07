from claseAlumno import *

nombre = input('Ingrese su nombre: ')
identificacion = input('Ingrese su identificacion: ')

persona1 = Persona(nombre, identificacion)
print('\nNombre:', persona1.get_nombre())
print('Identificacion:',persona1.get_identificacion())

nota = int(input("\nIngrese su nota: "))

alumno1 = Alumno(nombre, identificacion, nota)
alumno1.resultadosAlumno()