package com.spring.xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.xmlConfiguration1.HockyCoach;
import com.spring.xmlConfiguration1.Team;

public class ApplicationXmlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-scope.xml");
		//XmlBeanFactory context = new XmlBeanFactory (new ClassPathResource("bean-scope.xml"));
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-scope.xml");

		System.out.println("Singleton");
		
		TennisCoach coach2=context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach coach4=context.getBean("tennisCoach", TennisCoach.class);
		Team team1=context.getBean("team", Team.class);
		Team team2=context.getBean("team", Team.class);
		
		System.out.println(coach2.getDailyWorkOut());
		System.out.println(coach2.getTeamResponse());
		System.out.println("Coach 2 "+coach2);
		
		System.out.println("Coach 4 "+coach4);
		System.out.println("Coach 2  team"+coach2.getTeam());
		System.out.println("Coach 4  team"+coach4.getTeam());
		
		System.out.println("team 1  "+team1);
		System.out.println("team 2  "+team2);
		
		/*System.out.println("prototype");
		
		HockyCoach coach1=context.getBean("hockyCoach", HockyCoach.class);
		Coach coach3=context.getBean("hockyCoach", HockyCoach.class);
		
		System.out.println(coach1.getDailyWorkOut());
		System.out.println(coach1.getTeamResponse());
		System.out.println(coach1);
		System.out.println(coach3);*/
		
		context.close();
		
		
	}

}
