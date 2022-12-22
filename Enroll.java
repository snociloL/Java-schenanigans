public class Enroll {
    String studID, studName, program, course;

    public Enroll() {
        studID=null;
        studName=null;
        program=null;
        course=null;
    }

    public Enroll(String i, String n, String p, String c) {
        studID=i;
        studName=n;
        program=p;
        course=c;
    }

    public void setEnroll(String i, String n, String p, String c) {studID=i; studName=n; program=p; course=c;}

    public String getID() {return studID;}
    public String getName() {return studName;}
    public String getProgram() {return program;}
    public String getCourse() {return course;}

    public boolean courseCheck() {
        if(getCourse().equalsIgnoreCase(" CTU551"))
            return true;
        return false;
    }

    public String toString() {
        return "Student Name = "+studName+" Student ID = "+studID+"\nProgram code = "+program+" Course code = "+course; 
    }
}
