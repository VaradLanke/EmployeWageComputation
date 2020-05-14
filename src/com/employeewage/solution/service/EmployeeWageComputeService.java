package com.employeewage.solution.service;

import com.employeewage.solution.model.Company;
import com.employeewage.solution.model.Employee;

public interface EmployeeWageComputeService{

	public boolean isPresent(Employee emp);
	public int generateRandomWorkHours(String companyName);
	public void addCompanyWithEmployees(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public Company findCompany(String companyName);

}