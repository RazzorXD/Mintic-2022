def es_primo(numero):

    '''
    Esta funcion recibe como parametro un numero entero y evalua si es primo o no

    Entrada: numero entero
    Salida: bool. True = si, False = no
    '''
    if numero == 2:
        return True
    elif numero%2 == 0:
        return False
    else:
        i = 3
        while i < int(numero**(1/2))+1:
            if numero%i == 0:
                return False
            i+=2
        return True

def max_com_div(num1, num2):

    '''
    Esta funcion recibe como parametros dos numeros enteros y
    Calcula el maximo comun divisor de ambos

    Entrada: dos numeros enteros
    Salida: numero entero (MCD)
    '''
    temp = 0
    num1Temp = num1
    num2Temp = num2
    while num2Temp != 0:
        temp = num2Temp        
        num2Temp = num1Temp % num2Temp  
        num1Temp = temp     
    return num1Temp
    

def min_com_mul(num1, num2):
    
    '''
    Esta funcion recibe como parametros dos numeros enteros y
    Calcula el minimo comun multiplo de ambos

    Entrada: dos numeros enteros
    Salida: numero entero (MCM)
    '''
    return int((num1*num2)/max_com_div(num1, num2))

def primer_digito(num1, num2):
    
    '''
    Esta funcion recibe como parametros dos numeros enteros y
    halla el primer digito de cada uno convirtiendo el numero a cadena de caracteres

    Entrada: dos numeros enteros
    Salida: caracteres (digitos en la primera posicion de cada cadena)
    '''
    str_num1 = str(num1)
    str_num2 = str(num2)

    return str_num1[0], str_num2[0]