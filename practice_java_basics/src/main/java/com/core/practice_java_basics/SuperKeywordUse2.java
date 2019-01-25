package com.core.practice_java_basics;

class AA {
	AA() {
		System.out.println("This is super class");
	}
}

class BB extends AA {
	BB() {
		super();
		System.out.println("THis is Child class");
	}
}

public class SuperKeywordUse2 {
	public static void main(String[] args) {
		BB aa = new BB();

	}

}
