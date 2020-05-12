package com.employeewage.solution.test;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.employeewage.solution.model.Employee;
import com.employeewage.solution.service.EmployeeWageCompute;

class Tester{

	public static int wageMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Calculate-Todays Pay");
		System.out.println("2.Calculate-Monthly Pay");
		System.out.println("3.Print Employee-Type");
		System.out.println("4.Print Present/Absent");
		System.out.println("5.Exit");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;	
	}

	public static void main(String[] args){
		try{
			System.out.println("Welcome to Employee Wage Computation Program");
			Random sysRand = new Random();
			EmployeeWageCompute computer = new EmployeeWageCompute();
			Employee emp = new Employee(20,sysRand.nextInt(9),8);

			while(true){
				int option = wageMenu();
				switch(option){
					case 1:
							System.out.println("Todays Pay  : " + computer.calculatePay(emp));
							break;
					case 2:
							System.out.println("Monthly Pay  : " + computer.monthlyCalculatePay(emp));
							break;
					case 3:
							System.out.println("Type : " + emp.getTypeEmployee());
							break;
					case 4:
							if(computer.isPresent(emp)){
								System.out.println("Present");
							}else{
								System.out.println("Absent");
							}
							break;
					case 5:
							System.exit(0);
							break;
					default:
						System.out.println("Invalid Choice!!");
						break;
					}

				}
			}catch(InputMismatchException e){
				System.out.println("Wrong Input by User, expected number");
		}
	}	

}
