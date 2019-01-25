package com.core.DemoJunit;

public class Calculator {
	CalculatorService s;
	public Calculator()
	{
	this.s=s;	
	}
	public int perform(int i, int j) {
		//return s.add(i,j)*i;
		return i+j;
	}

}
