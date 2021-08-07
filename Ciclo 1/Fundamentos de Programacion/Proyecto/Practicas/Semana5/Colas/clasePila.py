from claseLSL import LSL


class Pila(LSL):
    def __init__(self):
        LSL.__init__(self)

    def apilar(self, d):
        self.insertarAlPrincipio(d)

    def imprimirPila(self, mensaje = "Pila sin nombre"):
        """
        Recorre la pila y la imprime con formato
        """
        nodo = self.primerNodo()
        indice = 0
        print(f"\n{mensaje}\n")
        while not self.finDeRecorrido(nodo):
            if nodo.liga is None:
                repr_liga = ""
            else:
                repr_liga = "\n"

            print(f"[p{indice}|{nodo.retornarDato()}]{repr_liga}", end="")
            nodo = nodo.retornarLiga()
            indice = indice + 1
        print("\n")

    def desapilar(self):
        dato = self.primero.retornarDato()
        self.eliminar(self.primero, anterior=None)
        return dato

    def eliminar_dato(self, v):
        other = Pila()
        while len(self) != 0:
            dato = self.desapilar()
            if dato != v:
                other.apilar(dato)
        while len(other) != 0:
            self.apilar(other.desapilar())
        return self
