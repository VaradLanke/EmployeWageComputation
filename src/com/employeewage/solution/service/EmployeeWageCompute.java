package com.employeewage.solution.service;
import java.util.InputMismatchException;
import com.employeewage.solution.model.Employee;
import java.util.Random;

public class EmployeeWageCompute{

	public boolean isPresent(Employee emp){
		/*int randomNumber = sysRand.nextInt(100)%2;
		return randomNumber==1 ? true : false; */
		if(emp.getWorkHour() < 1){
			return false;
		}
		return true;
	}

	public int calculatePay(Employee emp){
		emp.setPay(0);
		emp.setPay(emp.getDailyWagePerHour() * emp.getWorkHour());
		return emp.getPay();
	}

	public String getTypeOfEmployee(Employee emp){
		if((emp.getWorkHour()/20) < emp.getFullDayHour()){
			emp.setTypeEmployee("Part-Time");
		}
		else{
			emp.setTypeEmployee("Full-Time");
		}
		return emp.getTypeEmployee();		
	}

	public int monthlyCalculatePay(Employee emp){
		Random sysRand = new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		for(int i=0;i<20;i++){
			emp.setWorkHour(emp.getWorkHour() + sysRand.nextInt(9));
		}
		emp.setPay(emp.getDailyWagePerHour() * emp.getWorkHour());
		return emp.getPay();
	}

	public int tillHundredCalculatePay(Employee emp){
		Random sysRand = new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		while(emp.getWorkHour() <= 100){
			emp.setWorkHour(emp.getWorkHour() + sysRand.nextInt(9));
		}
		emp.setPay(emp.getDailyWagePerHour() * emp.getWorkHour());
		return emp.getPay();
	}

}
