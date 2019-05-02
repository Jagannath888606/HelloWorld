package com.bl.collectionusingconstr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet
{
	public static void main(String[] args) 
	{
		System.out.println("Build ready");
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("com/bl/collectionusingconstr/Beans.xml");
		Question question=context.getBean("question",Question.class);
		question.diplayInfo();
	}
}
