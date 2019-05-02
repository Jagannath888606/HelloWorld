package com.bl.objects;

public class Student 
{
	private int id;
	private MathsSubject maths;
	public void setId(int id) {
		this.id = id;
	}
	public void setMaths(MathsSubject maths) {
		this.maths = maths;
	}
	public void details()
	{
		System.out.println("Student id is: "+id);
		maths.mathsDetails();
		
	}

}
