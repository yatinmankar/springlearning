package com;

import javax.swing.text.BadLocationException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware, BeanNameAware {
	
	private int id;
	private String name;
	private ApplicationContext context;
	
	
	private Address addr;
	Employee(){
	
		System.out.println("Constructor Employee called ");
	}
	
	Employee(int id,String name,Address addr){
		this.id=id;
		this.name=name;
		this.addr=addr;
		System.out.println("Constructor Employee param called ");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Address getAddr() {
		return addr;
	}

	
	public void setAddr(Address addr) {
		System.out.println("setAddr called");
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getAddr()=" + getAddr() + "]";
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) throws BadLocationException {
		this.context = context;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Bean name "+name);
		
	}
	
	
	

}
