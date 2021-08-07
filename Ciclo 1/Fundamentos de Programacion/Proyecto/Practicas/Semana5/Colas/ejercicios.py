from claseCola import *
from clasePila import Pila
import random
"""
Ejercicio 1: dada la clase LSL...
a. Implementar un método intercambiar que permita cambiar de lugar dos nodos en la lista.
b. Implemenar el método de ordenamiento por selección.
"""
# Este va despues gg

"""
Ejercicio 2: elaborar un algoritmo que haga lo siguiente:
a. Crear una pila vacía y llenarla con 10 valores enteros aleatorios entre el 0 y el 10.
b. Utílice solo las operaciones de la pila para implementar un método eliminar_dato que
elimine todas las ocurrencias de un valor v.
Pista: puede usar una pila secundaria.
"""
# Resuelto

'''pila = Pila()

for i in range(8):
    pila.apilar(random.randint(0, 5))

pila.imprimirPila("Pila 1")

valor = 5
pila.eliminar_dato(valor)

pila.imprimirPila("Pila 1 Actualizada")'''


"""
Ejercicio 3: Para la clase Cola, implementar un método que permita desencolar el
último elemento.
"""
# Resuelto

'''cola = Cola()

for i in range(4):
    cola.encolar(random.randint(1,10))

cola.imprimirCola()

cola.encolar(7)
cola.encolar(10)
cola.imprimirCola()

cola.desencolar()
cola.imprimirCola()

cola.encolar(11)
cola.imprimirCola()

cola.desencolarFinal()
cola.imprimirCola()

cola.encolar(12)
cola.imprimirCola()'''


"""
Ejercicio 4: Elabore un simulador de ventas de jugo natural. Para esto, simule 30 minutos (for de 30 iteraciones) y un
inventario de 10 jugos, los cuales se venden por 2000 pesos c/u.
Para simular lo que pasa en cada minuto, debe usar una variable aleatoria que tome valores entre 1 y 3.
Si el valor es 1, llega un cliente nuevo con una edad aleatoria entre 10 y 80. #agregar a la cola y clase cliente
Si el valor es 2 y la longitud de la cola es mayor a 3, el último cliente de la cola se cansa de esperar
y se marcha.
Si el valor es 3, no pasa nada.
Además, en cada minuto que pasa se debe atender al cliente que esté en la cabeza de la cola.
Si el cliente tiene menos de 20 años, se dará cuenta de que el jugo no tiene azucar y se irá sin comprar.
De lo contrario, comprará el jugo.
En cada minuto se debe reportar lo siguiente:
Jugos restantes: {numero_jugos}
Total ganado: {dinero_obtenido}
Número de clientes en la cola: {len(cola)}
"""

minutos = 70
numeroJugos = 10
valorUnidad = 2000
dineroObtenido = 0
cola = Cola()
acum = 0

for i in range(0, minutos):
        sim = random.randint(1, 3)
        print("\nSim:", sim, "\n")
        if sim == 1:
            clientes = Cliente()
            cola.encolar(clientes)
            cola.imprimirCola("Variable simulacion: 1")
            print(f"EL cliente nuevo tiene: {clientes.edad}\n")
            for j in range(len(cola)):
                print(f"El cliente {j} tiene: {cola[j].edad}")

        elif sim == 2 and len(cola) > 3:
            print("Hay mas de tres personas, se canso y se fue :(")
            cola.desencolarFinal()
            cola.imprimirCola("Variable simulacion: 2")

        else:
            if sim == 3:
                print("No pasa nada...")

        if numeroJugos > 0 and cola.esVacia() == False:
            if clientes.edad < 20:
                print("No compro jugo y se fue :(")
                cola.desencolar()
                
            else:       
                cola.desencolar()
                numeroJugos -= 1
                dineroObtenido += valorUnidad
                print("Cliente atendido....")
                print("Minutos: ", acum)

        else:
            if numeroJugos == 0 and cola.esVacia() == False:
                print('Ya no quedan jugos')
        acum += 1
        print("\nMinutos:", acum)
        print(f"\nJugos restantes: {numeroJugos}")
        print(f"Dinero obtenido: {dineroObtenido}")
        print(f"# clientes en la cola {len(cola)}")
print("\nMinutos finales:", acum, "\n")
                

"""
Ejercicio adicional con pilas: implementar para la clase Pila el
ejemplo de calculadora científica descrito aquí:
https://uniwebsidad.com/libros/algoritmos-python/capitulo-17/pilas
"""
