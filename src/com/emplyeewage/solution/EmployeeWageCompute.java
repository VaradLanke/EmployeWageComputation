import java.util.Random;
class EmployeeWageCompute{

	private int dailyWagePerHour,workHour,fullDayHour,pay;
	public static Random sysRand = new Random();

	EmployeeWageCompute(int dailyWagePerHour, int workHour, int fullDayHour){
		this.dailyWagePerHour = dailyWagePerHour;
		this.workHour = workHour;
		this.fullDayHour = fullDayHour;
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
		this.pay = this.dailyWagePerHour * this.workHour;
		return this.pay; 
	}

	public static void main(String[] args){
		EmployeeWageCompute computeObj = new EmployeeWageCompute(20,sysRand.nextInt(9),8);
		System.out.println(computeObj.calculatePay());
		System.out.println("Welcome to Employee Wage Computation Program");
			if(isPresent()){
				System.out.println("Present");
			}else{
				System.out.println("Absent");
			}
		}
}