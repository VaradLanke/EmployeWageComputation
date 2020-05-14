package com.employeewage.solution.model;
import com.employeewage.solution.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String companyName;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    List<Employee> empList;

    Company(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        totalEmpWage = 0;
        empList = new ArrayList<Employee>();
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public int getEmpRatePerHour(){
        return this.empRatePerHour;
    }

    public int getNumOfWorkingDays(){
        return this.numOfWorkingDays;
    }

    public int getMaxHoursPerMonth(){
        return this.maxHoursPerMonth;
    }

    public int getTotalEmpWage(){
        return this.totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }

    public List<Employee> getEmpList(){
        return this.empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString(){
        return "Company : " + this.companyName + " || Total Employee Wage : " + this.totalEmpWage;
    }
}