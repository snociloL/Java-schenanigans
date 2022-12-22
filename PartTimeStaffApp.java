import java.util.Scanner;
class PartTimeStaffApp {

   public static void main (String args[]) {
      Scanner input=new Scanner(System.in);
      
         System.out.println(" IC NO: ");
            String icNo=input.nextLine();
         System.out.println(" Age : ");
            int age=input.nextInt();
            input.nextLine();
         System.out.println(" Address : ");
            String address=input.nextLine();
         System.out.println(" Hour : ");
            int hour=input.nextInt();
         
         PartTimeStaff staff1=new PartTimeStaff(icNo,age,address,hour);
         
         System.out.println(staff1.toString());
         input.close();
         }
}