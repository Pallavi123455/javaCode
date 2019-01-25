package com.java.loading;

public class AppLoading {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class.forName("com.java.loading.Service"); // class loaded : sb1 

		Class.forName("com.java.loading.Service"); // class loaded only once : no output

		Class.forName("com.java.loading.Service").newInstance(); // creating object
		// static block and constructor
		
		Class.forName("com.java.loading.Service").newInstance(); // creating object
		// static block and constructor
		
		
	}

}
