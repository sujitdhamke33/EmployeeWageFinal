public class CompanyEmployeeWage
{
    public final String company;
    public final int Emp_rate_per_Hour;
    public final int NoofWorkingDays;
    public final  int maxHrs;
    public int empWage=0;

    public CompanyEmployeeWage(String company, int Emp_rate_per_Hour, int NoofWorkingDays, int maxHrs)
    {
        this.company=company;
        this.Emp_rate_per_Hour=Emp_rate_per_Hour;
        this.NoofWorkingDays=NoofWorkingDays;
        this.maxHrs=maxHrs;
    }

    public void setempWage(int empWage)
    {
        this.empWage=empWage;
    }

    @Override
    public String toString() {
        return "Total Wage is : "+empWage;
    }




}