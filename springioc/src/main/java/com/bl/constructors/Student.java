package com.bl.constructors;

public class Student 
{
	private String studentName;
	private int id;
	
	
	public Student(int id) {
		this.id = id;
	}


	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}


	public void displayStudentInfo()
	{
		System.out.println("Student Name: "+studentName+" and id is: "+id);
	}

}
