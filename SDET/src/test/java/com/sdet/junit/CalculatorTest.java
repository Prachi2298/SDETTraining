package com.sdet.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator ob = new Calculator();

	@Test  //annotations - non executable line (meta data) it gives information of the method implementation
	public void testAdd1() {
		assertEquals(10, ob.add1(5,5));
		
	}

	@Test
	public void testSub1() {
		assertEquals(0, ob.sub1(5, 5));
      
	}

}

