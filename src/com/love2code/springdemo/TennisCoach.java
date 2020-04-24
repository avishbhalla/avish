package com.love2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private HappyFortuneServiceImpl thehappyFortuneServiceImpl;
	
//	@Autowired
//	public TennisCoach(HappyFortuneService theHappyFortuneService) {
//		this.thehappyFortuneService = theHappyFortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("Inside default constructor");
	}
	
//	@Autowired
//	public void setFortuneService(HappyFortuneService theFortuneService) {
//		System.out.println("inside setter method");
//		thehappyFortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice your back hand volley";
	}

	@Override
	public String getDailyFotune() {
		
		return this.thehappyFortuneServiceImpl.getDailyFortune();
	}
	
	
	//define init method
	@PostConstruct
	public void doMyStartUp() {
		System.out.println("Tennis coach bean created");
	}

	
	//define destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("CleanUp");
	}
	
	
	
	
}
