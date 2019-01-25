package com.core;

public class IbanValidation {
	public static void ibanValidation(String input)
	{
		int inputLength=input.length();
		String countryCode = null;
		String checkDigit = null;
		String bankCode;
		String accNumber;
		String bban = null;
		String bbanwcd;
		String changeover;
		String replaceletters = null;
		if(inputLength>=2)
		{
			countryCode=input.substring(0, 2);
		}
		if(inputLength>=4)
		{
			checkDigit=input.substring(2, 4);
		}
		if(inputLength>=7)
		{
			bankCode=input.substring(4, 7);
		}
		if(inputLength>=23)
		{
			accNumber=input.substring(7, 23);
		}
		if(inputLength>=23)
		{
			bban=input.substring(4);
		}
		if(inputLength>=23)
		{
			changeover=bban+countryCode+"00";
		}
		if(inputLength>=23)
		{
			replaceletters=bban+"1014"+checkDigit;
		}
		String a=replaceletters.substring(0,9);
		int moda;
		int blocka = Integer.parseInt(a);
		moda=blocka%97;
		//String e=replaceletters.substring(9,16);
		String b=Integer.toString(moda)+replaceletters.substring(9,16);//
		int modb;
		int blockb = Integer.parseInt(b);
		modb=blockb%97;
		String c=Integer.toString(modb)+replaceletters.substring(16,23);//
		int modc;
		int blockc=Integer.parseInt(c);
		modc=blockc%97;
		String d=Integer.toString(modc)+replaceletters.substring(23);
		int modd;
		int blockd=Integer.parseInt(d);
		modd=blockd%97;
		if(modd==1)//
		{
			System.out.println("OK , Mod=1");
		}
		else
		{
			System.out.println("Error,Mod="+modd);
		}
	}
	public static void main(String[] args) {
		IbanValidation.ibanValidation("AE870260001012082887102");
	}

}
