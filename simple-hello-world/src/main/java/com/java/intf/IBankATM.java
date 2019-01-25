package com.java.intf;

public interface IBankATM {

	public int x = 10; // public static final
	// Illegal modifier for the interface field IService.x; only public, static &
	// final are permitted

	public void retrieveCash(); // public abstract
	// private void m2();// llegal modifier for the interface method m2; only public
	// & abstract are permitted

	// either accessible by object[methods] (not class names) or constant variables
}
