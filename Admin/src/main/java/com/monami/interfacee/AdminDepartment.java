package com.monami.interfacee;
public class AdminDepartment implements Department,Employee 
{
	int id;
	String name;

	public void setDepartment(int id,String Name) {
		System.out.println("This is method1");
		this.id=id;
		this.name=name;	
		
	}

	public int getDepartmentId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getEmployeeTotal()
	{
		return 100;
		
	}

	public int getEmployeeId() {
		
		return id;
	}

	public String getEmployeeName() {
		
		return name;
	}
	public void setValue(int id, String name) {
		this.id=id;
		this.name=name;
	}

}
