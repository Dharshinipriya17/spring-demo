package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

@Autowired
private Fortune myFortuneService;

@Override
public String getDailyWorkOut() {
	return "daily running";
}

public String getDailyFortune() {
	return this.myFortuneService.getDailyFortune();
}
}