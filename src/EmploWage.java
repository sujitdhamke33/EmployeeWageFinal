import java.util.Random;

public class EmploWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;

        int attendance = generateRandomAttendance();
        int dailyWage = calculateDailyWage(wagePerHour, attendance, fullTimeHours, partTimeHours);
        System.out.println("Daily Wage: $" + dailyWage);
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