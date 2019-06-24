package example;

public class GolfCoach implements Coach {


	
	
	private FortuneService myFortuneService;
	
	
	public GolfCoach() {
		super();
	
	}
	
	public GolfCoach(FortuneService myFortuneService) {
		this.myFortuneService=myFortuneService;
	}
	
	public void setMyFortuneService(FortuneService myFortuneService) {
	
		this.myFortuneService=myFortuneService;
}
	
public String getDailyFortune() {
	return myFortuneService.getFortune();
}
}
