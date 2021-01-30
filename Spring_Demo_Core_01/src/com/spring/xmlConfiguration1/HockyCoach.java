package com.spring.xmlConfiguration1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.xmlConfiguration.Coach;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class HockyCoach implements Coach {

	@Autowired
	private Team team;
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Play with Hocky stick for 10 hrs";
	}

	public Team getTeam(){
		return team;
	}
	
	public String getTeamResponse(){
		return team.getTeam("Hocky");
	}
	

	
	void initBean(){
		System.out.println("HockyCoach initbean Called");
	}
	
	void destroyBean(){
		System.out.println("HockyCoach destroyBean Called");
	}
}
