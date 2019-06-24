package com.example.springpgm;

public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("HappyFortuneServiceService: Object created");
	}
	
public String getFortune() {
	return "do is our lucky day";
}
}