package com.lambton.term;

public class FixedBasedPartTime extends PartTime{
	private Float fixedAmmount;
	
	public Float getFixedAmmount() {
		return fixedAmmount;
	}
	public void setFixedAmmount(Float fixedAmmount) {
		this.fixedAmmount = fixedAmmount;
	}
	
	public float calcEarnings() {
		return (getRate()*getHoursWorked())+getFixedAmmount();
	}
	@Override
	public void printMyData() {
		String employeeType = "Employee is  FixedBasedPartTime"; 
		super.printMyData();
		System.out.println(employeeType);
		System.out.println("-Earnings: " +(getRate()*getHoursWorked())+getFixedAmmount());
	
	}
}
