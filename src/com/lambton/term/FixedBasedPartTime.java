package com.lambton.term;

public class FixedBasedPartTime extends PartTime{
	private int fixedAmmount;
	
	public int getFixedAmmount() {
		return fixedAmmount;
	}
	public void setFixedAmmount(int fixedAmmount) {
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
		System.out.println("-Earnings: " +calcEarnings());
	
	}
}
