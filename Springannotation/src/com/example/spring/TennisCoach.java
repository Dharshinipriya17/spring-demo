package com.example.spring;

import org.springframework.stereotype.Component;

@Component("theCoach")
public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		 return "practice back hand today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "routine day";
	}
	
	
}
