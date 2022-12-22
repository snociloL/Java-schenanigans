import java.util.*;

public class numberList {
    public static void main(String[] args) {
        ArrayList <Integer> numberList = new ArrayList <Integer> ();
        numberList.add(8);
        numberList.add(10);
        numberList.add(55);
        System.out.println("Contents of numberList: " + numberList);

        numberList.add(100);
        numberList.add(150);
        numberList.add(200);
        System.out.println("Contents of numberList: " + numberList);

        numberList.add(2, 20);
        numberList.remove(0);
        System.out.println("Contents of numberList: " + numberList);

        for(int i=0;i<numberList.size();i++) {
            if((numberList.get(i)%2)==0) {
                numberList.remove(i);
                i--;
            }        
        }
        System.out.println("Contents of numberList: " + numberList);
    }    
}