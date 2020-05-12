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
		if(emp.getWorkHour() < emp.getFullDayHour()){
			emp.setTypeEmployee("Part-Time");
		}
		else{
			emp.setTypeEmployee("Full-Time");
		}
		emp.setPay(emp.getDailyWagePerHour() * emp.getWorkHour());
		return emp.getPay();
	}

	public int monthlyCalculatePay(Employee emp){
		Random sysRand = new Random();
		for(int i=0;i<20;i++){
			emp.setWorkHour(sysRand.nextInt(9));
			emp.setPay(emp.getPay() + (emp.getDailyWagePerHour() * emp.getWorkHour()));
		}
		return emp.getPay();
	}

}
