package com.core.java8;
import java.lang.Runnable;
//@FunctionalInterface
/*interface Runnable {
	//public int number(int a);
	public void runnable();
}*/

public class LambdaExpressionWithSingleParameter {
	public static void main(String[] args) {
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("OLD CONCEPT"+Thread.currentThread());
			}
		}).start();*/
	
	/*Runnable aa=()->
	{
		System.out.println("New Concept"+Thread.currentThread());
		
	};*/
	/*aa.r();*/
	Runnable r = () -> {
		System.out.println("My Runnable"+Thread.currentThread().getName());
	};
	new Thread(r).start();

}
}

	/*
	 * DemoParameterizedLAmbda aa=(num)->num+5; System.out.println(aa.number(7));
	 */

