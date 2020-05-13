package com.employeewage.solution.model;

public class Employee{

	private String typeEmployee;
	private int workHour,pay;

	public Employee(int workHour){
		this.workHour = workHour;
	}

	public String getTypeEmployee(){
		return this.typeEmployee;
	}

	public void setTypeEmployee(String typeEmployee){
		this.typeEmployee = typeEmployee;
	}

	public int getWorkHour(){
		return this.workHour;
	}

	public void setWorkHour(int workHour){
		this.workHour = workHour;
	}

	public int getPay(){
		return this.pay;
	}

	public void setPay(int pay){
		this.pay = pay;
	}

	@Override
	public String toString(){
		return "Type : " + this.typeEmployee + "\n WorkHour : " + this.workHour + "\n Total Pay : " + this.pay;
	}
	
}