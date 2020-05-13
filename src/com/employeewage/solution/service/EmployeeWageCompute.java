package com.employeewage.solution.service;
import java.util.*;
import com.employeewage.solution.model.*;
import com.employeewage.solution.service.*;

public class EmployeeWageCompute implements EmployeeWageComputeService{

	private static final int dailyWagePerHour = 20;
	private static final int fullDayHour = 8;

	@Override
	public boolean isPresent(Employee emp){
		/*int randomNumber = sysRand.nextInt(100)%2;
		return randomNumber==1 ? true : false; */
		if(emp.getWorkHour() < 1){
			return false;
		}
		return true;
	}

	@Override
	public int calculatePay(Employee emp){
		emp.setPay(0);
		emp.setPay(dailyWagePerHour * emp.getWorkHour());
		return emp.getPay();
	}

	@Override
	public String getTypeOfEmployee(Employee emp){
		if((emp.getWorkHour()/20) < fullDayHour){
			emp.setTypeEmployee("Part-Time");
		}
		else{
			emp.setTypeEmployee("Full-Time");
		}
		return emp.getTypeEmployee();		
	}

	@Override
	public int monthlyCalculatePay(Employee emp){
		Random sysRand = new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		for(int i=0;i<20;i++){
			emp.setWorkHour(emp.getWorkHour() + sysRand.nextInt(9));
		}
		emp.setPay(dailyWagePerHour * emp.getWorkHour());
		return emp.getPay();
	}

	@Override
	public int tillHundredCalculatePay(Employee emp){
		Random sysRand = new Random();
		emp.setPay(0);
		emp.setWorkHour(0);
		while(emp.getWorkHour() <= 100){
			emp.setWorkHour(emp.getWorkHour() + sysRand.nextInt(9));
		}
		emp.setPay(dailyWagePerHour * emp.getWorkHour());
		return emp.getPay();
	}

}