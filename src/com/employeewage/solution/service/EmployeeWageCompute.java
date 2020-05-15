package com.employeewage.solution.service;
import java.util.*;
import com.employeewage.solution.model.*;

public class EmployeeWageCompute implements EmployeeWageComputeService{

	private List<Company> companyList;
	private Map<String,Company> companyHashMap;

	public EmployeeWageCompute(){
		companyList = new ArrayList<>();
		companyHashMap = new HashMap<>();
	}

	@Override
	public boolean isPresent(){
		int randomNumber = new Random().nextInt(100)%2;
		return randomNumber==1 ? true : false;
	}

	@Override
	public String getTypeOfEmployee(Employee emp){
		Company fcmp =  findCompany(emp.getCompanyName());
		//System.out.println(fcmp.toString());
		int totalEmpWage = this.computeEmpWage(emp) ;
		if(totalEmpWage < ((fcmp.getMaxHoursPerMonth() * fcmp.getEmpRatePerHour())/2)){
			emp.setTypeEmployee("Part-Time");
			return "Part-Time";
		}
		emp.setTypeEmployee("Full-Time");
		return "Full-Time";
	}

	public int generateRandomWorkHours(String companyName){
		int fullDayHour = this.findCompany(companyName).getMaxHoursPerMonth();
		return new Random().nextInt(fullDayHour)%2;
	}
	
	@Override
	public void addCompanyWithEmployees(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		Company cmp = new Company(companyName,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		cmp.setEmpList(createDummyEmployee(companyName, numOfWorkingDays,empRatePerHour));
		companyList.add(cmp);
		companyHashMap.put(companyName, cmp);
		System.out.println("Added Company with emp");
	}

	@Override
	public ArrayList<Employee> createDummyEmployee(String companyName, int numOfWorkingDays, int empRatePerHour){
		ArrayList<Employee> empList = new ArrayList<>();
		Employee e = null;
		for(int i=0;i<10;i++){
			e = new Employee("name"+i, companyName,new ArrayList<Integer>());
			for(int j=0;j<numOfWorkingDays;j++){
				int dummyWage = (new Random().nextInt(9)) * empRatePerHour ;
				e.getDailyWages().add(dummyWage);
			}
			empList.add(e);
		}
		return empList;
	}

	@Override
	public Company findCompany(String companyName){
		for (Company company : companyList) {
			if(company.getCompanyName().equalsIgnoreCase(companyName))
				return company;
		}
		return null;
	}

	@Override
	public void computeEmpWage(){
		for (Company company : companyList) {
			company.setTotalEmpWage(this.computeEmpWage(company));
		}
	}

	//DailyWage Calculation
	@Override
	public int computeEmpWage(Employee emp, String companyName){
		Company fcmp =  findCompany(companyName);
		int random = new Random().nextInt(9);
		int dailyWage = (random * fcmp.getEmpRatePerHour());
		return dailyWage;
	}

	//totalCompanyWageCalculation
	@Override
	public int computeEmpWage(Company company){
		int totalWage=0,totalWorkingHours=0;
		for (Employee emp : company.getEmpList()) {
			//int empTotalWage=0;
			for (int dailyWage : emp.getDailyWages()) {
				if(totalWorkingHours < company.getMaxHoursPerMonth()){
					totalWage += (dailyWage * company.getEmpRatePerHour());
					totalWorkingHours += (dailyWage / company.getEmpRatePerHour());
					//empTotalWage = totalWage;
				}
			}
			//emp.setPay(empTotalWage);
		}
		return totalWage;
	}

	//totalEmployeeWageCalculation
	@Override
	public int computeEmpWage(Employee emp){
		if(emp!=null){
			Company fcmp =  findCompany(emp.getCompanyName());
			if(fcmp!=null){
				int totalWage=0;
				for (int dailyWage : emp.getDailyWages()) {
					totalWage += (dailyWage * fcmp.getEmpRatePerHour());
				}
				emp.setPay(totalWage);
				return totalWage;
			}
		}
		return 0;
	}

	@Override
	public int getTotalCompanyEmpWage(String companyName){
		this.computeEmpWage();
		Company fcmp = this.findCompany(companyName);
		if(fcmp!=null)
			return fcmp.getTotalEmpWage();
		return 0;
	}

	@Override
	public void prinAllDetails(){
		for(Company cmp : this.companyList){
			System.out.println("--------------------*"+cmp.getCompanyName()+"*-----------------");
			for (Employee employee: cmp.getEmpList()) {
				this.getTypeOfEmployee(employee);
				System.out.println(employee.toString());
			}
		}
	}

}