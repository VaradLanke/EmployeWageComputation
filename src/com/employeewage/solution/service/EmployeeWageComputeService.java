package com.employeewage.solution.service;

import java.util.ArrayList;
import com.employeewage.solution.model.Company;
import com.employeewage.solution.model.Employee;

public interface EmployeeWageComputeService{

	public boolean isPresent();
	public String getTypeOfEmployee(Employee emp);
	public int generateRandomWorkHours(String companyName);
	public void addCompanyWithEmployees(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public Company findCompany(String companyName);
	public ArrayList<Employee> createDummyEmployee(String companyName, int numOfWorkingDays, int empRatePerHour);
	public void computeEmpWage();
	public int computeEmpWage(Employee emp, String companyName);
	public int computeEmpWage(Company company);
	public int computeEmpWage(Employee emp);
	public int getTotalCompanyEmpWage(String companyName);
	public void prinAllDetails();	
}