package com.love2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.love2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for sadFortuneService
	@Bean
	public HappyFortuneServiceImpl 	sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	//define bean for swimCoach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	

}
