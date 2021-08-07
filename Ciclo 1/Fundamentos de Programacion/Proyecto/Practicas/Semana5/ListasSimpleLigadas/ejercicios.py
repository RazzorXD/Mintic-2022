from claseLSL import LSL, Estudiante

mis_estudiantes = LSL()
for i in range(3):
    estudiante_nuevo = Estudiante(i)
    mis_estudiantes.insertarOrdenado(estudiante_nuevo)

mis_estudiantes.imprimirLista()
print(mis_estudiantes[0].notas)
print(mis_estudiantes[1].notas)
print(mis_estudiantes[2].notas)

### DEFINIR UNA FUNCIÓN EN LA CLASE ESTUDIANTE QUE CALCULE EL PROMEDIO DEL ESTUDIANTE ###

estudiante = mis_estudiantes[1]
promedio = estudiante.promedioIndividual()
print(f"El estudiante {estudiante.id} tiene un promedio de {promedio}")


### ELABORAR UN PEDAZO DE CÓDIGO QUE PERMITA CALCULAR EL PROMEDIO DEL SALÓN ###

promedioTotal = 0
for i in range(0, len(mis_estudiantes)):
    for j in range(0, len(mis_estudiantes)):
        estudiantes = mis_estudiantes[j]
        promedioTotal = promedioTotal + estudiantes.promedioIndividual()
resultado = promedioTotal/len(mis_estudiantes)

print(f"Todos los estudiantes tienen un promedio de {resultado}")


### ELABORAR OTRO QUE SAQUE EL MÍNIMO Y EL MÁXIMO, Y QUIÉNES LAS TIENEN

maxNota = 0
for i in range(0, len(mis_estudiantes)):
    for j in range(0, len(mis_estudiantes)):
        estudiantes1 = mis_estudiantes[j]
        temp  = estudiantes1.promedioIndividual()
        if temp > maxNota:
            maxNota = temp
print(f"El promedio maximo lo tiene {estudiantes1.id} y es: {maxNota}")

minNota = 5.0
for i in range(0, len(mis_estudiantes)):
    for j in range(0, len(mis_estudiantes)):
        estudiantes2 = mis_estudiantes[j]
        temp2  = estudiantes2.promedioIndividual()
        if temp2 < minNota:
            minNota = temp2
            id = estudiantes2.id
print(f"El promedio minimo lo tiene {id} y es: {minNota}")