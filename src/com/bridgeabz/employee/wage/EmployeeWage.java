package com.bridgeabz.employee.wage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage program");
		presentOrAbsent();
	}

	public static void presentOrAbsent() {
		  int fullTimeIs = 1;
	        double empCheck = Math.floor(Math.random() * 10 ) % 2;
	        if (empCheck == fullTimeIs)
	            System.out.println("Employee is present");
	        else
	            System.out.println("Employee is Absent");
}
}
