import java.util.Scanner;

public class TestStudent
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, stuID;
        double cgpa;

        System.out.println("Enter Student name : ");
            name = sc.nextLine();
        System.out.println("Enter Student ID : ");
            stuID = sc.nextLine();
        System.out.println("Enter your CGPA  : ");
            cgpa = sc.nextDouble();

        Student student = new Student(name, stuID, cgpa);

        System.out.println("\nStudent's Info : - "+student.toString());
        sc.close();
    }
}