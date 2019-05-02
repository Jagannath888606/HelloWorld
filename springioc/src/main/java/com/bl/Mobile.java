package com.bl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
	public static void main(String[] args) 
	{
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("com/bl/beans.xml");
			System.out.println("Config build");
			Sim sim=context.getBean("sim",Sim.class);
			sim.calling();
			sim.data();
	}
}
