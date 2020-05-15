package com.employeewage.solution.model;

import java.util.ArrayList;
import java.util.List;

public class Employee{

	private String empName,typeEmployee,companyName;
	private int pay;
	private List<Integer> dailyWages;

	public Employee(String empName, String companyName, ArrayList<Integer> dailyWages){
		this.empName = empName;
		this.companyName = companyName;
		this.dailyWages = dailyWages;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTypeEmployee(){
		return this.typeEmployee;
	}

	public void setTypeEmployee(String typeEmployee){
		this.typeEmployee = typeEmployee;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPay(){
		return this.pay;
	}

	public void setPay(int pay){
		this.pay = pay;
	}

	public List<Integer> getDailyWages() {
		return dailyWages;
	}

	public void setDailyWages(List<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}

	@Override
	public String toString(){
		return "empName : " + this.empName + " Type : " + this.typeEmployee + " Total Pay : " + this.pay;
	}
	
}