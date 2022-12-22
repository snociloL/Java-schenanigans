import java.util.*;
public class Repetition {
    public static void main(String[] args) {
        double radius=0;
        double volume=0;
        int user=1;
        Scanner input = new Scanner(System.in);

          while(user !=0)
        {
            System.out.println("Please insert the radius of the sphere (cm) : ");
            radius=input.nextDouble();
            
            volume=(4.0/3)*(Math.PI)*(Math.pow(radius, 3));


            System.out.println("The volume of the sphere is " +volume + "cm^3.");

            System.out.println("Press 1 to continue or 0 to exit.");
                user=input.nextInt();
        }
    input.close();}
}
