package com.monami.exam.equals_hashcode;

public class StudentOverride1 {
	String studentName;
	int studentAge;

	public StudentOverride1(String studentName, int age) {
		// TODO Auto-generated constructor stub
		this.studentName = studentName;
		this.studentAge = studentAge;

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {

		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentAge;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentOverride1 other = (StudentOverride1) obj;
		if (studentAge != other.studentAge)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
}

	


	

	


