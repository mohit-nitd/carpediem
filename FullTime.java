package com.lambton.term;

public class FullTime {
	private Integer salary;
	private Integer bonus;
	
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
	
}
