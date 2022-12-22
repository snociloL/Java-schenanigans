import java.util.*;
    public class IOprogram 
{
    public static void main(String[] args) 
    {
        String name;
        int birthYear;
        float weight;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
            name=scanner.nextLine();
        System.out.println("Please enter your birth of year : ");
            birthYear=scanner.nextInt();
        System.out.println("Please enter your weight : ");
            weight=scanner.nextFloat();
        
            System.out.println("Your name : " +name);
                int age =2021 - birthYear;
            System.out.println("Your age : " +age);
            System.out.println("Your weight : " +weight); 
    scanner.close();
    }
}