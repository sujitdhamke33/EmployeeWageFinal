import java.util.Random;

public class EmploWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int attendence = randomAttendence();

        int dailyWage = DailyWage(wagePerHour,fullTimeHours,attendence,partTimeHours);
        System.out.println("Daily Wage: $" + dailyWage);

    }
    static int randomAttendence(){
        Random rand = new Random();
        return rand.nextInt(3);
    }
    static int DailyWage(int wagePerHour, int fullTimeHours, int attendence,  int partTimeHours) {

        int dailyWage = 0;

        if(attendence == 0){
            System.out.println("Employee is absent : No daily wage" );
        }else if(attendence == 1) {
            dailyWage = wagePerHour * fullTimeHours;
            System.out.println("Employee is Full time");
        } else{
            dailyWage = wagePerHour * partTimeHours;
            System.out.println("Employee is part_time");
        }
        return dailyWage;
    }
}