package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		System.out.println("Using javaConfig");
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get beans from container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method of the bean
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method for autowiring testing
		
		System.out.println(theCoach.getDailyFotune());
		
		//close the context
		context.close();
	}
}
