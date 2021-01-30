package com.BeanPostProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;



public class Employee implements InitializingBean , DisposableBean {
	
	private int id;
	private String name;
	
	
	
	private Address addr;
	Employee(){
	
		//System.out.println("Constructor Employee called ");
	}
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	
		//System.out.println("Constructor Employee 2 param called ");
	}
	
	
	Employee(int id,String name,Address addr){
		this.id=id;
		this.name=name;
		this.addr=addr;
		//System.out.println("Constructor Employee 3 param called ");
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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	//	System.out.println(" Called after all propery set");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(" Destroy called");
		
	}
	
	public void myInit(){
	//	System.out.println(" employee myInit called");
	 }
	
    public void myDestroy(){
	 // System.out.println(" employee myDestroy called");
		
	}

}
