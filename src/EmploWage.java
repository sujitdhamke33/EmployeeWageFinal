import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EmploWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee\n" +
                "Wage Computation\n" +
                "Program on Master Branch");
        int attendence = randomAttendence();

        if(attendence == 1){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }
    }
    static int randomAttendence(){
        Random rand = new Random();
        return rand.nextInt(2);
    }
}