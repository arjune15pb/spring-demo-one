package com.luv2code.springdemo;

public class TrackCoach implements Coach {
   
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
	
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "just Do it: "+fortuneService.getFortune();
	}

	// add an inti method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	// add a destroy method
	public void doMyCleanupStufffYoYo(){
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");

	}

}
