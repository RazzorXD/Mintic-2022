import matplotlib.pyplot as plt
import numpy as np

#Grafiquemos una función de seno
'''x = np.arange(-1450,1451,25)
y = np.sin(x)

fig = plt.figure( figsize=(20,5), dpi = 150)
#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$sin(x)$")
#Y las mostramos con plt.legend:
plt.legend()
plt.plot(x,y, color = "red", linewidth = 3)
plt.title("Gráfica de la función $sin(x)$")
plt.xlabel("x")
plt.ylabel("y")
plt.show()'''

#Grafiquemos una función de coseno
'''x = np.arange(-1750,1751,25)
y = np.cos(x)

fig = plt.figure( figsize=(20,5), dpi = 150)
#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$cos(x)$")
#Y las mostramos con plt.legend:
plt.legend()
plt.plot(x,y, color = "red", linewidth = 3)
plt.title("Gráfica de la función $cos(x)$")
plt.xlabel("x")
plt.ylabel("y")
plt.show()'''

#Grafiquemos una función exponencial
'''x = np.arange(1,30,1)
y = np.exp(x)

fig = plt.figure( figsize=(10,5), dpi = 150)
#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$exp(x)$")
#Y las mostramos con plt.legend:
plt.legend()
plt.plot(x,y, color = "red", linewidth = 3)
plt.title("Gráfica de la función $exp(x)$")
plt.xlabel("x")
plt.ylabel("y")
plt.show()'''

#Grafiquemos una función de raiz cuadrada
'''x = np.arange(0,200,1)
y = np.sqrt(x)

fig = plt.figure( figsize=(20,5), dpi = 150)
#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$sqrt(x)$")
#Y las mostramos con plt.legend:
plt.legend()
plt.plot(x,y, color = "red", linewidth = 3)
plt.title("Gráfica de la función $sqrt(x)$ (Raiz cuadrada)")
plt.xlabel("x")
plt.ylabel("y")
plt.show()'''

#Grafiquemos una función de x^3
'''x = np.arange(-100,101,1)
y = x**3

fig = plt.figure( figsize=(20,5), dpi = 150)
#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$x^3$")
#Y las mostramos con plt.legend:
plt.legend()
plt.plot(x,y, color = "red", linewidth = 3)
plt.title("Gráfica de la función $x^3$")
plt.xlabel("x")
plt.ylabel("y")
plt.show()'''

#Grafiquemos una función de logaritmo natural
'''x = np.arange(-100,101,1)
y = np.log(x)

fig = plt.figure( figsize=(20,5), dpi = 150)
#Podemos ponerle etiquetas a cada gráfica
plt.plot(x,y, color = "red", linewidth = 3, label = "$log(x)$")
#Y las mostramos con plt.legend:
plt.legend()
plt.plot(x,y, color = "red", linewidth = 3)
plt.title("Gráfica de la función $Ln(x)$ (Logaritmo Natural)")
plt.xlabel("x")
plt.ylabel("y")
plt.show()'''

#Grafiquemos un dagrama de caja y bigotes

'''datos = [0, 0, 1, 2, 3, 1, 1, 5, 10, 15, 5, 5, 5, 5]

fig = plt.figure( figsize=(5,5), dpi = 150)
plt.boxplot(datos)
plt.title("Diagrama de caja y bigotes.")
plt.show()'''
