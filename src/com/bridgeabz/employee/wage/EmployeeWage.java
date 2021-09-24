package com.bridgeabz.employee.wage;

public class EmployeeWage {
	public static final int Full_TIME_IS = 1;
	public static final int PART_TIME_IS = 2;
	public static double empCheck = 0;
	public static int empHrs;
	public static final int EMP_Wage_Per_Hour = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage program");
		presentOrAbsent();
		empDailyWage();
	}

	// 1) check employee is present or absent
	public static void presentOrAbsent() {
		empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == Full_TIME_IS) {
			System.out.println("Employee is full time present");
			empHrs = 8;
		} else if (empCheck == PART_TIME_IS) {
			System.out.println("Employee is part time present");
			empHrs = 4;
		} else {
			System.out.println("Employee is absent");
		}
	}

	// 2) calculate employee daily Wage
	public static void empDailyWage() {
		int dailyWage = EMP_Wage_Per_Hour * empHrs;
		System.out.println("Employee daily Wage : " + dailyWage);
	}

}
