package com.mostain.springdemo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Assalamualaikum, I hope you have a good day!";
	}

}
