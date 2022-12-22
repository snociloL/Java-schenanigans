import java.util.Scanner;

public class LaptopQueue {
    private String brand; //Acer, Asus, Lenovo,etc
    private String OS; //Operating system: Windows 8, Unix, etc
    private double price;
    private String colour; //black, white, silver, blue, etc
    
    public LaptopQueue (String b, String o, double p, String c) {
        brand = b;
        OS = o;
        price = p;
        colour = c;
    }
    public String getBrand() { return brand;}
    public String getOS() {return OS;}
    public double getPrice() {return price;}
    public String getColour() {return colour;}
    public void setData(String b, String o, double p, String c) {
        brand=b;
        OS=o;
        price=p;
        colour=c;
    }
    public String toString() {return "\n\nLaptop brand : "+getBrand()+"\nOperating System : "+getOS()+"\nPrice : "+getPrice()+"\nColour : "+getColour();}
    public static void main(String[] args) {
        Queue LaptopQ = new Queue();
        Queue WindowsQ = new Queue();
        Queue tempQ = new Queue();
        Queue unixQ = new Queue();
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String brand, OS, colour;
        double price;
        int count=0;
        int total=0;

        for(int i=0; i<5; i++) {
            System.out.println("\nInsert the brand of Laptop : ");
            brand = sc.nextLine();
            System.out.println("The Operating System used : ");
            OS = sc.nextLine();
            System.out.println("Price of Laptop : ");
            price = num.nextDouble();
            System.out.println("Colour : ");
            colour = sc.nextLine();
            LaptopQueue lq = new LaptopQueue(brand, OS, price, colour);
            LaptopQ.enqueue(lq);
        }

        while(!LaptopQ.isEmpty()) {
            LaptopQueue temp = (LaptopQueue) LaptopQ.dequeue();
            if(temp.getOS().equalsIgnoreCase("Unix"))
                unixQ.enqueue(temp);
            else if(temp.getOS().equalsIgnoreCase("Windows"))
                WindowsQ.enqueue(temp);
        }

        System.out.println("\nList of Silver Asus laptops that uses Windows OS.");
        while(!WindowsQ.isEmpty()) {
            LaptopQueue temp = (LaptopQueue) WindowsQ.dequeue();
            if(temp.getBrand().equalsIgnoreCase("Asus") && temp.getColour().equalsIgnoreCase("Silver")) {
                temp.toString();
                count++;
            }
        }
        System.out.println("\nThere are "+count+" total of Silver Asus laptops that uses Windows OS.");

        while(!unixQ.isEmpty()) {
            LaptopQueue temp = (LaptopQueue) unixQ.dequeue();
            if(temp.getColour().equalsIgnoreCase("Black")) {
                temp.toString();
                total+=temp.getPrice();
            }
            tempQ.enqueue(temp);   
        }
        System.out.println("\nTotal price of all Unix based laptos is RM"+total);

    sc.close();
    num.close();
    }
}