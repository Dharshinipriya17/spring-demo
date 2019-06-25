package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements Fortune {
	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is good day";
	}
}
