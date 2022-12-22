import java.util.*;

public class Selection {
    public static void main(String[] args) {
    
        String vehicle;
        double parkFee=0.00;
        int time;
    Scanner input = new Scanner(System.in);
    System.out.println("\nPlease insert the type of vehicle you just parked here : \n ( b for BUS, c for CAR, t for TRUCK) ");
        vehicle=input.nextLine();
    System.out.println("\nInsert the amount of time you have been parked your vehicle in hour(s) : ");
        time=input.nextInt();
    switch(vehicle) {
        case "c":
        {
            parkFee=2.00;
            break;
        }
        case "b":
        {
            parkFee=3.00;
            break;
        }
        case "t":
        {
            parkFee=4.00;
            break;
        }
        default: System.out.println("\nERROR : Unknown Input");
    }
    double fee=parkFee*time;
    System.out.println("Your parking fee is RM" +fee);
    input.close();
    }
    
}
