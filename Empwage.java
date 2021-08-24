public class Empwage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computution program");
        double a = Math.floor(Math.random() * 10) % 3;
        int empHrs = 0;
        if (a == 0) {
            System.out.println("Employee is Absent");
            empHrs = 0;
        } else if(a==1) {
            System.out.println("Employee is Present");
            empHrs = 8;
        }else if(a==2){
            System.out.println("Employee doing Part Time");
            empHrs = 3;
        }
        int emp_rate = 20;
        int empwage = empHrs * emp_rate;
        System.out.println("Employee Wage is Rs."+empwage);
    }
}

