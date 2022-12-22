import java.util.Scanner;

public class firstTime
{

   public static void main(String args[])

      {
         String response;
         Scanner input = new Scanner(System.in);
      
         System.out.println("Hello World!!");
         System.out.println("\nHello Java~~");
         
         response = input.nextLine();
         
         System.out.println(response);
         
         input.close();
      }
      
}