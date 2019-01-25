package com.monami.exceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) {
		FileReader fr=null;
		 try {
			 File file=new File("C://Company/a.txt");
			 fr=new FileReader();
			 char a[]=new char[500];
			 fr.read(a);
			 for(char c:a)
			 {
				 System.out.println(c);
			 }}catch(IOException e)
			 {
				 e.printStackTrace();
			 }
			 {
				 try {
					 fr.clone();
				 }catch(IOException e1)
				 {
					 e1.printStackTrace();
				 }
			 }
		 }
	

