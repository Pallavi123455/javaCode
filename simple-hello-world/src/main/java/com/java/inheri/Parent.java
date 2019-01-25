package com.java.inheri;

public class Parent {

	public int x;
	protected int y;
	private int w;
	
	// alt shift s r 
	
	public void m1() {
		System.out.println("m1()");
	}
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected void m2()
	{
		System.out.println("m2()");
	}

	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + ", w=" + w + "]";
	}
	
	// alt shift s s
	
	public static void m4()
	{
		System.out.println("m4()");
	}
}
