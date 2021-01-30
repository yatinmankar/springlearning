package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
		Performer performer = (Performer) context.getBean("performerBean");
		
		performer.performShow();
		
	     context.close();
		
		
	}

}
