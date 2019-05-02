package com.bl.allannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/* @Primary */
public class MathTeacher implements Teacher 
{

	public void teach() 
	{
		System.out.println("Math teacher is nice ...");

	}

}
