package com.bl.allannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan(basePackages="com.bl.allannotations")
public class CollegeConfig
{
	/*
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public Teacher mathTeacherBean() { return new MathTeacher(); }
	 * 
	 * 
	 * @Bean public College collegeBean() { College college=new College(); //college
	 * bean-id college.setPrincipal(principalBean());
	 * college.setTeacher(mathTeacherBean()); return college; }
	 */
}
