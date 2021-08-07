import random
import tkinter as tk
from tkinter import messagebox


class Cliente:
    def __init__(self, id):
        self.id = id
        self.edad = random.randint(8, 100)

    # igual a
    def __eq__(self, other):
        son_iguales = self.id == other.id
        return son_iguales

    # mayor que
    def __gt__(self, other):
        mayor_que = self.id > other.id
        return mayor_que

    # diferente de
    def __ne__(self, other):
        diferente = self.id != other.id
        return diferente

    def __str__(self):
        return f"Cliente con id {self.id}, edad {self.edad}"


class Aplicacion(Cliente):
    def __init__(self):
        """
        Constructor.
        Llama al constructor de la lista simplemente ligada.
        """
        Cliente.__init__(self, id)

        self.total_jugos_disponibles = 10
        self.n_clientes = 5
        self.precio_jugo = 1000
        self.total_ventas = 0

        self.cola_cliente = []

        for i in range(self.n_clientes):
            cliente = Cliente(i)
            self.cola_cliente.append(cliente)

        # INTERFAZ
        self.window = tk.Tk()
        self.window.title("App venta de jugos")

        self.frame_titulo = tk.Frame(
            master=self.window, width=200, height=10, bg="white")
        self.frame_titulo.pack()

        self.label_titulo = tk.Label(
            master=self.frame_titulo,
            text="VENTA DE JUGOS NATURALES",
            width=50,
            height=3,
            font=("Courier", 30),
        )
        self.label_titulo.pack()

        self.frame_datos = tk.Frame(
            master=self.window, width=200, height=10, bg="white")
        self.frame_datos.pack()

        self.label_jugos_disp = tk.Label(
            master=self.frame_datos,
            width=30,
            height=1,
            text="Total de jugos disponibles: " + str(self.total_jugos_disponibles),
            font=("Courier", 16),
        )
        self.label_jugos_disp.pack()

        self.label_total_ventas = tk.Label(
            master=self.frame_datos,
            width=30,
            height=1,
            text="Total ganado en ventas: " + str(self.total_ventas),
            font=("Courier", 16),
        )
        self.label_total_ventas.pack()

        self.label_clientes_en_cola = tk.Label(
            master=self.frame_datos,
            width=30,
            height=1,
            text="Total clientes en cola: " + str(len(self.cola_cliente)),
            font=("Courier", 16),
        )
        self.label_clientes_en_cola.pack()

        self.frame_acciones = tk.Frame(
            master=self.window, width=300, height=60)
        self.frame_acciones.pack(pady=30, side="bottom")
        # self.frame_acciones.pack_propagate(0)

        self.label_entry = tk.Label(
            master=self.frame_acciones,
            width=50,
            height=2,
            text=f"Cliente {self.cola_cliente[0].id}, edad {self.cola_cliente[0].edad}, ¿Cuántos jugos quiere comprar?",
            font=("Courier", 16),
        )
        self.label_entry.pack(side="top")

        self.input_jugos = tk.Entry(master=self.frame_acciones, width=30)
        self.input_jugos.pack(side="top")

        self.boton_siguiente = tk.Button(
            master=self.frame_acciones, text="Siguiente", width=25)
        self.boton_siguiente.pack(side="bottom", pady=10)

        def siguiente_cliente(event):
            valor_valido = verificar_cantidad_jugos(self.input_jugos.get())
            if valor_valido:
                cliente = actualizar_listado_clientes()
                realizar_compra(cliente)
                verificar_paciencia()

                if len(self.cola_cliente) == 0 or self.total_jugos_disponibles == 0:
                    messagebox.showinfo(
                        "Atención", "Se acabó la venta del día de hoy")
                    self.window.destroy()

        def actualizar_listado_clientes():
            cliente = self.cola_cliente.pop(0)
            if len(self.cola_cliente) != 0:
                self.label_clientes_en_cola["text"] = "Total clientes en cola: " + str(
                    len(self.cola_cliente)
                )
                self.label_entry[
                    "text"
                ] = f"Cliente {self.cola_cliente[0].id}, edad {self.cola_cliente[0].edad}, ¿Cuántos jugos quiere comprar?"
            else:
                self.label_clientes_en_cola["text"] = "Total clientes en cola: 0"
                self.label_entry["text"] = "Buen trabajo el día de hoy, nos vemos mañana."
            return cliente

        def verificar_cantidad_jugos(value):
            if not str(value).isnumeric():
                messagebox.showinfo(
                    "Atención", f"Debe insertar un valor válido.")
                return False
            else:
                return True

        def realizar_compra(cliente):
            if cliente.edad >= 10:
                jugos_por_comprar = int(self.input_jugos.get())
                if jugos_por_comprar > self.total_jugos_disponibles:
                    messagebox.showinfo(
                        "Atención", f"Hay {self.total_jugos_disponibles} y pidió {jugos_por_comprar}. Se le venderán {self.total_jugos_disponibles}.")
                    jugos_por_comprar = self.total_jugos_disponibles
                else:
                    messagebox.showinfo(
                        "Atención", f"Se vendieron {jugos_por_comprar} jugos al cliente {cliente.id}.")
                total_jugos_disponibles = self.total_jugos_disponibles - jugos_por_comprar
                total_ventas = self.total_ventas + jugos_por_comprar * self.precio_jugo
                self.label_jugos_disp["text"] = "Total de jugos disponibles: " + \
                    str(total_jugos_disponibles)
                self.label_total_ventas["text"] = "Total ganado en ventas: " + \
                    str(total_ventas)
                self.input_jugos.delete(0, tk.END)

        def verificar_paciencia():
            if random.random() < 0.1 and len(self.cola_cliente) > 1:
                self.cola_cliente.pop()
                messagebox.showinfo(
                    "Atención", f"El último cliente de la cola se cansó de esperar y se fue.")
                self.label_clientes_en_cola["text"] = "Total clientes en cola: " + str(
                    len(self.cola_cliente))

        self.boton_siguiente.bind("<Button-1>", siguiente_cliente)
        self.window.mainloop()
