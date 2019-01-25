package com.monami.collection.model;

public class Employee {

	private int id;
	private String name;
	private String address;
	public Employee(int i, String string, String string2) {
		this.id=i;
		this.name=string;
		this.address=string2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	}


