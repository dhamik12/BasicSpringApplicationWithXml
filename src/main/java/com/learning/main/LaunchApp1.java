package com.learning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.AdmitionDepartment;


public class LaunchApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Spring container Started.");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AdmitionDepartment admin =context.getBean("admin", AdmitionDepartment.class);
		admin.enrollment();
		
		System.out.println("Spring container stoped.");
		
		

	}

}
