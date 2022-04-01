package Pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CuentaTest {

	static Cuenta c = new Cuenta("Pepe", "ES123", 10, 1);
	
	@Before
	public void before() {
		System.out.println("Before: " +c.estado());
	}
	
	@After
	public void after() {
		System.out.println("After: " +c.estado());
	}
	
	@Test(expected = StackOverflowError.class)
	public void test1IngresarNeg() {
		System.out.println("Ingresar negativo.");
		c.ingresar(-50);

	}

	@Test
	public void test2IngresarPos() {
		c.ingresar(50);
		double resul = c.estado();
		double esper = 60;
		assertEquals(resul, esper, 0.1);
		System.out.println("Ingresar positivo.");
	}
	
	@Test
	public void test3RetirarPos() {
		try {
			c.retirar(60);
		} catch (Exception e) {
			e.printStackTrace();
		}
		double resul = c.estado();
		double esper=0;
		assertEquals(resul, esper, 0.1);
		System.out.println("Retirar positivo.");
		
		}
	
	@Test (expected = Exception.class)
	public void test4RetirarNeg() {
		try {
			c.retirar(-20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Retirar negativo.");
	}
	
	@Test (expected = Exception.class)
	public void test5RetirarMas() {
		try {
			c.retirar(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Retirar más de lo que hay.");
	}
}
