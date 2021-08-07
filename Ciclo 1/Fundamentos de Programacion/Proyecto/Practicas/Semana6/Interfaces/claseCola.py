from random import randint, random
from claseLSL import LSL

class Cliente:
    def __init__(self):
        self.edad = randint(10,80)

    #igual a
    def __eq__(self, other):
        son_iguales = self.edad == other.edad
        return son_iguales

    #mayor que
    def __gt__(self, other):
        mayor_que = self.edad > other.edad
        return mayor_que

    #diferente de
    def __ne__(self, other):
        diferente = self.edad != other.edad
        return diferente

class Cola(LSL):
    def __init__(self):
        """
        Constructor.
        Llama al constructor de la lista simplemente ligada.
        """
        LSL.__init__(self)

    def imprimirCola(self, mensaje = "Pila sin nombre"):
        """
        Imprime la cola con un formato interesante.
        """
        nodo = self.primerNodo()
        indice = 0
        print(f"\n{mensaje}\n")
        while not self.finDeRecorrido(nodo):
            if nodo.liga is None:
                repr_liga = "... fin de la cola"
            else:
                repr_liga = "\n"

            print(f"[p{indice}|{nodo.retornarDato()}]{repr_liga}", end="")
            nodo = nodo.retornarLiga()
            indice = indice + 1
        print("\n")

    def encolar(self, dato):
        """
        Coloca un dato al final de la cola.
        """
        self.insertarAlFinal(dato)

    def desencolar(self):
        """
        Saca el dato que está en la primera posición en la cola.
        Retorna el dato.
        """
        if self.esVacia():
            print("La cola está vacía, no hay nada para desencolar.")
            return None
        else:
            d = self.primero.retornarDato()
            self.eliminar(self.primero, None)
            return d

    def desencolarFinal(self):
        """
        Saca el dato que está en la ultima posición en la cola.
        Retorna el dato.
        """
        if self.esVacia():
            print("La cola está vacía, no hay nada para desencolar.")
            return None
        elif len(self) == 1:
            self.primero = None
            return self
        else:
            anterior = None
            nodo = self.primerNodo()
            while not self.finDeRecorrido(nodo) and nodo.retornarLiga() != None:
                anterior = nodo
                nodo = nodo.retornarLiga()
            self.eliminar(anterior.retornarLiga(), anterior)
            return self

    def siguiente(self):
        """
        Dice cuál es el próximo en salir de la cola -es decir, el primero-.
        """
        return self.primero.retornarDato()