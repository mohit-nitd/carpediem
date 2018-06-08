package com.lambton.term;

public class Motorcycle extends Vehicle{
	private float kerbWeight;

	public float getKerbWeight() {
		return kerbWeight;
	}

	public void setKerbWeight(float kerbWeight) {
		this.kerbWeight = kerbWeight;
	}
	@Override
	public void printMyData() {
		System.out.println("Employee has a Motorcycle");
		super.printMyData();
		System.out.println("-"+getKerbWeight());
	}
}
