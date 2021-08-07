import csv
from re import split
from os import pardir, sep
"""NOTAS: 
    -PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
    -LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO
"""


"""Inicio espacio para programar funciones propias"""
# En este espacio podrás programar las funciones que deseas usar en la función solución (ES OPCIONAL)


"""Fin espacio para programar funciones propias"""


def solucion():
    # ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    date_lowest = ''
    date_highest = ''
    lowest_value = 0.0
    highest_value = 0.0

    datos = []

    with open('Semana7\Reto\MSFT.csv', 'r') as f:
        reader = csv.reader(f)
        next(reader)

        datos.append([f"{'Fecha'}\t{'Mean-Min-Max'}\t{'Concepto'}"])
        tempHigh = 0.0
        tempLow = 300

        for line in reader:
            mean = (float(line[2]) + float(line[3]))/2

            if mean < 207:
                concepto = 'MUY BAJO'
            elif mean >= 207 and mean < 221:
                concepto = 'BAJO'
            elif mean >= 221 and mean < 235:
                concepto = 'MEDIO'
            elif mean >= 235 and mean < 249:
                concepto = 'ALTO'
            else:
                if mean >= 249:
                    concepto = 'MUY ALTO'

            datos.append([f"{line[0]}\t{mean}\t{concepto}"])
        
            high = float(line[2])

            if high > tempHigh:
                tempHigh = high
                highest_value = tempHigh
                date_highest = line[0]

            low = float(line[3])

            if low < tempLow:
                tempLow = low
                lowest_value = tempLow
                date_lowest = line[0]

    with open('Semana7\\Reto\\analisis_archivo.csv', 'w', newline='') as fAnalisis:
        writer = csv.writer(fAnalisis)
        writer.writerows(datos)

    return date_lowest, lowest_value, date_highest, highest_value


date_lowest, lowest_value, date_highest, highest_value = solucion()
print(f"El {date_lowest} fue el precio mas bajo: {lowest_value}")
print(f"El {date_highest} fue el precio mas bajo: {highest_value}")