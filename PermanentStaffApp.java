import java.util.Scanner;
public class PermanentStaffApp {

    public static void main (String args[]) {
        Scanner input=new Scanner(System.in);
        
           System.out.println(" IC NO: ");
              String icNo=input.nextLine();
           System.out.println(" Age : ");
              int age=input.nextInt();
              input.nextLine();
           System.out.println(" Address : ");
              String address=input.nextLine();
            System.out.println(" Job title : ");
              String jobTitle=input.nextLine();
           System.out.println(" Working year(s) : ");
              int workingYear=input.nextInt();
           
           PermanentStaff pStaff=new PermanentStaff(icNo,age,address,jobTitle, workingYear);
           
           System.out.println(pStaff.toString());
           input.close();
           }
}
