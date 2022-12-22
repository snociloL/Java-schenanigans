import java.util.ArrayList;
import java.util.Scanner;
public class numAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Float> numAL = new ArrayList<Float>();
        numAL.add(10.5f);
        numAL.add(20.3f);
        numAL.add(15.5f);
        System.out.println("Contents of numAL: " + numAL);


        for(int i=0; i<3; i++) {
            System.out.println("Please insert a floating point number : ");
            numAL.add(input.nextFloat());
        }
        System.out.println("\nContents of numAL: " + numAL);

        float sum;
        sum = numAL.get(2) + numAL.get(4) + numAL.get(5);
        System.out.println("\nSum of numAL(2),sumAL(4) and sumAL(5) : " + sum);

        System.out.println("\nDoes the numAL have the value of 50.5 in it?");
        if(numAL.contains(50.5f))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        for(int i=0;i<numAL.size();i++){
            if(numAL.get(i)>10.0f){
                numAL.remove(i);
                i--;
            }
        }
        System.out.println("\nContents of numAL: " + numAL);

        if(numAL.isEmpty())
        System.out.println("\nnumAL is empty.");
    else
    System.out.println("\nThere's a lot of numbers in this with the size of "+numAL.size());
    
    input.close();
    }
}