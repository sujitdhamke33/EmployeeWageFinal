public class Main {
    public static void main(String[] args) {

        CalculateEmployeeWage calWage=new  CalculateEmployeeWage();
        calWage.addemployeeWage("TCS", 120, 20, 120);
        calWage.addemployeeWage("Wipro", 125, 20, 130);
        calWage.addemployeeWage("L&T", 140, 22, 140);
        calWage.addemployeeWage("Capgemini", 135, 25, 125);

        calWage.calculateEmployeewage();
        calWage.getTotalWage("Capgemini");
    }
}