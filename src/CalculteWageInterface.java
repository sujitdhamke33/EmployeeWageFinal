public interface CalculteWageInterface
{
    public void addemployeeWage(String company, int Emp_rate_per_Hour, int NoofWorkingDays, int maxHrs);
    public void calculateEmployeewage();
    public int calculatewage(CompanyEmployeeWage companyEmployeeWage);
    public void getTotalWage(String Company);
}