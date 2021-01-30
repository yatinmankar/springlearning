package com;

import org.springframework.stereotype.Component;


@Component
public class Performer {

	public void performShow(){
		System.out.println("Performer is dancing");
		
		//throw new RuntimeException();
	}
	
	public void performSing(){
		System.out.println("Performer is singing");
		
		//throw new RuntimeException();
	}
	
	
}
