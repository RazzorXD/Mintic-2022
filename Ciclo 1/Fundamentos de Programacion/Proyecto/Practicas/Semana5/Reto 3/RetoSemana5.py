from re import split
import pandas as pd
cadena = "Hola mundo"



def comparar(mensajeTraducir):
    mensaje_traducido = ''
    resultado = split('', mensajeTraducir)
    diccionario = {' ' : '/', 'A' : '.-', 'B' : '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.', 'H': '....', 'I': '..', 
    'J': '.---', 'K': '-.-', 'L': '.-..', 'M': '--', 'N': '-.', 'O': '---', 'P': '.--.', 'Q': '--.-', 'R': '.-.', 'S': '...', 'T': '-',
    'U': '..-', 'V': '...-', 'W': '.--', 'X': '-..-', 'Y': '-.--', 'Z': '--..'}

    '''diccionario1 = {'a' : [1,2,3,4,5], 'b' : [6,7,8,9,10]}
    tabla = pd.DataFrame(diccionario1)
    print(tabla)'''

    for caracterMensaje in resultado:
        #print("Mensaje", caracterMensaje)
        for caracterDicc in diccionario:
            #print("Diccionario", caracterDicc)
            if caracterMensaje == caracterDicc:
                mensaje_traducido += diccionario.get(caracterDicc) + ' '
    mensaje_traducido = mensaje_traducido.rstrip(mensaje_traducido[-1])
    return mensaje_traducido

mensajeTraducir = "HOLA MUNDO"
mensaje_traducido = comparar(mensajeTraducir)
print(mensaje_traducido)