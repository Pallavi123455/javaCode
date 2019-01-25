package com.monam.exception;

public class FinalizeExample {
	public void finalize()
	{
		System.out.println("Finalize is called");
	}
	public static void main(String[] args) {
		FinalizeExample ee=new FinalizeExample();
		FinalizeExample ee2=new FinalizeExample();
		System.out.println(ee);
		System.out.println(ee2);
		ee=null;
		ee2=null;
		System.out.println(ee2);
		System.out.println(ee);
	}

}
