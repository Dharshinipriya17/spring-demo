package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
private Fortune myFortuneService;
public SwimCoach() {
	super();
}
public SwimCoach(Fortune myFortuneService) {
	this.myFortuneService=myFortuneService;
}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "do not try this";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getDailyFortune();
		
	}
	
}
