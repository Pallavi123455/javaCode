package com.java.loading;

public class AppLoading1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class.forName("com.java.loading.Service", false, AppLoading1.class.getClassLoader());
		// false : supress the class loading into jvm
		
		Class.forName("com.java.loading.Service", false, AppLoading1.class.getClassLoader()).newInstance();
		
	
	}
}
