package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {


public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	FootballCoach myFootballCoach=context.getBean("footballCoach",FootballCoach.class);
	System.out.println(myFootballCoach.getDailyWorkOut());
	System.out.println(myFootballCoach.getDailyFortune());
	
	


	context.close();
	
}
}
