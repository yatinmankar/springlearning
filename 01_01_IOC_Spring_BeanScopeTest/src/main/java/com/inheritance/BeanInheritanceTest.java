package com.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BeanInheritanceTest {
	public static void main(String args[]) 
	{
		
	
		
		/*HelloWorld ob= new HelloWorld();
		ob.getMessage1();
		ob.getMessage2();*/
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml");
		//= new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld"); 
		objA.getMessage1();
		objA.getMessage2(); 
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1(); 
		objB.getMessage2();
		objB.getMessage3();
	}

}
