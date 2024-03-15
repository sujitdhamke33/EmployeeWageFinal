public class Main {
    public static void main(String[] args) {
        CalculateEmployeeWage calWage = new CalculateEmployeeWage();
        calWage.addemployeeWage("TCS", 120, 20, 120);
        calWage.addemployeeWage("Wipro", 120, 20, 130);
        calWage.addemployeeWage("L&T", 120, 22, 140);

        calWage.calculateEmployeewage();
    }
}