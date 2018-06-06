package com.lambton.term;

public abstract class Vehicle implements IPrintable{
	private String make;
	private String plate;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	@Override
	public void printMyData() {
		System.out.println("-"+getMake()+"\n-"+getPlate());
	}
}
