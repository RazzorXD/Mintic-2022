from os import pardir


def actualizar_estado_editor(operaciones_usuario):
    # ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    texto_escrito = []
    texto_actual = ''
    rehacer = []

    for i in range(len(operaciones_usuario)):
        # Elminar la ultima pos > texto_escrito.pop()
        if operaciones_usuario[i] != 'DESHACER' and operaciones_usuario[i] != 'REHACER':
            texto_actual = operaciones_usuario[i]
            texto_escrito.append(texto_actual)
            '''print('Texto actual:', texto_actual)
            print('Texto escrito:', texto_escrito, '\n')'''

        elif operaciones_usuario[i] == 'DESHACER':
            texto_actual = texto_escrito.pop()
            #print('Texto actual deshacer:', texto_actual, '\n')
            rehacer.append(texto_actual)
            #print('Rehacer:', rehacer)

        else:
            if operaciones_usuario[i] == 'REHACER':
                texto_escrito.append(texto_actual)
                texto_actual = rehacer.pop()
            rehacer.clear()

    texto_actual = 'Vacio'
    cadena_final = ''.join(texto_escrito)

    print('Texto escrito:', texto_escrito)
    print('Texto actual:', texto_actual)
    print('Rehacer:', rehacer)
    return cadena_final


operaciones_usuario = ['Definamos qué es una función de Python: ', 'Una función es ', 'un arreglo unidimensional de datos',
                       'DESHACER', 'DESHACER', 'REHACER', 'un grupo de instrucciones ', 'que hacen...']
                       #El "que hacen..." lo agregue yo para probar que funcionara agregando despues xd
cadena = actualizar_estado_editor(operaciones_usuario)
print('Cadena final:', cadena)
