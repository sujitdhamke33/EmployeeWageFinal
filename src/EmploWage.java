import java.util.Random;

public class EmploWage {
    private static int fullTimeHours = 8;
    private static int partTimeHours = 4;

    private int totalWage = 0;
    private int totalWorkingHours = 0;
    private int daysWorked = 0;

    public void calculateEmployeeWage(String companyName, int empRate, int noOfWorkingdays, int maxHoursPerMonth) {
        while (daysWorked <= noOfWorkingdays && totalWorkingHours <= maxHoursPerMonth) {
            int attendance = generateRandomAttendance();
            int hoursWorked = calculateHoursWorked(attendance, fullTimeHours, partTimeHours);

            if (hoursWorked > 0) {
                daysWorked++;
                totalWorkingHours += hoursWorked;
                int dailyWage = empRate * hoursWorked;
                totalWage += dailyWage;
                System.out.println("Day " + daysWorked + ": Daily Wage - $" + dailyWage);
            }
            System.out.println("Total Monthly Wage: $" + totalWage);
            System.out.println("Total Working Hours: " + totalWorkingHours);
            System.out.println("Total Days Worked: " + daysWorked);
        }
    }




    private static int generateRandomAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private static int calculateHoursWorked(int attendance, int fullTimeHours, int partTimeHours) {
        int hoursWorked = 0;

        switch (attendance) {
            case 1:
                hoursWorked = fullTimeHours;
                System.out.println("Full-time employee is present and worked for 8 hours.");
                break;
            case 2:
                hoursWorked = partTimeHours;
                System.out.println("Part-time employee is present and worked for 4 hours.");
                break;
            default:
                System.out.println("Employee is absent.");
        }

        return hoursWorked;
    }

    public static void main(String[] args) {
        EmploWage employee = new EmploWage();
        employee.calculateEmployeeWage("infosys",50,25,150);
        // employee.calculateEmployeeWage("Godrej",40,15,180);
    }
}