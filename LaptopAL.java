import java.util.ArrayList;
import java.util.Scanner;

public class LaptopAL {
    private String brand; //Acer, Asus, Lenovo,etc
    private String OS; //Operating system: Windows 8, Unix, etc
    private double price;
    private String colour; //black, white, silver, blue, etc
    
    public LaptopAL (String b, String o, double p, String c) {
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
        ArrayList <LaptopAL> LaptopAL = new ArrayList<>();
        ArrayList <LaptopAL> WindowsAL = new ArrayList<>();
        ArrayList <LaptopAL> UnixAL = new ArrayList<>();
        ArrayList <LaptopAL> Windows4000 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String brand, OS, colour;
        double price;
        int count=0;

        for(int i=0; i<5; i++) {
            System.out.println("\nInsert the brand of Laptop : ");
            brand = sc.nextLine();
            System.out.println("The Operating System used : ");
            OS = sc.nextLine();
            System.out.println("Price of Laptop : ");
            price = num.nextDouble();
            System.out.println("Colour : ");
            colour = sc.nextLine();
            LaptopAL lAL = new LaptopAL(brand, OS, price, colour);
            LaptopAL.add(lAL);

            if(LaptopAL.get(i).getOS().equalsIgnoreCase("Windows"))
                WindowsAL.add(LaptopAL.get(i));
            else if(LaptopAL.get(i).getOS().equalsIgnoreCase("Unix"))
                UnixAL.add(LaptopAL.get(i));
        }

        for(int i=0; i<WindowsAL.size(); i++) {
            if(WindowsAL.get(i).getPrice()>4000) {
                System.out.println(WindowsAL.get(i).toString());
                Windows4000.add(WindowsAL.get(i));
            }
        }

        for(int i=0; i<UnixAL.size(); i++) {
            if(UnixAL.get(i).getColour().equalsIgnoreCase("Silver")){
                UnixAL.get(i).toString();
                count++;
            }
        }
        System.out.println("\nThe amount of Unix-based laptop with a silver colour is "+count);
        sc.close();
        num.close();
    }
}