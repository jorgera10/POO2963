def func_si():
    print ("Usted introdujo un 'SI'")

def func_no():
    print ("Usted introdujo un 'oytas cosas'")

respuesta = input('Introduzca "si" o cualquier otra cosa: ')
func_si() if (respuesta=='si') else func_no()