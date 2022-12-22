import java.util.*;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <String> YY = new ArrayList <String> ();
        YY.add("Java");
        YY.add("C++");
        YY.add("Perl");
        YY.add("PHP");
        System.out.println("Contents of YY: " + YY);
        System.out.println("Contents of YY's index 1 : " + YY.get(1));
        System.out.println("Does the ArrayList have the word Java in it : ");
        if(YY.contains("Java"))
            System.out.println("Yes");
        else
            System.out.println("No");
        YY.add(2,"Play");
        System.out.println("Contents of YY currently : " + YY);

        if(YY.isEmpty())
            System.out.println("The ArrayList is empty.");
        else
        System.out.println("There's a lot of words in this with the arraylist size of "+YY.size());
        
        for(int i=0; i<YY.size();i++){ 
            if(YY.get(i)=="Perl")
                System.out.println("The index that has the word Perl is "+i);; 
        }
        System.out.println("The size of YY currently is "+YY.size());
    }
}