public class Salesman0 {
    private String name; 
    private String id;
    private double basicSalary;
    private double salesAmount;
    private double totalSalary;
    private double commission;
    public Salesman0() {
        name = " ";
        id = " ";
        basicSalary = 0.0;
        salesAmount =0.0;
    }

    public Salesman0(String salesName, String salesID, double salary, double salesSum) {
        name = salesName;
        id = salesID;
        basicSalary =salary;
        salesAmount = salesSum;
        totalSalary = calculateNetSalary();
    }

     public double calculateNetSalary() {
        commission = 0.15*salesAmount;
        double total = commission+basicSalary;
        return total;
     }
     public String getName() { return name; }
     public String getID() { return id; }
     public double getSalary() { return basicSalary; }
     public double getSales() { return salesAmount; }
     public double getTotalSal() { return totalSalary; }
     public double getCommission() { return commission; }

     public String toString() {
         return "\nName : "+getName()+"\nSalesman ID : "+getID()+"\nSalesman's basic salary : RM"+getSalary()+
                "\nSalesman's sales amount = RM"+salesAmount+"\nCommission bonus = RM"+commission+"\nTotal salary = RM"+getTotalSal();
     }
}