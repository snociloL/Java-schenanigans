import java.util.Scanner;

class Staffs {
    protected int id;
    protected String name;

    //Set Staff Name
    public Staffs(String n, int idNum) {
        name = n;
        id = idNum;
    }
}

public class GroupProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("\nPlease insert your Staff Name :-");
        //String name = sc.nextLine();
        //System.out.println("\nPlease insert your Staff ID :-");
        //int id = num.nextInt();


        Product stock = new Product("list.txt");     

        System.out.println("What would you like to do?");
        String commands = sc.nextLine();
        switch(commands) {
            case "Add Product":
            {
                stock.AddProduct();
                break;
            }
            case "View Product":
            {
                Product.ViewProduct();
                break;
            }
            case "Check Profit":
            {
                Cart.printProfit();
                break;
            }
            default: System.out.println("\nERROR : Unknown Input. Please try again");
        }
        sc.close();
        num.close();
    }
}
