package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.courseCode;

public class Customer {

	private String firtName;
	
	@NotNull(message="is required")
	@Size(min=1)
	private String lastname;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10") 
	private Integer freePasses;

	@Pattern(regexp ="^[a-zA-Z0-9]{5}", message="only 5 characters allowed")
	private String postalCode;
	
	@courseCode(value="LUV", message="must start with LUV")
	private String courseCod;
	
	
	
	
	public String getCourseCod() {
		return courseCod;
	}


	public void setCourseCod(String courseCod) {
		this.courseCod = courseCod;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getFirtName() {
		return firtName;
	}


	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Integer getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
}
