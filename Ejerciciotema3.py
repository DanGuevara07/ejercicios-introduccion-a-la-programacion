"""
Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
"""




def sumarNumeros(a, b, c):
	return(a+b+c)
def main():
	class Coche:
		numPuertas = 4;
		def incrementarPuertas(self, puertas):
			self.numPuertas += puertas 
	
	print(sumarNumeros(1, 2, 3))
	miCoche = Coche()
	print(miCoche.numPuertas)
	miCoche.incrementarPuertas(1)
	print(miCoche.numPuertas)

if __name__=='__main__':
	main()







