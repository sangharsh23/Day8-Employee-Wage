package com.bridgeabz.employee.wage;

public class EmployeeWage {
	public static final int Full_TIME_IS = 1;
	public static double empCheck = 0;
	public static int empHrs;
	public static final int EMP_Wage_Per_Hour = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage program");
		presentOrAbsent();
		empDailyWage();

	}

	public static void presentOrAbsent() {

		empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Full_TIME_IS) {
			System.out.println("Employee is present");
			empHrs = 8;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
			empDailyWage();
		}
	}

	public static void empDailyWage() {
		int dailyWage = EMP_Wage_Per_Hour * empHrs;
		System.out.println("Employee daily Wage : " + dailyWage);
	}
}
