package com.core.java8;

import java.util.function.IntBinaryOperator;

public class PreDefinedFunctionalInterface {
	public static void main(String[] args) {
		IntBinaryOperator sum=(a,b) ->a+b;
		System.out.println("Result:   "+sum.applyAsInt(100,5));
	}

}
