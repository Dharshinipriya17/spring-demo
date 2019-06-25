package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class ALLcaps implements Coach {

@Override
public String getDailyWorkOut() {
	// TODO Auto-generated method stub
	return "All caps so bean is same as class name";
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return "All caps is defined"; 
}
	
	
}
