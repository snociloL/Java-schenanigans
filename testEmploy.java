class Employee 
{
    protected String emp_name; //employee’s name
    protected String emp_id; //employee’s id
    protected double bonus_percentage;


    public Employee()
    {
        emp_name = null;
        emp_id = null;
        bonus_percentage = 0.00;
    }

    public Employee(String name, String id,double bonus)
    {
        emp_name = name;
        emp_id = id;
        bonus_percentage = bonus;        
    }
}

class Salesman extends Employee
{
    protected double basic_salary; //basic salary of the salesman
    protected double sales_amount; //total sales achieved for a given month.
    protected double comm_percentage; //commission percentage receive from the total sales
    protected final double TAX_PERCENTAGE = 0.15; //only apply to basic_salary


    public Salesman(String n,String i,double bonus,double b, double s, double c)
    {
        super(n,i,bonus);
        basic_salary = b;
        sales_amount = s;
        comm_percentage = c;
    }

    public double calcSalary(double bonus,double basic,double s,double c)
    {
        double netSalary = 0;
        
        c = c * s;
        bonus = (bonus * basic );
        netSalary = basic + bonus + c - (s * TAX_PERCENTAGE);

        return netSalary;
    }

    public String toString()
    {
        return("\nBasic salary: " + basic_salary +"\nSales amount: " + sales_amount + "\nCommission percentage: " + comm_percentage);
    }
}

class HourlyEmployee extends Employee
{
    protected int hours_work; //total hours work for the month.
    protected double wage_per_hour; 


    public HourlyEmployee(String n,String i,double bonus,int h, double w)
    {
        super(n,i,bonus);
        hours_work = h;
        wage_per_hour = w;
    }

    public double calcSalary(int h, double w)
    {
        double netSalary = (h * w) * 28; //assuming 28 days
        return netSalary;
    }

    public String toString()
    {
        return("\nHours worked: " + hours_work + "\nWage per hour: " + wage_per_hour);
    }
}
public class testEmploy {
    public static void main(String[] args) 
    {
        HourlyEmployee employee = new HourlyEmployee("Aqil","2020", 0.1,9, 500);
        Salesman salesman = new Salesman("Rita","2121", 0.15, 500000, 400000, 0.15);


        System.out.println("Employee data: \n\nEmployee name: " + employee.emp_name + "\nEmployee ID: " + employee.emp_id + "\nEmployee bonus percentage: " + employee.bonus_percentage +  employee.toString() +"\nEmployee net salary: RM" + employee.calcSalary(9, 500) + "\n\n\nSalesman data: \n\n" + "\nSalesman name: " + salesman.emp_name + "\nSalesman ID: " + salesman.emp_id + "\nSalesman bonus percentage" + salesman.bonus_percentage + salesman.toString() + "\nSalesman net salary: " + salesman.calcSalary(0.15, 50000, 40000, 0.15));
    }
}
