package com.core.java8;
interface DemoLambda
{
	public String eat();
}
public class LAmbdaExpressionWithoutParameter {
	public static void main(String[] args) {
		DemoLambda msg=()->{
			return "Rice";
		};
		
		System.out.println(msg.eat());
	}

}
