import java.util.*;
import java. util.Scanner;
public class FYP {
    private String projectTitle;	
    private String studentName;
    private String studentID;		
    private String supervisor;  //supervisor name
    private String field;	    //Computer Science,Networking,Netcentric

    public FYP(String a, String b, String c, String d, String e){
        projectTitle = a;
        studentName = b;
        studentID = c;
        supervisor = d;
        field = e;
    }

    public String getTitle() {return projectTitle;}
    public String getStudentName() {return studentName;}
    public String getStudentID() {return studentID;}
    public String getSupervisor() {return supervisor;}
    public String getField() {return field;}

    public String toString() {
        return "\nProject title: "+projectTitle+"\nSupervisor: "+supervisor;
    }

    public static void main(String[] args) {
        Stack <FYP> fypStack = new Stack<>();
        Stack <FYP> networkingStack = new Stack<>();
        Stack <FYP> holdStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
         String projectTitle;	
         String studentName;
         String studentID;		
         String supervisor;
         String field;
         int networkCount=0;

        for(int i=0; i<20; i++){
            System.out.println("\nProject title: ");
             projectTitle=sc.nextLine();
             System.out.println("Student Name: ");
             studentName = sc.nextLine();
             System.out.println("Student ID: ");
             studentID=sc.nextLine();
             System.out.println("Supervisor: ");
             supervisor=sc.nextLine();
             System.out.println("Field: ");
             field=sc.nextLine();
             FYP f = new FYP(projectTitle, studentName, studentID, supervisor, field);
             fypStack.push(f);
           }

        while(!fypStack.isEmpty()){
            FYP f = fypStack.pop();
            if(f.getField().equalsIgnoreCase("Networking")){
                networkingStack.push(f);
                networkCount++;
            }
            holdStack.push(f);
        }

        System.out.println("\nTotal number of networking Final Year Projects :"+networkCount);

        while(!holdStack.isEmpty()) {
            FYP f = holdStack.pop();
            fypStack.push(f);
        }

        System.out.println("\n----------List of networking Final Year Projects----------");

        while(!networkingStack.isEmpty()){
            FYP f = networkingStack.pop();
            if(f.getSupervisor().startsWith("Dr"))
                System.out.println(f.toString());
        }

        sc.close();
    }
}
