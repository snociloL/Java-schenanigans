import java.util.*;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        int number;
        Scanner num = new Scanner(System.in);
        ArrayList <Integer> numList = new ArrayList<>();

        for(int i=0; i<6; i++) {
            System.out.println("Insert a number :");
            number= num.nextInt();
            numList.add(number);
        }
        System.out.println("\nNumbers before being sorted :- \n"+numList);

        for(int i=0; i<numList.size(); i++) {
            for(int u=1; u<(numList.size()-i); u++) {
                if(numList.get(u-1) > numList.get(u)){
                    number = numList.get(u-1);
                numList.set(u-1, numList.get(u));
                numList.set(u, number);
                }
            }
        }
        System.out.println("\nNumbers after being sorted :- \n"+numList);
    num.close();
    }
}
