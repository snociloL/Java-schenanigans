import java.util.*;
import java.util.Scanner;

public class SortAndSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> cookiesAL = new ArrayList<>();
        String temp;
        int index=0;
        System.out.println("\n\t\t Cookies Sort and Search Application \n");
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n\n");
        System.out.println("\nEnter 10 cookies names:");
        
        for(int i=0; i<10; i++) {
            temp= sc.nextLine();
            cookiesAL.add(temp);
        }
        System.out.println("\n***Before Sorting***");
        for (int i=0; i<cookiesAL.size();i++) {
            System.out.println(cookiesAL.get(i).toString());
        }

        for(int i=0; i<cookiesAL.size(); i++) {
            for(int u=1; u<(cookiesAL.size()-i); u++) {
                if(cookiesAL.get(u-1).compareTo(cookiesAL.get(u))>0){
                    temp = cookiesAL.get(u-1);
                cookiesAL.set(u-1, cookiesAL.get(u));
                cookiesAL.set(u, temp);
                }
            }
        }
        System.out.println("\n***After Sorting***");
        for (int i=0; i<cookiesAL.size();i++) {
            System.out.println(cookiesAL.get(i).toString());
        }
        
        System.out.println("\nEnter COOKIES NAME to be searched: ");
            String nameSearch = sc.nextLine();
            index = Collections.binarySearch(cookiesAL, nameSearch);
            for(int i=0;i<cookiesAL.size();i++) {
                if(cookiesAL.get(i)==nameSearch)
                    index = i;
            }
        System.out.println("The cookies name "+nameSearch+" is found at index "+index);
        sc.close();
    }
}