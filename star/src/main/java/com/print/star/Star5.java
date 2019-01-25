package com.print.star;

public class Star5 {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=65;j<=65+i;j++)
			{
				char k=(char)j;
				System.out.print(" "+k);
			}
			System.out.println(" ");
		}
	}

}
