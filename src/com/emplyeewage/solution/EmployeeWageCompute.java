import java.util.Random;
class EmployeeWageCompute{

	public static boolean isPresent(){
		Random sysRand = new Random();
		int randomNumber = sysRand.nextInt(100)%2;
		return randomNumber==1 ? true : false; 
	}

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program");
			if(isPresent()){
				System.out.println("Present");
			}else{
				System.out.println("Absent");
			}
		}
}