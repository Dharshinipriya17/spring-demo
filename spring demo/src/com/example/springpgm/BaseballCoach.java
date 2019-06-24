package com.example.springpgm;

public class BaseballCoach implements Coach {
	
	private FortuneService myFortuneService;
	private String email;
	private String team;
	
	public BaseballCoach(FortuneService myFortuneService) {
		this.myFortuneService=myFortuneService;
	}
	
	
	public BaseballCoach() {
		super();
		System.out.println("BaseballCoach Object created");
	}
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	
	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("Setter object");
		this.myFortuneService=myFortuneService;
}
	
public String getDailyWorkOut() {
	return "do 500 pushups daily";
}
public String getDailyFortune() {
	return myFortuneService.getFortune();
}

}