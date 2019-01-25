package com.core.java8;
interface DemoDoubleParameterizedLambda
{
	public String concatination(String a,String b);
}
public class LambdaExpressionWithDoubleParameter {
	public static void main(String[] args) {
		DemoDoubleParameterizedLambda s=(str1,str2)->str1+str2;
		System.out.println("Result :"+s.concatination("Hello","World"));
	}

}
