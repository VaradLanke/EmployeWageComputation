package com.employeewage.solution.service;
import java.util.*;
import com.employeewage.solution.model.*;

public class EmployeeWageCompute implements EmployeeWageComputeService{

	private List<Company> companyList;
	/*private static final int dailyWagePerHour = 20;
	private static final int fullDayHour = 8;*/

	@Override
	public boolean isPresent(Employee emp){
		int randomNumber = new Random().nextInt(100)%2;
		return randomNumber==1 ? true : false;
	}

	public int generateRandomWorkHours(String companyName){
		int fullDayHour = this.findCompany(companyName).getMaxHoursPerMonth();
		return new Random().nextInt(fullDayHour)%2;
	}

	public void addCompanyWithEmployees(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		Company cmp = new Company(companyName,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		cmp.setEmpList(createDummyEmployee(companyName, numOfWorkingDays));
		System.out.println("Added Company with emp");
	}

	public ArrayList<Employee> createDummyEmployee(String companyName, int numOfWorkingDays){
		ArrayList<Employee> empList = new ArrayList<>();
		Employee e = null;
		for(int i=0;i<10;i++){
			e = new Employee("name"+i, companyName,new ArrayList<Integer>());
			for(int j=0;j<numOfWorkingDays;j++){
				e.getDailyWages().add(new Random().nextInt(9));
			}
			empList.add(e);
		}
		return empList;
	}

	public Company findCompany(String companyName){
		for (Company company : companyList) {
			if(company.getCompanyName().equalsIgnoreCase(companyName))
				return company;
		}
		return null;
	}
}