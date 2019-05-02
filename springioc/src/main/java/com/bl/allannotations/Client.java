package com.bl.allannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("college",College.class);
		System.out.println("College object is created in spring is: "+college);
		college.test();
		context.close();
	}
}
 