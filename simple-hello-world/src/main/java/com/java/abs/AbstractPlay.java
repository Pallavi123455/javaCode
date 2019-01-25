package com.java.abs;

public abstract class AbstractPlay {

	public void toss() { // common
		System.out.println("toss");
	}

	abstract public void play(); // cricket , football

	public void mom() { // common
		System.out.println("mom");
	}

	public final void manage() { // template method
		toss();
		play();
		mom();
	}

}
