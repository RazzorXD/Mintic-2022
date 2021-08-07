from claseMatriz import matriz

m1 = matriz(4, 4)

m1.llenarMatrizAleatoriamente(9)
m1.imprimeMatrizPorFilas()

vec = m1.mostrarDiagonal()
vec.imprimeVector("Numero mayor")