package Pruebas;

public class Play {

	/*// Retorna el factorial del n�mero pasado por par�metro
		public int factorial(int numero) throws StackOverflowError {
			if (numero < 0) {
				throw new StackOverflowError("No se puede hacer el factorial de un n�mero negativo.");
			} else {
				if (numero == 0)
					return 1;
				else
					return numero * factorial(numero - 1);
			}
		}*/

	public static void main(String[] args) {
		
		Util u = new Util();
	
		System.out.println("n�mero 12: " +u.par(12));
		System.out.println("n�mero 15: " +u.par(15));
		
		/*
		System.out.println("factorial de cero: " +u.factorial(0));
		System.out.println("factorial de tres: " +u.factorial(3));
		System.out.println("factorial de -3: " +u.factorial(-3));
		
		
		System.out.println("multiplicaci�n 2x3: " +u.multiplicar(2, 3));
		System.out.println("multiplicaci�n (-1)x(-5): " +u.multiplicar(-1, -5));
		System.out.println("multiplicaci�n (-2)x5: " +u.multiplicar(-2, 5));
		*/
		
		
	/*	Cuenta c = new Cuenta("ABC01", "ES0215648", 50, 1);
		System.out.println("Cuenta:" + c.obtenerCuenta());
		System.out.println("Cantidad: " + c.estado());
		System.out.println("Nombre: " + c.obtenerNombre());
*/
	}

}
