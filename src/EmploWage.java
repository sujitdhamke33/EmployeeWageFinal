import java.util.Random;

public class EmploWage {
    public static void main(String[] args) {
        boolean isPresent = isEmployeePresent();

        if (isPresent) { //it is true
            int dailyWage = calculateDailyWage();
            System.out.println("Employee is Present. Daily Wage: $" + dailyWage);
        } else {
            System.out.println("Employee is Absent. No Daily Wage.");
        }
    }

    static boolean isEmployeePresent() {
        Random random = new Random();
        return random.nextInt(2) == 1; //it help to check weather the employee is present
    }

    static int calculateDailyWage() {

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;

        return WAGE_PER_HOUR * FULL_DAY_HOURS;
    }
}