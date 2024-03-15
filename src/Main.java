public class Main {
    public static void main(String[] args) {
        CalculateEmployeeWage calWage=new  CalculateEmployeeWage();
        calWage.addemployeeWage("TCS", 20, 20, 120);
        calWage.addemployeeWage("Wipro", 30, 20, 130);
        calWage.addemployeeWage("L&T", 35, 20, 120);
        calWage.calculateEmployeewage();
    }
}
