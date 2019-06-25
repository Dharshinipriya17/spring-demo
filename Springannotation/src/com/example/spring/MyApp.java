package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	/*ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
Coach myCoach=context.getBean("theCoach",Coach.class);
System.out.println(myCoach.getDailyWorkOut());
FootballCoach myFootballCoach=context.getBean("footballCoach",FootballCoach.class);
System.out.println(myFootballCoach.getDailyWorkOut());
System.out.println(myFootballCoach.getDailyFortune());

ALLcaps myallcaps=context.getBean("ALLcaps",ALLcaps.class);
System.out.println(myallcaps.getDailyWorkOut());
context.close(); */
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SwimConfig.class);
	Coach myCoach=context.getBean("swimCoach",Coach.class);
	System.out.println(myCoach.getDailyFortune());
	System.out.println(myCoach.getDailyWorkOut());
	context.close();

}
}
