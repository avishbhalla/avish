package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		
		System.out.println("Using javaConfig");
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get beans from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method of the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method for autowiring testing
		
		System.out.println(theCoach.getDailyFotune());
		
		//close the context
		context.close();
	}
}
