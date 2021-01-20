package com.gopal;

import java.util.Scanner;

public class SwitchFiles {
	public void display(){
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter 1 to check the Employee Name: "+"\nEnter 2 to check the Employee Salary: "+"\nEnter 3 to check the Employee Department:");
	int input = scan.nextInt();
	while(input>0) {
		switch(input) {
		case 1:
			EmployeeName EN= new EmployeeName();
			EN.display();
			break;
			
		case 2:
			EmployeeSalary ES= new EmployeeSalary();
			ES.display();
			break;
		case 3: EmployeeDept ED= new EmployeeDept();
			ED.display();
			break;
			
		}
		break;
		
	}
	}
}
