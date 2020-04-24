package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeValidator.class)  //helper class that contains business logic and validation
@Target({ElementType.METHOD, ElementType.FIELD})      //can apply our annotation on a method or a field
@Retention(RetentionPolicy.RUNTIME)                   //retain this annotation in java class file....process it at runtime
public @interface courseCode {   

	//define default course code
	public String value() default "LUV";
	
	//define default error message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
