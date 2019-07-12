package com.javier.rodriguez.jacocotest;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class RuleTest {

	@Rule
	public final  SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	
	@Test
	public void capturaSystemOut() {
		System.out.print("Test");
		System.out.print("1");
		assertEquals("Test", systemOutRule.getLog());
	}
}
