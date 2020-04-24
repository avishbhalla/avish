package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements HappyFortuneServiceImpl {

	@Override
	public String getDailyFortune() {
		return "Today is your lucky Day";
	}

}
