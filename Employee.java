/*import java.util.Scanner;
import java.util.*;

public abstract class Employee 
{
    protected String firstName; //employee’s name
    protected String lastName; //employee’s id


    public Employee()
    {
        firstName = null;
        lastName = null;

    }

    public Employee(String name, String id)
    {
        firstName = name;
        lastName = id;
     
    }

   public abstract double earnings();
}

/*class Boss extends Employee
{
    protected double weeklySalary; //basic salary of the Boss
    protected double sales_amount; //total sales achieved for a given month.
    protected double comm_percentage; //commission percentage receive from the total sales
    protected final double TAX_PERCENTAGE = 0.15; //only apply to weeklySalary


    public Boss(String n,String i,double bonus,double b, double s, double c)
    {
        super(n,i,bonus);
        weeklySalary = b;
        sales_amount = s;
        comm_percentage = c;
    }

    public double earnings(double bonus,double basic,double s,double c)
    {
        double netSalary = 0;
        
        c = c * s;
        bonus = (bonus * basic );
        netSalary = basic + bonus + c - (s * TAX_PERCENTAGE);

        return netSalary;
    }

    public String toString()
    {
        return("\nBasic salary: " + weeklySalary +"\nSales amount: " + sales_amount + "\nCommission percentage: " + comm_percentage);
    }
}*/

/*class HourlyWorker extends Employee
{
    protected int hours; //total hours work for the month.
    protected double wage; 


    public HourlyWorker(String n,String i, int h, double w)
    {
        super(n,i);
        hours = h;
        wage = w;
    }

    public double earnings()
    {
        double bonus = 200.00;
        if(hours > 40)
            return hours*wage*bonus;
        else 
            return hours*wage;
        }


    public String display()
    {
        return "\nName : "+firstName+" "+lastName +"\nSalary amount: RM" + earnings();
    }
}/

class HourlyWorker extends Employee
{
     int hours; //total hours work for the month.
     double wage; 


    public HourlyWorker(String n,String i,int h,double w)
    {
        super(n,i);
        hours = h;
        wage = w;
    }

    public double earnings()
    {
        double bonus = 200.00;
        if(hours > 40)
            return hours*wage+bonus;
        else 
            return hours*wage;
        }


    public String display()
    {
        return "\nName : "+firstName+" "+lastName +"\nSalary amount: RM" + earnings();
    }
}
class Boss extends Employee{
    protected double weeklySalary; //basic salary of the Boss

    public Boss(String n,String i,double b)
    {
        super(n,i);
        weeklySalary = b;
    }

    public double earnings()
    {
        return weeklySalary;
    }

    public String display()
    {
        return("\nName : "+firstName+" "+lastName +"\nSalary amount: RM" + weeklySalary);
    }
}
 class testEmploy {
    public static void main(String[] args) 
    {
        ArrayList<HourlyWorker> employee = new ArrayList<>();
        ArrayList<Boss> boss = new ArrayList<>();
        String firstName, lastName, decision, response;
        double wage, salary, totalBossEarnings = 0.00, totalWorkerEarnings = 0.00, totalBonus = 0.00, higherstEarnings = -9.99;
        int hours, countBoss = 0, countWorker = 0;
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        do {
            System.out.println("\n\tInsert First Name :");
            firstName= sc.nextLine();
            System.out.println("\tInsert Last Name :");
            lastName= sc.nextLine();
            System.out.println("Boss or HourlyWorker : (B / H)");
            decision = sc.nextLine();
            
                if(decision.equalsIgnoreCase("B")){
                    System.out.println("\n Weekly Salary : RM");
                    salary = num.nextDouble();
                    Boss temp = new Boss(firstName,lastName, salary);
                    boss.add(temp);
                    countBoss++;
                }
            else if(decision.equalsIgnoreCase("H")){
                System.out.println("\n Wage : RM");
                    wage = num.nextDouble();
                System.out.println("\n Hours : ");
                    hours = num.nextInt();
                HourlyWorker temp = new HourlyWorker(firstName, lastName, hours, wage);
                    employee.add(temp);
                countWorker++;
            }
          
            System.out.println("\n\tDo you want to add another order? (Yes/No)");
            sc.nextLine();
            response = sc.nextLine();    
        }while(!response.equalsIgnoreCase("no"));

        for(int i =0; i<employee.size(); i ++) {
            totalWorkerEarnings += employee.get(i).earnings();
            if(employee.get(i).earnings()>higherstEarnings)
                higherstEarnings = employee.get(i).earnings();
            if(employee.get(i).hours>40)
                totalBonus += 200.00;
        }
        for(int i =0; i<boss.size(); i ++) {
            totalBossEarnings += boss.get(i).earnings();
        }

        for(int i=0; i<employee.size(); i++){
            if(employee.get(i).hours>48) 
                System.out.println(employee.get(i).display());
        }
        sc.close();
        num.close();
    }
}
*/