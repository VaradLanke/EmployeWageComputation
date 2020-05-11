import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
class EmployeeWageCompute{
	private String typeEmployee;
	private int dailyWagePerHour,workHour,fullDayHour,pay;
	public static Random sysRand = new Random();
	public static Scanner sc = new Scanner(System.in);

	EmployeeWageCompute(int dailyWagePerHour, int workHour, int fullDayHour){
		this.setTypeEmployee("Full-Time");
		this.dailyWagePerHour = dailyWagePerHour;
		this.workHour = workHour;
		this.fullDayHour = fullDayHour;
		this.calculatePay();
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

	public int calculatePay(){
		if(this.workHour < this.fullDayHour){
			this.setTypeEmployee("Part-Time");
		}
		this.pay = this.dailyWagePerHour * this.workHour;
		return this.pay;
	}

	public boolean isPresent(){
		/*int randomNumber = sysRand.nextInt(100)%2;
		return randomNumber==1 ? true : false; */
		if(this.workHour < 1){
			return false;
		}
		return true;
	}

	public static void main(String[] args){
		try{
			System.out.println("Welcome to Employee Wage Computation Program");
			EmployeeWageCompute computeObj = new EmployeeWageCompute(20,sysRand.nextInt(9),8);

			while(true){
				System.out.println("1.Calculate-Pay");
				System.out.println("2.Print Employee-Type");
				System.out.println("3.Print Present/Absent");
				System.out.println("4.Exit");
				System.out.println("Enter Choice : ");
				int choice = sc.nextInt();
				System.out.println();

				switch(choice){
					case 1:
							System.out.println("Pay  : " + computeObj.calculatePay());
							break;
					case 2:
							System.out.println("Type : " + computeObj.getTypeEmployee());
							break;
					case 3:
							if(computeObj.isPresent()){
								System.out.println("Present");
							}else{
								System.out.println("Absent");
							}
							break;
					case 4:
							System.exit(0);
							break;
					default:
						System.out.println("Invalid Choice!!");
						break;
					}

				}
			}catch(InputMismatchException e){
				System.out.println("Wrong Input by User, expected number");
		}
	}
}