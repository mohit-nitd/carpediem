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
		return this.bonus+this.salary;
	}
		

		public void printMyData() {
			System.out.println("Employee is Fulltime ");
			System.out.println("-"+getSalary());
			System.out.println("-"+getBonus());
			System.out.println("-"+getJoiningYear());
			
		
	}
	
}
