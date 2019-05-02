package com.bl.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bl/annotations/Beans.xml");
		JDBCConnection connection=context.getBean("jdbc",JDBCConnection.class);
		connection.display();
		connection.getConnectionToDatabase();
	}
}
