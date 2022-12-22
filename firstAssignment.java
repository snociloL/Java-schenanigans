import java.util.Scanner;

public class firstAssignment {
   
      public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      int a,b,sum1;
      double g,h,sum2;
      float x,y,sum3;
      
      System.out.println("\nPlease insert your first integer :-");
      a = input.nextInt();
      System.out.println("Please insert your second integer :-");
      b = input.nextInt();
      
      sum1 = a+b;
      System.out.println("The sum of your integers are : "+sum1);
      
      System.out.println("\nPlease insert your first double :-");
      g = input.nextDouble();
      System.out.println("Please insert your second double :-");
      h = input.nextDouble();
      
      sum2 = g+h;
      System.out.println("The sum of your doubles are :"+sum2);
      
      System.out.println("\nPlease insert your first float :-");
      x = input.nextFloat();
      System.out.println("Please insert your second float :-");
      y = input.nextFloat();
      
      sum3 = x+y;
      System.out.println("The sum of your floats are :"+sum3);
      input.close();
   }
}