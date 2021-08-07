lista = []
#Append anade elementos a la lista
lista.append(20)

print('Mi lista:', lista)

#Insert recibe la posicion y el dato. Ej: 0, 10
lista.insert(0, 10)
print('Mi lista:', lista)

#para saber la logitud de la lista se hace con len()
long = len(lista)
print('Longitud de mi lista:', long)

#otra forma de manera privada
print('Longitud de mi lista:', lista.__len__())