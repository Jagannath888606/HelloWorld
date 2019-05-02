package com.bl.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("Client ready to getting details");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bl/objects/Beans.xml");
		Student student=context.getBean("student1",Student.class);
		student.details();
		AnotherStudent anotherStudent= context.getBean("student2",AnotherStudent.class);
		anotherStudent.detailsEntire();
	}
}
