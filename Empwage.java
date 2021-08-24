public class Empwage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computution program");
        int empHrs = 0, Workday = 20, emp_rate = 20, totempwage = 0;
        for (int day = 1; day <= Workday; day++) {
            int a = (int) Math.floor(Math.random() * 10) % 3;
            switch (a) {
                case 0:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
                case 1:
                    System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee doing Part Time");
                    empHrs = 3;
            }

            int empwage = empHrs * emp_rate;
            totempwage += empwage;
            System.out.println("Day "+day+" Employee Wage is Rs." + empwage);
        }
        System.out.println("Total Employee wage for a Month Rs. " + totempwage);
    }
}

