public class Empwage {
	public int employeeHrs, employeeRate = 20, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0; //instance variable
	
	public  void computeEmployeeWage(){

	    //int employeeHrs, employeeRate = 20, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0; //local variable

	    while (totalEmployeeHrs <= 100 && totalWorkDay < 20) {
	        int employee = (int) Math.floor ( Math.random () * 10 ) % 3;
	        totalWorkDay++;
	        switch (employee) {
	            case 0:
	                System.out.println ( "Employee is Absent" );
	                employeeHrs = 0;
	                break;
	            case 1:
	                System.out.println ( "Employee is Present" );
	                employeeHrs = 8;
	                break;
	            default :
	                System.out.println ( "Employee doing Part Time" );
	                employeeHrs = 3;
	                break;
	        }
	        totalEmployeeHrs = totalEmployeeHrs + employeeHrs;
	        System.out.println ( "Day " + totalWorkDay + " Employee Hours: " + employeeHrs );
	        System.out.println("------------------------------------------");
	    }
	    totalEmployeeWage = totalEmployeeHrs * employeeRate;
	    System.out.println("Final");
	    System.out.println ( "Total Working Hours: " + totalEmployeeHrs );
	    System.out.println ( "Total Employee wage for a Month Rs. " + totalEmployeeWage );
	}
	
}

class Main extends Empwage {  // use inheritance
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computution program");
		Main empWage = new Main(); //creating object of parent class
		empWage.computeEmployeeWage();
	}
}
