package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable
{
	String userName="Sakti";
	transient String password="fgdfdf";
	transient int pinNo=2234;
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String epwd="123"+password;
		os.writeObject(epwd);
		int epin=64783+pinNo;
		os.writeInt(epin);
		
	}
	private void readObject(ObjectInputStream is)throws Exception
	{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		int epin=is.readInt();
		password=epwd.substring(3);
		pinNo=epin-64783;
	}
}
public class ExampleOfCustomizedSerialization {
public static void main(String[] args) throws Exception {
	Account1 aa1=new Account1();
	FileOutputStream fos=new FileOutputStream("Account1.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(aa1);
	FileInputStream fis=new FileInputStream("Account1.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Account1 ab=(Account1)ois.readObject();
	System.out.println(""+ab.userName+"    "+ab.password+"  "+ab.pinNo);
}
}
