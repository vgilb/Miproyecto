package Pruebas;

public class Cuenta {
	// Propiedades de la Clase Cuenta
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInter�s;

	/* Constructor sin argumentos */
	public Cuenta() {
	}

	// Constructor con par�metro para iniciar todas las propiedades de la clase
	public Cuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	// M�todo para asignar el nombre del titular de la cuenta
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	// M�todo que me devuelve el nombre del titular
	public String obtenerNombre() {
		return nombre;
	}

	// M�todo que me devuelve el saldo disponible en cada momento
	public double estado() {
		return saldo;
	}

	/*
	 * M�todo para ingresar cantidades en la cuenta. Modifica el saldo. Este m�todo
	 * va a ser probado con Junit
	 */
	public void ingresar(double cantidad) throws StackOverflowError {
		if (cantidad < 0)
			throw new StackOverflowError("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/*
	 * M�todo para retirar cantidades en la cuenta. Modifica el saldo. Este m�todo
	 * va a ser probado con Junit
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

	// M�todo que me devuelve el n�mero de cuenta
	public String obtenerCuenta() {
		return cuenta;
	}
}
