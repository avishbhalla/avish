package com.love2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements HappyFortuneServiceImpl {

	private String[] data = {"Beware the wolf in sheep clothing", 
			"Diligence is the mother of good luck", 
			"The journey is the reward"
			} ;
	
	private Random myRandom = new Random();
	
	@Override
	public String getDailyFortune() {
		// Pick a random number from array length
		
		int index = myRandom.nextInt(data.length);
		
		
		return data[index];
	}

}
