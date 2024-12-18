package com.learning.beans;

public class AdmitionDepartment {
	
	private Course course;
	

	public AdmitionDepartment() {
		super();
		//System.out.println("Admition Department Object created.");
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	

	

	public boolean enrollment()
	{
		System.out.println("********Welcome To Hyder Abbas Training Institute***********");
		return course.coursePurchase( );
		
	}
}
