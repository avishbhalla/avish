package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String lastName;
	private String name ;
	private String country;
	private String favCode;	
	private LinkedHashMap<String, String> countryOptions;
	private String [] os;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getFavCode() {
		return favCode;
	}

	public void setFavCode(String favCode) {
		this.favCode = favCode;
	}

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IT", "Italy");
		countryOptions.put("GR", "Germany");
		countryOptions.put("IND", "India");
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}
	
}
