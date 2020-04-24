   package com.love2code.springdemo;

public class SadFortuneService implements HappyFortuneServiceImpl {

	@Override
	public String getDailyFortune() {
		
		return "Today is a sad day";
	}

}
