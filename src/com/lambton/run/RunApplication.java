package com.lambton.run;

import com.lambton.term.CommisionBasedPartTime;
import com.lambton.term.Motorcycle;
import com.lambton.term.Car;

public class RunApplication {
	public static void main(String[] args) {
		CommisionBasedPartTime commissionBasedEmployee1 = new CommisionBasedPartTime();
		Motorcycle motorcycle1 = new Motorcycle();
		Car c1 = new Car();
		c1.setAvgOfCar(10);
		c1.setCostOfFuel(100);
		c1.setDistanceTravelInOneDay(100);
		c1.setPlate("jatt bullet te bullet 100 te");
		c1.setOwnerName("Mohit pal");
		c1.setNumOfSeats(8);
		c1.setNumberOfDoors(6);
		c1.setMonthlyAttendance(22);
		c1.setMake("Aston Martin");
		c1.printMyData();
		
		
		
		motorcycle1.setKerbWeight(110);
		motorcycle1.setMake("Royal Enfield");
		motorcycle1.setPlate("JATT");
		commissionBasedEmployee1.setAge(25);
		commissionBasedEmployee1.setidCardNo(5000);
		commissionBasedEmployee1.setMobNum(437971220);
		motorcycle1.setOwnerName("Mohit pal");
		commissionBasedEmployee1.setName("Mohit");
		commissionBasedEmployee1.setHoursWorked(40);
		commissionBasedEmployee1.setRate(20);
		commissionBasedEmployee1.setCommissionPerc(20);		
		commissionBasedEmployee1.setVehicle(motorcycle1);
		commissionBasedEmployee1.printMyData();
		commissionBasedEmployee1.getVehicle().printMyData();
		
		
	}
}
