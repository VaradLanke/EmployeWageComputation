import java.util.Random;
class EmployeeWageCompute{
	private String typeEmployee;
	private int dailyWagePerHour,workHour,fullDayHour,pay;
	public static Random sysRand = new Random();

	EmployeeWageCompute(int dailyWagePerHour, int workHour, int fullDayHour){
		this.setTypeEmployee("Full-Time");
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

	public void setDailyWagePerHour(int inputWage){
		this.dailyWagePerHour = inputWage;
	}

	public static boolean isPresent(){
		int randomNumber = sysRand.nextInt(100)%2;
		return randomNumber==1 ? true : false; 
	}

	public int calculatePay(){
		if(this.workHour < this.fullDayHour){
			this.setTypeEmployee("Part-Time");
		}
		this.pay = this.dailyWagePerHour * this.workHour;
		return this.pay;
	}

	public static void main(String[] args){
		EmployeeWageCompute computeObj = new EmployeeWageCompute(20,sysRand.nextInt(9),8);
		System.out.println("Pay  : " + computeObj.calculatePay());
		System.out.println("Type : " + computeObj.getTypeEmployee());
		System.out.println("Welcome to Employee Wage Computation Program");
			if(isPresent()){
				System.out.println("Present");
			}else{
				System.out.println("Absent");
			}
		}
}