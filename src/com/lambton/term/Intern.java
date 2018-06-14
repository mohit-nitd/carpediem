package com.lambton.term;

public class Intern extends Employee {
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
		
		
	@Override
	 public void printMyData()
		    {
		        System.out.println("Employee is Intern");
		        super.printMyData();
		        System.out.println("\tSchoolName:     " + getSchoolName());
		    
	}
	
}
