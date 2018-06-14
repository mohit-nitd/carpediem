package com.lambton.run;

import com.lambton.term.CommisionBasedPartTime;
import com.lambton.term.FullTime;
import com.lambton.term.Intern;
import com.lambton.term.FixedBasedPartTime;
import com.lambton.term.Motorcycle;

import java.util.Scanner;

import com.lambton.term.Car;

public class RunApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CommisionBasedPartTime EMPLOYEE
		CommisionBasedPartTime commissionBasedEmployee1 = new CommisionBasedPartTime();
		Motorcycle motorcycle1 = new Motorcycle();

		// FixedBasedPartTime EMPLOYEE
		Car car2 = new Car();
		FixedBasedPartTime fixedBasePartTime1 = new FixedBasedPartTime();

		// INTERN EMPLOYEE
		Car car3 = new Car();
		Intern internEmployee1 = new Intern();

		// FULL TIME EMPLOYEE
		Car car1 = new Car();
		FullTime fullTimeEmployee1 = new FullTime();

		System.out.println("Enter Employee ID Number");

		int idCardNo = sc.nextInt();

		switch (idCardNo) {

		case 5000: {
			
			motorcycle1.setKerbWeight(110);
			motorcycle1.setMake("Royal Enfield");
			motorcycle1.setPlate("JATT");
			commissionBasedEmployee1.setAge(25);
			commissionBasedEmployee1.setidCardNo(5000);
			commissionBasedEmployee1.setMobNum(437971220);
			commissionBasedEmployee1.setName("Mohit");
			commissionBasedEmployee1.setHoursWorked(40);
			commissionBasedEmployee1.setRate(20);
			commissionBasedEmployee1.setCommissionPerc(20);
			commissionBasedEmployee1.setVehicle(motorcycle1);
			commissionBasedEmployee1.printMyData();
			commissionBasedEmployee1.getVehicle().printMyData();
		} break;
		case 5001: {
			
			car2.setCostOfFuel(100);
			car2.setPlate("MANINDER");
			car2.setDistanceTravelInOneDay(90);
			car2.setNumOfSeats(2);
			car2.setMake("MERC");
			car2.setMilage(5);
			car2.setMonthlyAttendance(15);
			car2.monthlyFuelExpenses();
			car2.printMyData();

			System.out.println("enter age of employee");
			int z = sc.nextInt();
			fixedBasePartTime1.setAge(z);
			fixedBasePartTime1.setVehicle(car2);
			fixedBasePartTime1.setRate(50);
			System.out.println("ENTER NAME OF EMPLOYEE");
			String bat = sc.next();
			fixedBasePartTime1.setName(bat);
			fixedBasePartTime1.setMobNum(1234567);
			fixedBasePartTime1.setidCardNo(5001);
			fixedBasePartTime1.setHoursWorked(150);
			fixedBasePartTime1.setFixedAmmount(4000.0f);
			fixedBasePartTime1.calcBirthYear();
			fixedBasePartTime1.calcEarnings();
			fixedBasePartTime1.printMyData();
		} break;
		case 5002: {
			
			car3.setCostOfFuel(100);
			car3.setPlate("NISHAN");
			car3.setDistanceTravelInOneDay(90);
			car3.setNumOfSeats(2);
			car3.setMake("AUDI");
			car3.setMilage(5);
			car3.setMonthlyAttendance(30);
			car3.monthlyFuelExpenses();
			car3.printMyData();

			internEmployee1.setVehicle(car3);
			internEmployee1.setStipend(5000);
			internEmployee1.setSchoolName("LAMBTON COLLEGE");
			internEmployee1.setName("KARTIK");
			internEmployee1.setMobNum(987654);
			internEmployee1.setidCardNo(5002);
			internEmployee1.setAge(25);
			internEmployee1.printMyData();
		} break;
		case 5003: {
			
			car1.setCostOfFuel(100);
			car1.setPlate("rohit");
			car1.setDistanceTravelInOneDay(90);
			car1.setNumOfSeats(2);
			car1.setMake("BENTLEY");
			car1.setMilage(10);
			car1.setMonthlyAttendance(23);
			car1.monthlyFuelExpenses();
			car1.printMyData();

			fullTimeEmployee1.setVehicle(car1);
			fullTimeEmployee1.setSalary(5000);
			fullTimeEmployee1.setName("RISHI");
			fullTimeEmployee1.setMobNum(654823);
			fullTimeEmployee1.setidCardNo(5003);
			fullTimeEmployee1.setBonus(1000);
			fullTimeEmployee1.setAge(50);
			
			fullTimeEmployee1.calcEarnings();
			fullTimeEmployee1.calcBirthYear();
			fullTimeEmployee1.printMyData();
		} break;

		default: System.out.println("EMPLOYEE ID DOES NOT EXIST");

		}
	}
}
