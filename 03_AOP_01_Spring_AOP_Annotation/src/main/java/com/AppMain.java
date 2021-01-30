package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppMain.class);

		Performer performer = (Performer) context.getBean("performer");
		performer.performShow();
		performer.performSing();
        context.close();
		
		
	}

}
