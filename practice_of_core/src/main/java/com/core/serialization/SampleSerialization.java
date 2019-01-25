package com.core.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

public class SampleSerialization {
	public static void main(String[] args) throws Exception{
		Save obj=new Save();
		obj.i=4;
		obj.j=20;
		obj.k=30;
		File f=new File("sa.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj1=(Save) ois.readObject();
		System.out.println(obj1);
		System.out.println(""+obj1.i+"   "+obj1.j+"   "+obj.k+"   "+obj.p);
	}
}
class Save implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
	transient int j;
	transient static int k;//No use of the keyword transient
	final transient int p=40;//No use of transient
}
