package com.java.loading;

public class AppLoading2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Service service=(Service) Class.forName("com.java.loading.Service").newInstance();
		service.m1();
		
		String str=(String) Class.forName("com.java.loading.Service").newInstance();// CCE
		System.out.println(str.length()); 
	
	}

}
