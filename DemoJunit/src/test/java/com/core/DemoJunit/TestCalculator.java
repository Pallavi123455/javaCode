package com.core.DemoJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import junit.framework.TestCase;

public class TestCalculator {
	Calculator c = new Calculator();
	//CalculatorService s=new mock(CalculatorService.class);
	/*@Before
	public void setUp() {
		c = new Calculator(s);
	}
*/
	@Test
	public void testAdd() {
		assertEquals(5, c.perform(2, 3));

	}

}
