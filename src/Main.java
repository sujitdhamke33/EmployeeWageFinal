public class Main {
    public static void main(String[] args) {
        CalculateEmployeeWage calWage=new  CalculateEmployeeWage();
        calWage.addemployeeWage("TCS", 20, 20, 120);
        calWage.addemployeeWage("Wipro", 30, 20, 130);
        calWage.addemployeeWage("L&T", 25, 22, 140);
        calWage.calculateEmployeewage();
    }
}
