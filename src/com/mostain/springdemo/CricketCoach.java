package com.mostain.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Now setting email address");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Now setting team name");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 10 mins says "+this.team+" coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hey all my bowlers, "+fortuneService.getFortune()+ " and for more update contact "+this.emailAddress;
	}

}
