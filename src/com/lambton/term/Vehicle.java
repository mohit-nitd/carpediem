package com.lambton.term;

public abstract class Vehicle implements IPrintable{
	private String make;
	private String plate;
	private String ownerName;
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
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
		System.out.println("Owner name  "+getOwnerName()+"\n  Make =  "+getMake()+"\n  Plate=  "+getPlate());
	}
}
