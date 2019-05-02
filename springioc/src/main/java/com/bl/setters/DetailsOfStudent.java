package com.bl.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DetailsOfStudent 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bl/setters/Beans.xml");
		Student firstStudentInfo=context.getBean("student1",Student.class);
		firstStudentInfo.displayStudentInfo();
		Student secondStudentInfo=context.getBean("student2",Student.class);
		secondStudentInfo.displayStudentInfo();
	}
}
