package com;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class BeanScopeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Resource resource 
		//BeanFactory   context = new XmlBeanFactory(new ClassPathResource("xmlFIle/bean-scope.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("xmlFIle/bean-scope.xml");
		/*TestEditor te = (TestEditor) context.getBean("TestEditorBean");
		System.out.println(te.getsChecker().getS());
	     
		SpellChecker s = (SpellChecker) context.getBean("SpellCheckerBean");
		s.setS("yatin");
		System.out.println(s.getS());
		
		System.out.println(te.getsChecker().getS());
		
		TestEditor te2 = (TestEditor) context.getBean("TestEditorBean");
		System.out.println(te2.getsChecker().getS());
	    		
	    //context.close();
		
	    
		SpellChecker s1 = (SpellChecker) context.getBean("SpellCheckerBean");
		SpellChecker s2 = (SpellChecker) context.getBean("SpellCheckerBean");
	    
		System.out.println("s1 "+s1.hashCode());
		System.out.println("s2 "+s2.hashCode());

		
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("bean-scope.xml");
		SpellChecker s3 = (SpellChecker) context1.getBean("SpellCheckerBean");
		SpellChecker s4 = (SpellChecker) context1.getBean("SpellCheckerBean");
	    
		System.out.println("s3 "+s3.hashCode());
		System.out.println("s4 "+s4.hashCode());

		context.close();
		context1.close();*/
		
		
/*		Address adr = (Address) context.getBean("addBean");
		System.out.println("line1 "+adr.getAddLine1());*/
		
		
		Employee emp = (Employee) context.getBean("empBean");
		//Employee emp1 = (Employee) context.getBean("empBean");
		System.out.println("emp "+emp);
		System.out.println("address "+emp.getAddr());
	
		/*Employee emp2 = (Employee) context.getBean("empBean1");
		Employee emp3 = (Employee) context.getBean("empBean2");
		
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());*/
		
	}

}
