package com.monami.interfacee;

public class MainAdmin {
	public static void main(String[] args) {
		String DepartmentName;
		int DepartmentId;
		System.out.println("Hello World!");
		AdminDepartment aa = new AdminDepartment();
		aa.setDepartment(1,"Physics");
		DepartmentName=aa.getDepartmentName();
		DepartmentId=aa.getDepartmentId();
		int EmployeeTotal=aa.getEmployeeTotal();
		Department aa1 = new AdminDepartment();
		aa1.setDepartment(2,"Math");
		int DepartmentIdd = aa1.getDepartmentId();
		String Departmentnamee=aa1.getDepartmentName();

		Employee ee=new AdminDepartment();
		ee.setValue(21, "Ashu");
		int EmployeeId=ee.getEmployeeId();
		String EmployeeName=ee.getEmployeeName();
		System.out.println("Department id"+DepartmentId+"DEpartment Name"+DepartmentName);
		System.out.println("Department id"+DepartmentIdd+"DEpartment Name"+Departmentnamee);
		System.out.println("Employee id"+EmployeeId+"Employee Name"+EmployeeName);
		
	}

}

