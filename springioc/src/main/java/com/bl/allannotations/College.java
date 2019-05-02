package com.bl.allannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College 
{
	/* */
	
	private String collegeName;
	@Required
	 @Value("avrsvr")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	
	/*
	 * @Autowired public void setPrincipal(Principal principal) { this.principal =
	 * principal; System.out.println("Set method is working fine.."); }
	 * 
	 * @Autowired public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * }
	 */

	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */
	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is: "+collegeName);
		System.out.println("Test is working fine....");
	}
}
