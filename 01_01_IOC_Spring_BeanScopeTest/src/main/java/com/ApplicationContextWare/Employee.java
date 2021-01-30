package com.ApplicationContextWare;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int id;
	private String name;
	
	
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
	
	
	

}
