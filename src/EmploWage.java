import java.util.Random;

public class EmploWage {
    private static int fullTimeHours = 8;
    private static int partTimeHours = 4;

    private String company;
    private int Emp_rate_per_Hour;
    private int NoofWorkingDays;
    private int maxHrs;

    public EmploWage(String company, int emp_rate_per_Hour, int noofWorkingDays, int maxHrs) {
        this.company = company;
        Emp_rate_per_Hour = emp_rate_per_Hour;
        NoofWorkingDays = noofWorkingDays;
        this.maxHrs = maxHrs;
    }
    public int calculatewage() {
        System.out.println("Employee Company Name is : " + company);
        System.out.println("Employee Wage per Hour is : " + Emp_rate_per_Hour);
        System.out.println("No. of day employee working is : " + NoofWorkingDays);
        System.out.println("Maximum Hours Employee Works is : " + maxHrs);

        int empHrs = 0, employeeWage = 0;
        int day = 1;

        while (NoofWorkingDays >= day && maxHrs >= empHrs) {
            int attendence = generateRandomAttendance();
            switch (attendence) {
                case 1:
                    empHrs += fullTimeHours;
                    System.out.println("Day " + day + ": Full-time employee is present and worked for 8 hours.");
                    break;
                case 2:
                    empHrs += partTimeHours; // Add part-time hours
                    System.out.println("Day " + day + ": Part-time employee is present and worked for 4 hours.");
                    break;
                default:
                    System.out.println("Day " + day + ": Employee is absent.");
            }
            day++;
        }
        employeeWage = empHrs * Emp_rate_per_Hour;
        System.out.println(company + " Employee Wage Per Month is : " + employeeWage);
        System.out.println();
        return employeeWage;
    }

    private static int generateRandomAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }


    public static void main(String[] args) {
        EmploWage tcsEmployee = new EmploWage("TCS",80,25,100);
        tcsEmployee.calculatewage();
    }
}