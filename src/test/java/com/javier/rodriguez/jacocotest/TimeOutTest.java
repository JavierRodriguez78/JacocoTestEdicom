package com.javier.rodriguez.jacocotest;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import   org.junit.rules.Timeout;

public class TimeOutTest {

	@Rule
	public Timeout globalTimeout  = Timeout.millis(500);
	
	@Test
	public void testFallaExcesoTeimpo() throws Exception{
		TimeUnit.MILLISECONDS.sleep(400);
	}
	
	@Test(timeout=300)
	public void test() throws Exception{
		TimeUnit.MILLISECONDS.sleep(150);
	}
	
	
}
