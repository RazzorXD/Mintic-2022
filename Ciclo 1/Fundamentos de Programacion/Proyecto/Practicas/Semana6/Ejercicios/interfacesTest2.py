import matplotlib.pyplot as plt
import numpy as np

#Para graficar necesitamos unos datos
x = np.arange(-10,11,1)

#Generamos la figura y definimos el tamaño y la resolución
y = 1/(1 + (np.exp(-x)))

fig = plt.figure( figsize=(5,5), dpi = 150)

#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$1/1+e^-z$")
#Y las mostramos con plt.legend:
plt.legend()

#Podemos ajustar el tamaño de la línea
plt.plot(x,y, color = "red", linewidth = 3)

#Podemos colocarle título a la gráfica:
plt.title("Gráfica de la función $1/1+e^-z$")
plt.xlabel("x")
plt.ylabel("y")
plt.show()