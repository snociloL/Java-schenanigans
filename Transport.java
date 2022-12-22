import java.util.Scanner;

public class Transport {
    private String regisNum;
    private String brand;
    private double price;
    private double disPrice;


    public Transport(String r, String b, double p,double d) {
        regisNum =r;
        brand = b;
        price = p;
        disPrice = d;
    }

    public void transportSelangor() {
        if(regisNum.startsWith("B"))
            System.out.println("\n The vehicle was registered in Selangor.");
        else
            System.out.println("\n The vehicle was NOT registered in Selangor.");
    }

    public double discountPrice(double discount) {

        disPrice = price-(price*discount);
        return disPrice;
    }
    
    public String tostring() {
        return "\n\nThe Vehicle's Details:~ \nBrand : "+brand+"\nRegistered Number : "+regisNum+"\nOriginal Price : RM"+price+"\nDiscounted Price : RM"+disPrice;
    }

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        Scanner num =  new Scanner(System.in);
        String registrationNum;
        String brand;
        String stop = "n";
        double price;
        double discountRate;
        Queue transport = new Queue();
        do{
            System.out.println("\nInsert Registration Number : ");
            registrationNum = sc.nextLine();
            System.out.println("\nInsert Car Brand : ");
            brand = sc.nextLine();
            System.out.println("\nInsert Price : RM");
            price = num.nextDouble();
            System.out.println("\nInsert Discount Rate : ");
            discountRate = num.nextDouble();

            Transport car = new Transport(registrationNum, brand, price, discountRate);
            transport.enqueue(car);

            System.out.println("\nStop Input? : ");
            stop = sc.nextLine();
        }while(stop != "y");

        while(!transport.isEmpty()) {
            Transport c = (Transport) transport.dequeue();
            c.transportSelangor();
            c.discountPrice(discountRate);
            c.toString();
        }

        sc.close();
        num.close();
    }
}
