package com.spring.xmlConfiguration1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Team {

	Team(){
		
	}
	
	public String getTeam(String whichTeam ){
		if("Hocky".equals(whichTeam))
			return "Hocky team is ready";
		else if("Tennis".equals(whichTeam))
			return "Tennis team is ready";
		
		return "team is ready";
	}
	
}
