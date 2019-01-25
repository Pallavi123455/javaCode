package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String name="Pallavi";
	transient String password="ydgsfdsf";
}
public class LossOfInformationDueTotransientKeyword {
	public static void main(String[] args) throws Exception {
		Account account=new Account();
		FileOutputStream fos=new FileOutputStream("account.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(account);
		FileInputStream fis=new FileInputStream("account.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account account1=(Account) ois.readObject();
		System.out.println(" "+account1.name+" "+account1.password);
	}
}
