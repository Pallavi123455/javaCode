package com.monami.assign;

public class StringReverse {
	static String source;
	public  String reverse(String source)
	{
		if(source==null || source.isEmpty())
		{
		return source;
		}
		String reverse="";
		for(int i=source.length()-1;i>0;i--)
		{
			reverse=reverse+source.charAt(i);
		}
		return reverse;	
	}
	public static void main(String[] args) {
		StringReverse aa=new StringReverse();
		aa.reverse(source);
		System.out.println(aa.reverse(source));
	
	}

}
