package com.lambton.term;

public abstract class Vehicle implements IPrintable{
	private String make;
	private String plate;
	private Integer monthlyAttendance;
	private int milage;
	 private Integer distanceTravelInOneDay;
	 
	 public Integer getDistanceTravelInOneDay() {
			return distanceTravelInOneDay;
		}
		public void setDistanceTravelInOneDay(Integer distanceTravelInOneDay) {
			this.distanceTravelInOneDay = distanceTravelInOneDay;
		}
	
	
	
	public int getmilage() {
		return milage;
	}

	public void setMilage(int avgOfCar) {
		this.milage = avgOfCar;
	}
	
	public Integer getMonthlyAttendance() {
		return monthlyAttendance;
	}

	public void setMonthlyAttendance(Integer monthlyAttendance) {
		this.monthlyAttendance = monthlyAttendance;
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
		System.out.println("\nMake =  "+getMake()+"\nPlate = "+getPlate());
	}
}
