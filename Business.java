public class Business {
    String name;
    int age;
    private double salary;

    public void setSalary(double s)
    {
        salary = s;
    }

    public String checkStatus() {
        if(age<40 && salary > 100000)
            return "Young and rich";
        else if(age>40 && salary > 100000)
            return "Old and rich";
        else 
            return "Normal";
    }
}
