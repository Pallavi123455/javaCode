package com.core.core;

class Human {
	   public void display() {
	      System.out.println("Human can talk");
	   }
	}

	class Ram extends Human {
	   public void display() {
	      System.out.println("Ram is a boy");
	   }
	}

	public class OverrideExample {

	   public static void main(String args[]) {
	      Human a = new Human();  
	      Human b = new Ram();   
	      a.display();   
	      b.display();   
	   }
	}