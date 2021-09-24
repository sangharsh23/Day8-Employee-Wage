package com.bridgeabz.employee.wage;

public class EmployeeWage {
	public static final int Full_TIME_IS = 1;
	public static final int PART_TIME_IS = 2;
	public static int No_Of_Work_Day = 20;
	public static final int EMP_Wage_Per_Hour = 20;
	public static int i, empCheck, empHrs, dailyWage, monthWage;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage program");
		presentOrAbsent();
		empDailyWage();
		empMonthWage();
	}

	// 1) check employee is present or absent also part time present
	public static void presentOrAbsent() {
		for (i = 1; i < No_Of_Work_Day; i++) {
			empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				System.out.println("Employee is full time present");
				empHrs = 8;
				break;
			case 2:
				System.out.println("Employee is part time present");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is absent");
				empHrs = 0;
			}
			empDailyWage();
			
		}
		
	}

	// 2) calculate employee daily Wage
	public static void empDailyWage() {
		dailyWage = EMP_Wage_Per_Hour * empHrs;
		System.out.println("Day: "+ i + " Employee Wage = " + dailyWage);
		monthWage = monthWage + dailyWage;
		
	}

	// 3) calculate employee wage for 20 day
	public static void empMonthWage() {
		System.out.println("Total month wage = " + monthWage);
	}
}
