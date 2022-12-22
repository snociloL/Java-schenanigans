import java.util.*;

public class Coordinator {

        private String coordinatorName;
        private String programName;
        private String facultyName;

        //normal constructor
        public Coordinator(String c, String p, String f) {
            coordinatorName = c;
            programName = p;
            facultyName = f;
        }

        //setters
        public void setCoodinatorName(String c) {coordinatorName = c;}
        public void setProgramName(String p) {programName = p;}
        public void setFacultyName(String f) {facultyName = f;}

        //getters
        public String getCoordinatorName() {return coordinatorName;}
        public String getProgramName() {return programName;}
        public String getFacultyName() {return facultyName;}

        //printer
        public String toString() {
            return "";
        }		

    public static void main(String[] args) {
        ArrayList <Coordinator> coordinatorAL = new ArrayList<>();
        String temp1, temp2, temp3;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 20 Coordinator details:");
        
        for(int i=0; i<20; i++) {
            temp1= sc.nextLine();
            temp2= sc.nextLine();
            temp3= sc.nextLine();
            Coordinator coor = new Coordinator(temp1, temp2, temp3);
            coordinatorAL.add(coor);
        }
        

        sc.close();
    }
}
