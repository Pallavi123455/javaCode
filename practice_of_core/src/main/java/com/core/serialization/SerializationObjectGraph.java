package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cow implements Serializable
{
	Rat aa=new Rat();
}
class Rat implements Serializable
{
	Elephant ee=new Elephant();
}
class Elephant implements Serializable
{
	int j=20;
}
public class SerializationObjectGraph {
	public static void main(String[] args) throws Exception{
		Cow cc=new Cow();
		FileOutputStream fos=new FileOutputStream("demo1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(cc);
		FileInputStream fis=new FileInputStream("demo1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cow cc1=(Cow) ois.readObject();
		System.out.println(cc1.aa.ee.j);
	}

}
