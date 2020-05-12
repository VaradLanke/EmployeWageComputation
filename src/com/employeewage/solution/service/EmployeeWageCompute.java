package com.employeewage.solution.service;
import java.util.InputMismatchException;
import com.employeewage.solution.model.Employee;

public class EmployeeWageCompute{

	public int calculatePay(Employee emp){
		if(emp.getWorkHour() < emp.getFullDayHour()){
			emp.setTypeEmployee("Part-Time");
		}
		else{
			emp.setTypeEmployee("Full-Time");
		}
		emp.setPay(emp.getDailyWagePerHour() * emp.getWorkHour());
		return emp.getPay();
	}

	public boolean isPresent(Employee emp){
		/*int randomNumber = sysRand.nextInt(100)%2;
		return randomNumber==1 ? true : false; */
		if(emp.getWorkHour() < 1){
			return false;
		}
		return true;
	}

	/*public static int wageMenu(){
		System.out.println("1.Calculate-Pay");
		System.out.println("2.Print Employee-Type");
		System.out.println("3.Print Present/Absent");
		System.out.println("4.Exit");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;	
	}*/

	/*public static void main(String[] args){
		try{
			System.out.println("Welcome to Employee Wage Computation Program");
			Employee empObj = new EmployeeWageCompute(20,sysRand.nextInt(9),8);

			while(true){
				int option = wageMenu();
				switch(option){
					case 1:
							System.out.println("Pay  : " + computeObj.calculatePay());
							break;
					case 2:
							System.out.println("Type : " + computeObj.getTypeEmployee());
							break;
					case 3:
							if(computeObj.isPresent()){
								System.out.println("Present");
							}else{
								System.out.println("Absent");
							}
							break;
					case 4:
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
	}*/
}
