package com.javier.rodriguez.jacocotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void esteTestCubreEl100Calculadora(){
		assertEquals(2, Calculadora.dividir(4, 2));
	}
	@Test
	public void esteTestDivdiePorCero(){
		assertEquals(2, Calculadora.dividir(4, 0));
	}
}
