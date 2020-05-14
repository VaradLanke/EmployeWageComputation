package com.employeewage.solution.service;

import java.util.ArrayList;
import com.employeewage.solution.model.Company;
import com.employeewage.solution.model.Employee;

public interface EmployeeWageComputeService{

	public boolean isPresent(Employee emp);
	public int generateRandomWorkHours(String companyName);
	public void addCompanyWithEmployees(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public Company findCompany(String companyName);
	public ArrayList<Employee> createDummyEmployee(String companyName, int numOfWorkingDays);
	public void computeEmpWage();
	public int computeEmpWage(Employee emp, String companyName);
	public int computeEmpWage(Company company);
	
}