package com.javier.rodriguez.jacocotest;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@Categories.IncludeCategory(TestDeIntegracion.class)
@SuiteClasses({clase1.class})
public class TestSuiteClass {

	@Test
	public void prueba() {
		
	}
	
}
