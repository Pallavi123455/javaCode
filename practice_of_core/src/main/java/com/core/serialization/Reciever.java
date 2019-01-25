package com.core.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.core.serializationuid.Doc;

public class Reciever {
	public static void main(String[] args)throws Exception {
		final long serialVersionUID = 1L;
		FileInputStream fis=new FileInputStream("dog.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Doc d2=(Doc)ois.readObject();
		System.out.println("   "+d2.i+"   "+d2.j+"   "+d2.k);
	}

}
