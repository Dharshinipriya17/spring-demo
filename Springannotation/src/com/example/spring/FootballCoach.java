package com.example.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	@Value("$(foo.email)")
	private String emailAddress;
	@Value("$(foo.team)")
	private String team;
	

	private Fortune myFortuneService;
	public FootballCoach() {
		super();
	}
	//@Override
//	public FootballCoach(FortuneService myFortuneService ) {
	//	super();
		//this.myFortuneService=myFortuneService;
	//}
	
	@Autowired
	public void setMyFortune(FortuneService myFortuneService) {
		this.myFortuneService=myFortuneService;
	}
	@Autowired
	public void customInjection(Fortune myFortuneServiceCustom) {
		this.myFortuneService=myFortuneServiceCustom;

	}
	
@Override
public String getDailyWorkOut() {
	return "daily running";
}

public String getDailyFortune() {
	return this.myFortuneService.getDailyFortune();
}

@PostConstruct
public void doSomeInitStuff() {
	System.out.println(">> Inside doSomeInitStuff()");
}

@PreDestroy
public void doSomeCleanupStuff() {
	System.out.println(">> Inside some doSomeCleanupStuff");
}

}
