package com.bl.annotations;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection 
{
	
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.user}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.driver}")
	private String driver;
	
	public void display()
	{
		System.out.println(url +" "+ username+" "+ password+" "+driver);
	}
	
	public void getConnectionToDatabase() throws Exception
	{
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url,username,password);
		System.out.println("Connection successfull");
	}
}
