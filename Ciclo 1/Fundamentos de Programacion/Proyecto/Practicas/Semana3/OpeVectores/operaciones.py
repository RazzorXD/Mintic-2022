# %%
#import busqueda
import ordenamiento
import vector

print("Paquetes importados...")

# %%
# Creación del vector
tamano = 10
vec1 = vector.creaVector(tamano)
vector.imprimeVector(vec1, "Vector al comenzar")
print("Resultado de preguntar si el vector está vacío:", vector.esVacio(vec1))


# %%
# Inicialización del vector
vector.inicializaVector(vec1, tamano, 99)
vector.imprimeVector(vec1, "Vector inicializado aleatoriamente")
print("Resultado de preguntar si el vector está vacío", vector.esLleno(vec1, tamano))


#%%
total = vector.sumaVector(vec1)
print("La suma de valores en vector es:", total)


#%%
# Agregar un dato nuevo al final
dato_nuevo = int(input("Ingrese un valor para añadir al vector"))
vector.agregarDato(dato_nuevo, vec1, tamano)
vector.imprimeVector(vec1, "Vector tras agregar " + str(dato_nuevo))

#%%
# Obtener el menor y el mayor dato del arreglo

mayor = vector.mayorDato(vec1)
menor = vector.menorDato(vec1)

print(
    f"El mayor dato está en {mayor} -> {vec1[mayor]} y el menor está en {menor} -> {vec1[menor]}"
)


#%%
# Intercambiar los valores de dos posiciones en el vector
pos1 = 2
pos2 = 11

vector.imprimeVector(vec1, "Vector antes del intercambio: ")
vector.intercambiar(vec1, pos1, pos2)
vector.imprimeVector(vec1, "Vector después del intercambio")

# %%
# Borrar un dato en el vector dada la posición
pos_borrar = int(input("Ingrese la posición para borrar en el vector: "))
vector.borrar(vec1, pos_borrar)
vector.imprimeVector(vec1, "Vector tras borrar el dato: ")

# %%
# Buscar un dato en el vector y borrarlo.

dato_borrar = int(input("Ingrese el dato para borrar en el vector"))
pos_borrar = vector.buscarDato(vec1, dato_borrar)
if pos_borrar == -1:
    print("El dato no se encontró en el arreglo.")
else:
    print("El dato se borró exitosamente.")
    vector.borrar(vec1, pos_borrar)
vector.imprimeVector(vec1, "Vector tras intentar borrar el segundo dato: ")

# %%
# Agregar un dato nuevo en una posición arbitraria

dato = int(input('Ingrese el dato para agregar: '))
posicion = int(input('Ingrese pa posicion para agregar: '))
vector.insertar(vec1, dato, posicion)
vector.imprimeVector(vec1, "Vector después de agregar el valor nuevo")

# %%
# Ordenar un vector por el metodo burbuja

ordenamiento.burbuja(vec1)
vector.imprimeVector(vec1, "Vector ordenado")

# %%
# Insertar un dato en un vector ordenado

dato = 5
posicion_ins = vector.buscarDondeInsertar(vec1, dato)
vector.imprimeVector(vec1, "Vector antes de insertar")
vector.insertar(vec1, dato, posicion_ins)
vector.imprimeVector(vec1, "Vector después de insertar")

#%%
# Buscar un dato en un vector ordenado

dato_para_buscar = 222
#posicion = busqueda.bussec(vec1, dato_para_buscar)
if posicion == -1:
    print("El valor no se encuentra en el arreglo.")
else:
    print(f"El valor {dato_para_buscar} se encuentra en la posición {posicion}.")

# %%
#Borrar todas las apariciones de un numero en el vector
#print(vec1)
datoBorrar = int(input('Ingrese el dato a borrar: '))
posicion_borrar = vector.buscarDato(vec1, datoBorrar)
print(f"El dato {datoBorrar} se encuentra en la posición {posicion_borrar}.")
while vector.buscarDato(vec1, datoBorrar) != -1:
    posicion_borrar = vector.buscarDato(vec1, datoBorrar)
    vector.borrar(vec1, posicion_borrar)
vector.imprimeVector(vec1, "\nVector despues de borrar:")
print(f"\nEl dato {datoBorrar} ya no se encuentra en el vector")

# %%
# Ordenar un vector por el metodo quicksort
tamano = 5
vec1 = vector.creaVector(tamano)
vector.inicializaVector(vec1, tamano, 10)
v = ordenamiento.quick(vec1)
vector.imprimeVector(v)
# %%
