package com.lambton.term;

import java.util.Calendar;

public abstract class Employee implements IPrintable{
	
	private String name;
	private Integer age;
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer calcBirthYear() {
		return Calendar.getInstance().get((Calendar.YEAR))-this.age;
	}
	
	
	
	
}
