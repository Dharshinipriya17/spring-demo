package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach GolfCoach=context.getBean("myGolfCoach",Coach.class);
	System.out.println(GolfCoach.getDailyFortune());

	context.close();
	
}
}
