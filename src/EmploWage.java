import java.util.Random;

public class EmploWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int totalDaysInMonth = 20;

        int totalWage = 0;

        for (int day = 1; day <= totalDaysInMonth; day++) {
            int attendance = generateRandomAttendance();
            int dailyWage = calculateDailyWage(wagePerHour, attendance, fullTimeHours, partTimeHours);
            totalWage += dailyWage;
            System.out.println("Day " + day + ": Daily Wage - $" + dailyWage);
        }

        System.out.println("Total Monthly Wage: $" + totalWage);
    }

    private static int generateRandomAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }
    private static int calculateDailyWage(int wagePerHour, int attendance, int fullTimeHours, int partTimeHours) {
        int dailyWage = 0;

        switch (attendance) {
            case 0:
                System.out.println("Employee is absent.");
                break;
            case 1:
                dailyWage = wagePerHour * fullTimeHours;
                System.out.println("Full-time employee is present and worked for 8 hours.");
                break;
            case 2:
                dailyWage = wagePerHour * partTimeHours;
                System.out.println("Part-time employee is present and worked for 4 hours.");
                break;
        }

        return dailyWage;
    }
}