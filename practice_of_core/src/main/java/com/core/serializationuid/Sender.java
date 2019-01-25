package com.core.serializationuid;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
	public static void main(String[] args)throws Exception {
	Doc d1=new Doc();
	final long serialVersionUID = 1L;
	d1.i=888;
	d1.j=999;
	FileOutputStream fos=new FileOutputStream("dog.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d1);
	System.out.println(d1.i+"     "+d1.j+"    "+d1.k);
	}

}
