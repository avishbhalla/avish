package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are same objects(Singleton)
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(result);
		
		System.out.println("memory location for the theCoach" + theCoach);
		
		System.out.println("memory location for the alphaCoach" + alphaCoach);
	}

}
