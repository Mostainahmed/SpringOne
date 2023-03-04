package com.mostain.springdemo;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min at Batting practice";
	}
}
