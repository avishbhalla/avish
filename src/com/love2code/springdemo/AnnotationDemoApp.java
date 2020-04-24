package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
