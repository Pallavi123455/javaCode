package com.java.inheri;

public final class Child extends Parent {

	private int z;
	public int x;

	public int getX() {
		System.out.println("child");
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void m3() {
		System.out.println("m3()");
	}

	// alt shift s v
	@Override
	protected void m2() {
		// TODO Auto-generated method stub
		// super.m2();
		System.out.println("m2(): from child impl overidden");
	}

	@Override
	public String toString() {
		return "Child [z=" + z + ", x=" + x + "]";
	}

	public static void m4() {
		System.out.println("m4() child");
	}
}
