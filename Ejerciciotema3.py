
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







