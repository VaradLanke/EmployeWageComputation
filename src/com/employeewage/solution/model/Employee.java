package com.employeewage.solution.model;

import java.util.ArrayList;
import java.util.List;

public class Employee{

	private String typeEmployee,companyName;
	private int pay;
	private List<Integer> dailyWages;

	public Employee(ArrayList<Integer> dailyWages){
		this.dailyWages = dailyWages;
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
		return "Type : " + this.typeEmployee + "\n Total Pay : " + this.pay;
	}
	
}