import java.util.*;
import java.util.Scanner;
public class University
    {
        private String name;
        private int no_of_faculty;
        private int no_of_programme;
        private String location;
        private int no_of_student;
        
        public University(String n,int fac ,int pro ,String loc ,int stud) {
            name = n;
            no_of_faculty = fac;
            no_of_programme = pro;
            location = loc;
            no_of_student = stud;
        }
        
        public String getName() {return name;}      
        public int getFaculty() {return no_of_faculty;}
        public int getProgram() {return no_of_programme;}
        public String getLocation() {return location;}
        public int getNoStudent() {return no_of_student;}
        public String toString() {return "\n\nName : "+getName()+"\nNumber of Faculties : "+getFaculty()+"\nNumber of Programmes : "+getProgram()+"\nLocation : "+getLocation()+"\nNumber of students : "+getNoStudent();}

      public static void main(String[] args) {
        ArrayList <University> uniAL = new ArrayList<>();
         String name;
         int no_of_faculty;
         int no_of_programme;
         String location;
         int no_of_student;
         int count=0;
         int highestProgrammes=0;
         int highestIndex=0;
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            System.out.println("\nName of Uni : ");
            name = sc.nextLine();
            System.out.println("Name of Location : ");
            location = sc.nextLine();
            System.out.println("Num of students : ");
            no_of_student = num.nextInt();
            System.out.println("Num of faculty : ");
            no_of_faculty = num.nextInt();
             System.out.println("Num of programme : ");
            no_of_programme = num.nextInt();
            University uni = new University(name, no_of_faculty, no_of_programme, location, no_of_student);
            uniAL.add(uni);
            count += uniAL.get(i).getNoStudent();
        }

        System.out.println("\nUniversities from Selangor :- ");
        for(int i =0; i<uniAL.size(); i ++) {
            if(uniAL.get(i).getLocation().equalsIgnoreCase("Selangor"))
                System.out.println(uniAL.get(i).toString());
            if(uniAL.get(i).getProgram()>highestProgrammes) {
                highestProgrammes = uniAL.get(i).getProgram();
                highestIndex = i;
            }
        }
        System.out.println("\nTotal of students across all universities = "+count);
        System.out.println("\nUniversity with the highest number of programmes offered = "+uniAL.get(highestIndex).toString());

    sc.close();
    num.close();
    }
}