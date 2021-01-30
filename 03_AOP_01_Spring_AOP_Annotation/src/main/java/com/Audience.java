package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

	 @Pointcut("execution(* com.Performer.*(..))")
	   public void performShow(){}	
	

	
	@Before("performShow()")
	public void takeSeats(){
		System.out.println("Audience has taken seat");
	}
	
	@Before("execution(* com.Performer.performShow(..))")
	public void putCellSwitchOff(){
		System.out.println("Audience has put their cell Switch Off");
	}
	@AfterReturning("performShow()")
	public void clapclap(){
		System.out.println("clapclap clapclap clapclap clapclap !!!!!!!!!");
	}
	@AfterThrowing("performShow()")
	public void nasty(){
		System.out.println(" Boom Boom   !!!!!!!!!");
	}
	@After("performShow()")
	public void commonMethod(){
		System.out.println("call commonMethod ");
	}
	
}
