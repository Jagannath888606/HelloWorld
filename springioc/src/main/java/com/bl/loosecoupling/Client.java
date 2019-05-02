package com.bl.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
	public static void main(String[] args) 
	{
		System.out.println("Bean is ready to start.........");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bl/loosecoupling/Beans.xml");
		AirtelServiceCenter airtel=context.getBean("airtel",AirtelServiceCenter.class);
		airtel.serviceAlerts();
	}
}
