package com.learning.beans;

public class JavaCourse implements Course{
	
	private String courseId;
	private Float courseFees;
	private Integer courseDurationInMonths;
	
	
	

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}




	public void setCourseFees(Float courseFees) {
		this.courseFees = courseFees;
	}




	public void setCourseDurationInMonths(Integer courseDurationInMonths) {
		this.courseDurationInMonths = courseDurationInMonths;
	}




	@Override
	public boolean coursePurchase() {
		
		System.out.println("Congratulations, You have enrolled for Java Course.");
		System.out.println( "Course Id :"+ courseId+".");
		System.out.println( "Amount paid :"+ courseFees+".");
		System.out.println("Course Duration :"+ courseDurationInMonths +" months.");
		return true;
	}

}
