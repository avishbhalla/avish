package com.luv2code.springdemo.mvc.validation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class CourseCodeValidator implements ConstraintValidator<courseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(courseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext cv) {
		boolean result = theCode.startsWith(coursePrefix);		
//		if (result) {
//			return true;
//		}
//		return false;
		
		
		
		return result;
	}

	
	
}
