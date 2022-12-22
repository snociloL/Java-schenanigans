import java.util.*;

public class functions {
    public static float total = 0;

    public static float calcCharges(float hours) {
        float fee = 0;

       for(int i = 1; i <= hours; i++) {
        if(i <= 1) {
            fee += 1.00;
        }
       else if(i >= 2) {
            fee += 1.20;
        }
       }
        return(fee);
    }

    public static float calcTotal(float aC) {
        total += aC;
        return(total);
    }
    public static void main(String[] args) {
        float hours = 0;
        float localTotal = 0;
        char response;
        float amountCharges;
        Scanner scan = new Scanner(System.in);

        do {

        System.out.println("\nPlease enter the total hours: ");

        hours = scan.nextFloat();

        amountCharges = calcCharges(hours);
        
        System.out.println("Your parking fee is: RM" +amountCharges);
        System.out.println("Do you wish to enter another response? (Y/N)");
        localTotal = calcTotal(amountCharges);
        response = scan.next().charAt(0);

        } while(response == 'Y');
        
        System.out.println("\nThe total parking fee collected : RM" +localTotal);
    scan.close();
    }
}