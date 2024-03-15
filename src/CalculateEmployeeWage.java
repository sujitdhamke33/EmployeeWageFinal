import java.util.Random;

public class CalculateEmployeeWage
{
    final static int Is_Full_Time=1;
    final static int Is_Part_Time=2;
    final static int Is_Absent=0;

    int numofCompany=0;
    EmploWage[] CompanyEmployeeWageArray;

    public CalculateEmployeeWage()
    {
        CompanyEmployeeWageArray=new EmploWage[5];
    }
    public void addemployeeWage(String company, int Emp_rate_per_Hour, int NoofWorkingDays, int maxHrs)
    {
        CompanyEmployeeWageArray[numofCompany++]=new EmploWage(company, Emp_rate_per_Hour, NoofWorkingDays, maxHrs);
    }

    public void calculateEmployeewage()
    {
        for (int i = 0; i < numofCompany; i++)
        {
            CompanyEmployeeWageArray[i].setempWage(this.calculatewage(CompanyEmployeeWageArray[i]));
            System.out.println(CompanyEmployeeWageArray[i]);
        }
    }
    public int calculatewage(EmploWage companyEmployeeWage)
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
