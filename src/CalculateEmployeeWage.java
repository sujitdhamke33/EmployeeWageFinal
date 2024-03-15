import java.util.ArrayList;
import java.util.Random;

public class CalculateEmployeeWage implements CalculteWageInterface
{
    final static int Is_Full_Time=1;
    final static int Is_Part_Time=2;
    final static int Is_Absent=0;

    public ArrayList<CompanyEmployeeWage> CompanyEmployeeWageList;

    public CalculateEmployeeWage()
    {
        CompanyEmployeeWageList=new ArrayList<>();
    }

    @Override
    public void addemployeeWage(String company, int Emp_rate_per_Hour, int NoofWorkingDays, int maxHrs)
    {
        CompanyEmployeeWage companyemployeeWage=new  CompanyEmployeeWage(company, Emp_rate_per_Hour, NoofWorkingDays, maxHrs);
        CompanyEmployeeWageList.add(companyemployeeWage);
    }

    @Override
    public void calculateEmployeewage()
    {
        for (int i = 0; i < CompanyEmployeeWageList.size(); i++)
        {
            CompanyEmployeeWage companyemployeeWage=CompanyEmployeeWageList.get(i);
            companyemployeeWage.setempWage(this.calculatewage(companyemployeeWage));
            System.out.println(companyemployeeWage);
        }
    }

    @Override
    public int calculatewage(CompanyEmployeeWage companyEmployeeWage)
    {
        int empHrs=0,totalempHrs=0,totalworkingday=0;
        Random randomcheck=new Random();
        while( companyEmployeeWage.NoofWorkingDays >= totalworkingday &&  companyEmployeeWage.maxHrs >= empHrs)
        {
            totalworkingday++;
            int empCheck=randomcheck.nextInt(3);

            switch(empCheck)
            {
                case Is_Full_Time:
                    empHrs += 8;
                    break;

                case Is_Part_Time:
                    empHrs +=4;
                    break;

                case Is_Absent:
                    empHrs+=0;
                    break;
            }
            totalempHrs+=empHrs;
        }
        return totalempHrs*companyEmployeeWage.Emp_rate_per_Hour;
    }

}