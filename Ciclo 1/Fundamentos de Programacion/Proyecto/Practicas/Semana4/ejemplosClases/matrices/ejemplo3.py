from claseMatriz import *

m1 = matriz(4, 4)
m2 = matriz(4, 4)

m1.llenarMatrizAleatoriamente(10)
m2.llenarMatrizAleatoriamente(10)

m1.imprimeMatrizPorFilas("m1")
m2.imprimeMatrizPorFilas("m2")

m3 = m1 + m2
m3.imprimeMatrizPorFilas("m3: suma de m1 y m2")

m4 = 5 + m2
m4.imprimeMatrizPorFilas("m4: suma de m2 y 5")

m5 = 1 - m2
m5.imprimeMatrizPorFilas("m5: resta de m2 y 1")
