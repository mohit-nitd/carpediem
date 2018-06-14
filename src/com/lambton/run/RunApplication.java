package com.lambton.run;

import com.lambton.term.CommisionBasedPartTime;
import com.lambton.term.FixedBasedPartTime;
import com.lambton.term.Motorcycle;

import java.util.Scanner;

import com.lambton.term.Car;

public class RunApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		
		CommisionBasedPartTime commissionBasedEmployee1 = new CommisionBasedPartTime();
		Motorcycle motorcycle1 = new Motorcycle();
		
		Car c2 = new Car();
		FixedBasedPartTime f1 = new FixedBasedPartTime();
		
		
		System.out.println("Enter ID Number");
		
	int idCardNo = sc.nextInt(); 
	
	switch(idCardNo) {
		
		 case 5000:{
	   System.out.println("enter kerb weight");
	   int x = sc.nextInt();	 
		motorcycle1.setKerbWeight(x);
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
		}
		 case 5001: {
			 System.out.println("ENTER MONTHLY ATTENDANCE");
			 int H = sc.nextInt();
			 c2.setCostOfFuel(100);
			 c2.setPlate("MANINDER");
			 c2.setDistanceTravelInOneDay(90);
			 c2.setNumOfSeats(2);
			 c2.setMake("MERC");
			 c2.setMilage(5);
			 c2.setMonthlyAttendance(H);
			 c2.monthlyFuelExpenses();
			 c2.printMyData();
			 
	
			 System.out.println("enter age of employee");
			 int z = sc.nextInt();
			 f1.setAge(z);
			 f1.setVehicle(c2);
			 f1.setRate(50);
			 System.out.println("ENTER NAME OF EMPLOYEE");
			 String bat = sc.next();
			 f1.setName(bat);
			 f1.setMobNum(1234567);
			 f1.setidCardNo(5001);
			 System.out.println("ENTERS HOURS WORKED");
			 int e = sc.nextInt();
			 f1.setHoursWorked(e);
			 f1.setFixedAmmount(4000.0f);
			 f1.calcEarnings();
			 f1.printMyData();
			 
	 }
		 default:System.out.println("EMPLOYEE ID DOES NOT EXIST");
		
		}
		
	}
}
