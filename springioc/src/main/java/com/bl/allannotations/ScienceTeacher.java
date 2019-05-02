package com.bl.allannotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher 
{

	public void teach() 
	{
		System.out.println("Science teacher is nice ...");

	}

}
