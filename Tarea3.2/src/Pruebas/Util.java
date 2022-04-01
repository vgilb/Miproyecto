package Pruebas;

public class Util {
	
	// Retorna el factorial del número pasado por parámetro
	public int factorial(int numero) {
		if (numero == 0)
			return 1;
		else
			return numero * factorial(numero - 1);
	}

	// Retorna el resultado de multiplicar los números que se le pasan por parámetro
	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}

	// Retorna 1 si el número introducido por parámetro es par y un 0 si es impar
	public int par(int num) {
		if (num % 2 == 0)
			return 1;
		else
			return 0;
	}

}
