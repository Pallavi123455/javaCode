package com.core.java8;
interface Drawable
{
	public void eat();
}

public class LambdaExpression {
	public static void main(String[] args) {
		Drawable aa=()->{
			System.out.println("HOOOO");
		};
		
	aa.eat();
	}

}
