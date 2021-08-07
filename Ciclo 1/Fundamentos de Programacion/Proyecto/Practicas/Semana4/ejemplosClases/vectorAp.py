from claseVecAp import altaPrecision


vap1 = altaPrecision(n=5)
vap1.asignaValor("225")
vap1.imprimeVector()

vap2 = altaPrecision(n=5)
vap2.asignaValor("120")
vap2.imprimeVector()

vap3 = vap1 + vap2
vap3.imprimeVector()
print(vap3)

vap4 = vap1 - vap2
vap4.imprimeVector()
print(vap4)

vap5 = vap1 * vap2
print(vap5)

# Probando la multiplicación

vap3 = 0*vap2

vap2.asignaValor(10)
vap2.imprimeVector()
vap3.imprimeVector()