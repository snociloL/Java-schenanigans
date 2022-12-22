import java.util.*;
import java.util.LinkedList;

public class KitchenAppliance
{
   private String applianceCode;   //KA100, KC22
   private String applianceType;   //oven,toaster,mixer
   private double price;
   private String colour;           //grey, black, white, silver, red

   //normal constructor
   public KitchenAppliance(String code, String type, double p, String c) {
       applianceCode = code;
       applianceType = type;
       price = p;
       colour = c;
    }

   //accessor methods: getCode(), getType(), getPrice(), getColour()
    public String getCode() {return applianceCode;}
    public String getType() {return applianceType;}
    public double getPrice() {return price;}
    public String getColour() {return colour;}

   //printer method: toString()
   public String toString() {
       return "\n\nAppliance Code: "+getCode()+"\nAppliance Type: "+getType()+"\nAppliance Colour: "+getColour()+"\nAppliance Price: "+getPrice();
   }

   public static void main(String[] args) {
    LinkedList <KitchenAppliance> applianceLL = new LinkedList<>();
    LinkedList <KitchenAppliance> ovenLL = new LinkedList<>();
    LinkedList <KitchenAppliance> toasterLL = new LinkedList<>();
    LinkedList <KitchenAppliance> mixerLL = new LinkedList<>();
    LinkedList <KitchenAppliance> redMixerLL = new LinkedList<>();
    String temp1, temp2, temp3;
    double price=0;
    Scanner sc = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    System.out.println("\nEnter 10 Appliances details:");
    
    for(int i=0; i<10; i++) {
        System.out.println("\nInsert Aplliance Code :");
        temp1= sc.nextLine();
        System.out.println("Insert Aplliance Type :");
        temp2= sc.nextLine();
        System.out.println("Insert Aplliance Colour :");
        temp3= sc.nextLine();
        System.out.println("Insert Aplliance Price :");
        price= num.nextDouble();
        KitchenAppliance temp = new KitchenAppliance(temp1, temp2, price, temp3);
        applianceLL.add(temp);
    }
    
    for(int i=0; i<10; i++) {
        if(applianceLL.get(i).getType().equalsIgnoreCase("oven"))
            ovenLL.add(applianceLL.get(i));
        else if(applianceLL.get(i).getType().equalsIgnoreCase("toaster"))
            toasterLL.add(applianceLL.get(i));
        else if(applianceLL.get(i).getType().equalsIgnoreCase("mixer"))
            mixerLL.add(applianceLL.get(i));
    }

    for(int i=0; i<mixerLL.size(); i++) {
        if(mixerLL.get(i).getColour().equalsIgnoreCase("Red"))
            redMixerLL.add(mixerLL.get(i));
    }
    System.out.println("\nRed Mixer Appliances =-");
    for(int i=0; i<redMixerLL.size(); i++) {
        System.out.println(redMixerLL.get(i).toString());
    }
    sc.close();
    num.close();
   }
}
