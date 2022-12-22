import java.util.Scanner;

public class Customer {
    String name;
    String customerCat;
    boolean member;

    public Customer(String n, String c, boolean m) {
        name = n;
        customerCat = c;
        member  = m;
    }

    public String getName() {return name;}
    public String getCustomerCat() {return customerCat;}

}

class VIP extends Customer {
    
    double price;
    char vipServices; // (S/B)

    public VIP(String n, String c, boolean m, char v) {
        super(n,c,m);
        vipServices = v;
    }

    public double getPrice() {return price;}
    public char getVipServices() {return vipServices;}

    public double calcNewPrice() {

        switch(vipServices) {
            case 'S' : 
            {
                price = 300.00;
                break;
            }
            case 'B' : 
            {
                price = 250.00;
                break;
            }
            default: System.out.println("\nERROR : Unknown Input");
        }
            price = price*0.85;

            if(member)
                price -= 50.00;

            return price;
        }
        
        
    

    public String display()
    {
        return("\nName : "+name+"\nCustomer Category : "+customerCat +"\nService amount: RM" + price);
    }

}

class Regular extends Customer {
    
    double price, newPrice;
    char regularService; // (F/B)

    public Regular(String n, String c, boolean m, char v) {
        super(n,c,m);
        regularService = v;
    }

    public double getPrice() {return price;}
    public double getNewPrice() {return newPrice;}
    public char getRegularService() {return regularService;}

    public double calcPrice() {
        switch(regularService) {
            case 'B' : 
            {
                price = 200.00;
                break;
            }
            case 'F' : 
            {
                price = 150.00;
                break;
            }
            default: System.out.println("\nERROR : Unknown Input");
        }
            newPrice = price*0.9;
            if(member)
                newPrice -= 10.00;
        return newPrice;
    }
    public String display()
    {
        return("\nName : "+name+"\n"+customerCat +"\nService amount: RM" + price);
    }

    public static void main(String[] args) {
        Customer[] cust = new Customer[10];
        VIP[] v = new VIP[10];
        Regular[] r = new Regular[10];
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String name, custCat;
        double totalIncome = 0.0;
        int countSpaVIP=0;
        char service;
        boolean member;

        for(int i = 0; i<cust.length; i++){
            System.out.println("\n\tInsert Name :");
            name= sc.nextLine();
            System.out.println("\tInsert Customer Category : (VIP / Regular)");
            custCat= sc.nextLine();
            System.out.println("Membership Status : (True / False)");
            member = sc.nextBoolean();
            System.out.println("\nType of service(s) : ");
            service = sc.next().charAt(0);
            //System.out.println("\nVIP/Regular : ");
            sc.nextLine();

            if(custCat.equalsIgnoreCase("VIP")){
                for(int u = 0; u<v.length; u++){
                v[u] = new VIP(name, custCat, member, service);
                countSpaVIP++;
            } }
            else if(custCat.equalsIgnoreCase("Regular")){
                for(int a = 0; a<r.length; a++) {
                r[a] = new Regular(name, custCat, member, service);
                }}
            
            cust[i] = new Customer(name, custCat, member);
        }

        for(int i = 0; i < r.length; i++){
            totalIncome += r[i].calcPrice();
        }
        for(int i = 0; i < v.length; i++){
            totalIncome += v[i].calcNewPrice();
        }

        System.out.println("\n Total income for both customer types = RM"+totalIncome);
        System.out.println("\nTotal Spa VIP customers : "+ countSpaVIP);
        sc.close();
        num.close();
    }
}

