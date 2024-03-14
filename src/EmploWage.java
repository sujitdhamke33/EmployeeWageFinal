import java.util.Random;

public class EmploWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int totalDaysInMonth = 20;
        int maxTotalWorkingHours = 100;

        int totalWage = 0;
        int totalWorkingHours = 0;
        int daysWorked = 0;

        while (daysWorked <= totalDaysInMonth && totalWorkingHours <= maxTotalWorkingHours) {
            int attendance = generateRandomAttendance();
            int hoursWorked = calculateHoursWorked(attendance, fullTimeHours, partTimeHours);

            if (hoursWorked > 0) {
                daysWorked++;
                totalWorkingHours += hoursWorked;
                int dailyWage = wagePerHour * hoursWorked;
                totalWage += dailyWage;
                System.out.println("Day " + daysWorked + ": Daily Wage - $" + dailyWage);
            }
        }

        System.out.println("Total Monthly Wage: $" + totalWage);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Days Worked: " + daysWorked);
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
}