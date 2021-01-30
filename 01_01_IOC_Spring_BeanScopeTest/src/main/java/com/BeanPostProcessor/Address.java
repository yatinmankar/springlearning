package com.BeanPostProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address  {

	@Override
	public String toString() {
		return "Address [addLine1=" + addLine1 + ", addLine2=" + addLine2 + "]";
	}
	String addLine1;
	String addLine2;
	
	Address(){
	//	System.out.println("Constructor Address called ");
	}
	
	Address(String line1,String line2){
		addLine1=line1;
		addLine2=line2;
	//	System.out.println("Constructor Address param called ");
		
	}
	
	
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	
	public void myDestroy(){
		//  System.out.println(" address myDestroy called");
			
		}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
