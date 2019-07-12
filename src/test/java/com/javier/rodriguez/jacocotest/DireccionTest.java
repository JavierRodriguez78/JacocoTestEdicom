package com.javier.rodriguez.jacocotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DireccionTest {

	@Test
	public void obtenerCodigoPostal() {
		Direccion direccion = new Direccion ("Calle Charles Darwin (46100)");
		String codigoPostal = direccion.getCodigoPostal();
		assertEquals("46100", codigoPostal);
	}
	
	@Test
	public void noHayCodigoPostal() {
		Direccion direccion = new Direccion ("Calle Charles Darwin");
		String codigoPostal = direccion.getCodigoPostal();
		assertNull(codigoPostal);
	}
	
	@Test(expected=NullPointerException.class)
	public void lanzarExcepcionSilePasoUnStringNulo() {
		Direccion direccion = new Direccion ("Calle Charles Darwin");
		String codigoPostal = direccion.getCodigoPostal();
		assertNull(codigoPostal);
	}
}
