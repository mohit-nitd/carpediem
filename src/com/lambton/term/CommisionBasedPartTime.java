package com.lambton.term;

public class CommisionBasedPartTime extends PartTime implements IPrintable{
	private int commissionPerc;

	public float getCommissionPerc() {
		return commissionPerc;
	}

	public void setCommissionPerc(int commissionPerc) {
		this.commissionPerc = commissionPerc;
	}
	
	public Float calcEarnings() {
		return (getHoursWorked()*getRate())+((getHoursWorked()*getRate())*getCommissionPerc())/100;
	}
	
	@Override
	public void printMyData() {
		String employeeType = "Employee is PartTime / Commissioned"; 
		super.printMyData();
		System.out.println(employeeType);
		System.out.println("-Earnings: " + calcEarnings() 
			+ "(" + getHoursWorked() * getRate()+ " + "+getCommissionPerc() + "%)");
	}
}
