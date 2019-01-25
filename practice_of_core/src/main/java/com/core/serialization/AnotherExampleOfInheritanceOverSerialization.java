package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent
{
	int i=30;

	public Parent() {
		System.out.println("Parent class constructor");
		// TODO Auto-generated constructor stub
	}
	
}
class Child extends Parent implements Serializable
{
	int j=40;

	public Child() {
		System.out.println("Child class Constructor");
	}
	
}
public class AnotherExampleOfInheritanceOverSerialization {
	public static void main(String[] args) throws Exception{
		Child aa=new Child();
		aa.i=700;
		aa.j=800;
		FileOutputStream fos=new FileOutputStream("SerInheritance.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(aa);
		FileInputStream fis=new FileInputStream("SerInheritance.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child aa1=(Child) ois.readObject();
		System.out.println("  "+aa1.i+"  "+aa1.j);
	}

}
