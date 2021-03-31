package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadorasTest {
	private static double DELTA = 0.05;
	private CalculadoraCCC ccc;
	private CalculadoraCFC cfc;
	
	@BeforeEach
	public void setUp() {
		ccc = new CalculadoraCCC();
		cfc = new CalculadoraCFC();
	}
	
	// Testes Cúbica de Corpo Centrado (CCC)
	
	@Test
	public void testeNiobio() {
		assertEquals(8.57, ccc.calcula(92.91, 0.143), DELTA);
	}
	
	@Test
	public void testeTungstenio() {
		assertEquals(19.28, ccc.calcula(183.84, 0.137), DELTA);
	}
	
	@Test
	public void testeLitio() {
		assertEquals(0.53, ccc.calcula(6.94, 0.152), DELTA);
	}

	// Testes Cúbica de Face Centrada (CFC)
	
	@Test
	public void testeCobre() {
		assertEquals(8.89, cfc.calcula(63.55, 0.128), DELTA);
	}
	
	@Test
	public void testeOuro() {
		assertEquals(19.36, cfc.calcula(196.97, 0.144), DELTA);
	}
	
	@Test
	public void testePrata() {
		assertEquals(10.60, cfc.calcula(107.87, 0.144), DELTA);
	}
}