package com.employeewage.solution.service;

import java.util.ArrayList;
import com.employeewage.solution.model.Company;
import com.employeewage.solution.model.Employee;

public interface IEmployeeWageComputeService{

	public boolean isPresent();
	public int getEmpRateByTypeOfEmployee(Employee emp, int empRatePerHour);
	public int generateRandomWorkHours(String companyName);
	public void addCompanyWithEmployees(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public Company findCompany(String companyName);
	public ArrayList<Employee> createDummyEmployee(String companyName, int numOfWorkingDays, int empRatePerHour);
	public void computeEmpWage();
	public int computeEmpWage(Employee emp, String companyName);
	public int computeEmpWage(Company company);
	public int computeEmpWage(Employee emp, int maxHoursPerMonth,int empRatePerHour);
	public int getTotalCompanyEmpWage(String companyName);
	public void prinAllDetails();	
}