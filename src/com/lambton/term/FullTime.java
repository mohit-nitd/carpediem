package com.lambton.term;

public class FullTime extends Employee{
	private Integer salary;
	private Integer bonus;
	private Integer joiningYear;
	
	
	
	public Integer getJoiningYear() 
	{
		return joiningYear;
	}
	
	public void setJoiningYear(Integer joiningYear) {
		this.joiningYear= joiningYear;
	}
	
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public Integer getBonus() {
		return bonus;
	}
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	
	public Integer calcEarnings() {
		return( getBonus()+getSalary());
	}
		
      @Override
      public void printMyData() {
			System.out.println("Employee is Fulltime ");
			super.printMyData();
			System.out.println("-"+getSalary());
			System.out.println("-"+getBonus());
			System.out.println("-"+getJoiningYear());
			System.out.println("-"+calcEarnings());
			
		
	}
	
}
