import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Lorry[] lorryTrip = new Lorry[10];
        Bus[] busTrip = new Bus[10];

        String name, licenseNum, icNum, decision;
        char licenseType = 'X', route;
        double distanceTravel;
        int noOfTrip;

        for(int i = 0; i < 2; i++) {
            System.out.println("\nName : ");
            name = str.nextLine();
            System.out.println("License Number : ");
            licenseNum = str.nextLine();
            System.out.println("IC Number : ");
            icNum = str.nextLine();

            System.out.println("Lorry or Bus");
            decision = str.nextLine();
           
            if(decision.equalsIgnoreCase("Lorry")) {
                System.out.println("License Type (A/B/C/D) : ");
                licenseType =str.next().charAt(0);
                System.out.println("Distance travel in KM : ");
                distanceTravel = num.nextDouble();
                lorryTrip[i] = new Lorry(name, licenseNum, icNum, distanceTravel, licenseType);
            }
            else if(decision.equalsIgnoreCase("Bus")) {
                System.out.println("Route chosen (A/B) : ");
                route =str.next().charAt(0);
                System.out.println("Number of trip(s) : ");
                noOfTrip = num.nextInt();
                busTrip[i] = new Bus(name, licenseNum, icNum, route, noOfTrip);
            }

            for(i = 0; i< 2;i++) {
                if(licenseType == 'A'){
                    System.out.println(lorryTrip[i].toString());
                    System.out.println("\nTotal Payment Fee : RM"+lorryTrip[i].calcPayment());

                }
            }
        }





        str.close();
        num.close();
    }
}
