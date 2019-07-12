package com.javier.rodriguez.jacocotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class CategoriaTestIntegracion {

	@Category(TestDeIntegracion.class)
	@Test
	public void test() {
		System.out.println("Soy un test de inegracion");
	}
	
	@Test
	public void testPrueba() {
		
		assertEquals(1, 1);
		
	}
}
