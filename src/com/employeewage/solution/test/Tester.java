package com.employeewage.solution.test;
import java.util.*;
import com.employeewage.solution.model.*;
import com.employeewage.solution.service.*;

class Tester{

	public static int wageMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("1.Calculate-Todays Pay");
		System.out.println("2.Calculate-Monthly Pay");
		System.out.println("3.Calculate-Conditional Pay");
		System.out.println("4.Print Employee-Type");
		System.out.println("5.Print Present/Absent");
		System.out.println("6.Exit");
		System.out.println("---------------------------------------------");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;	
	}


	public static void main(String[] args){
		try{
			System.out.println("Welcome to Employee Wage Computation Program");
			System.out.println("---------------------------------------------");
			EmployeeWageCompute computer = new EmployeeWageCompute();
			computer.addCompanyWithEmployees("TATA", 30 , 20, 100);
			/*
			while(true){
				int option = wageMenu();
				switch(option){
					case 1:
						System.out.println("<Todays Pay  : " + computer.calculatePay(emp)+">");
						break;
					case 2:
						System.out.println("<Monthly Pay  : " + computer.monthlyCalculatePay(emp)+">");
						break;
					case 3:
						System.out.println("<Conditional Pay  : " + computer.tillHundredCalculatePay(emp)+">");
						break;
					case 4:
						System.out.println("<Type : " + computer.getTypeOfEmployee(emp)+">");
						break;
					case 5:
						System.out.println(computer.isPresent(emp) ? "<Present>" : "<Absent>");
						break;
					case 6:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Choice!!");
						break;
					}
				}*/
			}catch(InputMismatchException e){
				System.out.println("Wrong Input by User, expected number");
		}
	}	
}