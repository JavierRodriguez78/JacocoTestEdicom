package com.javier.rodriguez.jacocotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DireccionTest {

	@Test
	public void obtenerCodigoPostal() {
		Direccion direccion = new Direccion ("Calle Charles Darwin (46100)");
		String codigoPostal = direccion.getCodigoPostal();
		assertEquals("46100", codigoPostal);
	}
}
