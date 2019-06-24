package com.example.springpgm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Properties-applicationcontext.xml");

	BaseballCoach myCoach=context.getBean("myBaseballCoach",BaseballCoach.class);
	BaseballCoach myCoach1=context.getBean("myBaseballCoach",BaseballCoach.class);
boolean result=(myCoach==myCoach1);
System.out.println("mycoach and mycoach1 are same object:"+result);
System.out.println("mycoach memory address:"+myCoach);
System.out.println("mycoach1 memory address:"+myCoach);

	//System.out.println(myCoach.getDailyWorkOut());
	//System.out.println(myCoach.getDailyFortune());
    //System.out.println("Email:"+myCoach.getEmail());
    //System.out.println("Team:"+myCoach.getTeam());


	context.close();
	
}
}
