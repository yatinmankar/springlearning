package com.spring.xmlConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.xmlConfiguration1.Team;

@Component
//@Scope("prototype")
@Scope("singleton")
public class TennisCoach implements Coach {

	
	TennisCoach(){
		System.out.println("TennisCoach constructor called");
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Play with Tennis Ball for 10 hrs";
	}

	@Autowired
	private Team team;
	
	public Team getTeam(){
		return team;
	}
	public String getTeamResponse(){
		return team.getTeam("Tennis");
	}
	
	@PostConstruct
	void initBean(){
		System.out.println("TennisCoach initbean Called");
	}
	@PreDestroy
	void destroyBean(){
		System.out.println("TennisCoach destroyBean Called");
	}
	
}


