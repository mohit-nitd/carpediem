package com.lambton.term;

public abstract class PartTime extends Employee implements IPrintable{
	
	private Integer hoursWorked;
	private Integer rate;
	
	public Integer getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(Integer hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	@Override
	public void printMyData() {
		super.printMyData();
		System.out.println("-Rate: "+getRate()+"\n-Hours: "+getHoursWorked());
	}
}
