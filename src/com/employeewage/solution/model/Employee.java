package com.employeewage.solution.model;

public class Employee{
	private String typeEmployee;
	private int dailyWagePerHour,workHour,fullDayHour,pay;

	public Employee(int dailyWagePerHour, int workHour, int fullDayHour){
		//this.setTypeEmployee("Part-Time");
		this.dailyWagePerHour = dailyWagePerHour;
		this.workHour = workHour;
		this.fullDayHour = fullDayHour;
	}

	public String getTypeEmployee(){
		return this.typeEmployee;
	}

	public void setTypeEmployee(String typeEmployee){
		this.typeEmployee = typeEmployee;
	}

	public int getDailyWagePerHour(){
		return this.dailyWagePerHour;
	}

	public void setDailyWagePerHour(int dailyWagePerHour){
		this.dailyWagePerHour = dailyWagePerHour;
	}

	public int getWorkHour(){
		return this.workHour;
	}

	public void setWorkHour(int workHour){
		this.workHour = workHour;
	}

	public int getFullDayHour(){
		return this.fullDayHour;
	}

	public void setFullDayHour(int fullDayHour){
		this.fullDayHour = fullDayHour;
	}

	public int getPay(){
		return this.pay;
	}

	public void setPay(int pay){
		this.pay = pay;
	}

	@Override
	public String toString(){
		return "Type : " + this.typeEmployee + "\n Wage per hour : " + this.dailyWagePerHour + "\n WorkHour : " + this.workHour + "\n FullDay hour :" + this.fullDayHour + "\n Total Pay : " + this.pay;
	}
}



















