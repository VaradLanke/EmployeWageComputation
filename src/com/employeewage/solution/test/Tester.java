package com.employeewage.solution.test;
import java.util.*;
import com.employeewage.solution.model.*;
import com.employeewage.solution.service.*;

class Tester{

	public static int wageMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("1.Add Company");
		System.out.println("2.Calculate Total Wage");
		System.out.println("3.Print All Employee Details");
		System.out.println("4.Print Employee-Type");
		System.out.println("5.Print Present/Absent");
		System.out.println("6.Exit");
		System.out.println("---------------------------------------------");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;	
	}

	public static void addCompany( EmployeeWageCompute computer){
		if(computer !=null){}
		Scanner sc = new Scanner(System.in);
		System.out.print("+CompanyName : ");
		String cmpName = sc.next();
		System.out.print("+Wage Per Hour : ");
		int rate = sc.nextInt();
		System.out.print("+No of Working Days Month : ");
		int nowkDays = sc.nextInt();
		System.out.print("+Max Hour per Month : ");
		int maxhr = sc.nextInt();
		computer.addCompanyWithEmployees(cmpName, rate , nowkDays, maxhr);
	}

	public static void main( String[] args){
		try{
			System.out.println("Welcome to Employee Wage Computation Program");
			System.out.println("---------------------------------------------");
			EmployeeWageCompute computer = new EmployeeWageCompute();
			Scanner sc = new Scanner(System.in);
			while(true){
				 int option = wageMenu();
				switch(option){
					case 1:
							System.out.print("+CompanyName : ");
							String cmpName = sc.next();
							System.out.print("+Wage Per Hour : ");
							int rate = sc.nextInt();
							System.out.print("+No of Working Days Month : ");
							int nowkDays = sc.nextInt();
							System.out.print("+Max Hour per Month : ");
							int maxhr = sc.nextInt();
							computer.addCompanyWithEmployees(cmpName, rate , nowkDays, maxhr);
						break;
					case 2:
						System.out.print("+CompanyName : ");
						String cmpNamecase2 = sc.next();
						System.out.println("<Total Emp Wage for "+ cmpNamecase2 +" : "+ computer.getTotalCompanyEmpWage(cmpNamecase2)+">");
						break;
					case 3:
						computer.prinAllDetails();
						break;
					case 4:
						System.out.print("+CompanyName : ");
						String cmpNamecase3 = sc.next();
						System.out.println("<Type : " + computer.getTypeOfEmployee(new Employee("name1", cmpNamecase3 , new ArrayList<Integer>()))+">");
						break;
					case 5:
						System.out.println(computer.isPresent() ? "<Present>" : "<Absent>");
						break;
					case 6:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Choice!!");
						break;
					}
				}
			}catch( InputMismatchException e){
				System.out.println("Wrong Input by User, expected number");
		}
	}	
}