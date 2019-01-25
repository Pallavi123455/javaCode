package com.core.core;

interface  Demo {
	final int b=20;
	void display();
}
	class InterfaceExample implements Demo
	{

		public void display() {
			// TODO Auto-generated method stub
			System.out.println("HIIIIII");
			
		}
		public static void main(String[] args) {
			Demo a=new InterfaceExample();
			a.display();
			System.out.println(b);
		}
		

}
