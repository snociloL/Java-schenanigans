import java.util.Scanner;

public class TestSalesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String id;
        double basicSalary;
        double salesAmount;

        System.out.println("Please insert your information details :- \nYour Name = ");
            name = sc.nextLine();
        System.out.println("Salesman ID = ");
            id = sc.nextLine();
        System.out.println("Your basic salary (RM) = ");
            basicSalary = sc.nextDouble();
        System.out.println("The amount sales you have made (RM) = ");
            salesAmount = sc.nextDouble();

        Salesman0 salesman = new Salesman0(name, id, basicSalary, salesAmount);

        System.out.println(salesman.toString());
        
        sc.close();
    }
    
}
