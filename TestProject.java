import java.util.Scanner;

public class TestProject
{
    public static void main(String[] args) {
        //declare Scanner object
        Scanner scan= new Scanner(System.in);

        //declare variables
        String name, title, svName;
        double mark;

        //Enter value by user
        System.out.println("Enter Student name : ");
            name = scan.nextLine();
        System.out.println("Enter Project Title : ");
            title = scan.nextLine();
        System.out.println("Enter Supervisor name : ");
            svName = scan.nextLine();
        System.out.println("Enter Project Mark : ");
            mark = scan.nextDouble();
        
        //call normal constructor
        StudentProject student = new StudentProject(name, title, svName, mark); //assign to data members

        //display info of student
        System.out.println("\nStudent Info : "+student.toString());
        scan.close();
    }
} 