package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {

	static Util u = new Util();
/*
	@Test(expected = StackOverflowError.class)
	public void testFactorialNeg() {
		u.factorial(-3);
	}
	
	@Test
	public void testFactorialPos() {
		int resul = u.factorial(3);
		int esper = 6;
		assertEquals(esper, resul);
	}

	@Test
	public void testFactorialCero() {
		int resul = u.factorial(0);
		int esper = 1;
		assertEquals(esper, resul);
	}

	@Test
	public void testCargaFactorial() {
		int resul = u.factorial(12);
		int esper = 479001600;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testMultiplicar() {
		int resul = u.multiplicar(-2, 3);
		int esper = -6;
		assertEquals(esper, resul);
	}

	
	@Test
	public void testPar() {
		int resul = u.par(12);
		int esper = 1;
		assertEquals(esper, resul);
	}
	*/
	
	@Test
	public void testImpar() {
		int resul = u.par(51);
		int esper = 0;
		assertEquals(esper, resul);
	}
}
