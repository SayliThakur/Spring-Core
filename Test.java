package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorinjconfig.xml");
		ConstructorInjection ci = (ConstructorInjection) context.getBean("ci");
		
		System.out.println(ci);
	}

}
