package com.core.practice_java_basics;
//Super keyword is used as the reference of the Parent class instance Variable
class SupperParent {
	int i = 5;
}

class SupperChild extends SupperParent {
	int i = 20;

	void display() {
		System.out.println(super.i);
		System.out.println(i);
	}
}

public class SuperKeywordUse {
	public static void main(String[] args) {
		SupperChild aa = new SupperChild();
		aa.display();

	}

}
