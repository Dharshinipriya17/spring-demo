package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "good day";
	}

	
	
}
