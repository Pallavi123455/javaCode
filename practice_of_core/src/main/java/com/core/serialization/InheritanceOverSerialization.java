package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	int i=20;
}
class Cat extends Dog{
	int j=20;
}
public class InheritanceOverSerialization {
	public static void main(String[] args)throws Exception {
		Cat cc=new Cat();
		FileOutputStream fos=new FileOutputStream("inheritance.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(cc);
		FileInputStream fis=new FileInputStream("inheritance.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cat cc1=(Cat)ois.readObject();
		System.out.println(""+cc1.i+"   "+cc1.j);
	}

}
