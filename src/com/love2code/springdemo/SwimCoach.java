package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private HappyFortuneServiceImpl thefortunService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	
	public SwimCoach(HappyFortuneServiceImpl theFortune) {
		this.thefortunService = theFortune;
		
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters for warmup";
	}

	@Override
	public String getDailyFotune() {
		return this.thefortunService.getDailyFortune();
	}

}
