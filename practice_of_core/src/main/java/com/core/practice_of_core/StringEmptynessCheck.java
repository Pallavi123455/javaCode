package com.core.practice_of_core;

public class StringEmptynessCheck {
	public static void main(String[] args) {
		
		String first="";
		String second="First";
		boolean third=first.isEmpty();
		boolean fourth=second.isEmpty();
		System.out.println(third);
		System.out.println(fourth);
		String five=null;
		String six="   ";
		String seven="IIII";
				if(five==null || five.isEmpty())
				{
					System.out.println("It is empty or null");
				}
				else
					System.out.println(five);
				if(six==null || six.isEmpty())
				{
					System.out.println("It is empty or null");
				}
				else
				{
					if(six.trim().isEmpty())
					{
					System.out.println("Blank spaces are there");
				}else
				{
					System.out.println(six);
				}
				if(seven==null || seven.isEmpty())
					System.out.println("It is empty or null");
				else
				System.out.println(seven);
	}

}
}
