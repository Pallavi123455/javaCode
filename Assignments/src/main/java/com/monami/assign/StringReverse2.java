package com.monami.assign;

public class StringReverse2 {
	public static void main(String[] args) {
		String str="I LOVE INDIA";
		String reverse=new StringBuffer(str).reverse().toString();
		//String reverse = new StringBuffer(str).reverse().toString();
        System.out.printf(" original String :%s, reversed String %s  %n", str, reverse);
        System.out.println("Orignal String"+str);
        System.out.println("reversed String"+reverse);
     
        //Reverse String in Java with Using StringBuilder
        str = "Dinesh on Java";
        reverse = new StringBuilder(str).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s %n", str, reverse);
     
        //Reverse String in Java without Using StringBuffer or StringBuilder
        str = "Dinesh on Java";
        reverse = reverse(str);
        System.out.printf(" original String : %s , reversed String %s %n", str, reverse);
    }  
 
 
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }
   

	}


