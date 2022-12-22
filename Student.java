public class Student {
    private String stuName, stuID;
    private double cgpa;
    private String deanStatus;
    //normal constructor 
    public Student (String name, String ID, double stuCgpa) {
        stuName = name;
        stuID = ID;
        cgpa = stuCgpa;
    }
    

    //accessor method
    public String getName() { return stuName; }
    public String getID() { return stuID; }
    public double getCgpa() { return cgpa; }
    public String deanCheck() {
        if(getCgpa() >= 3.6)
            deanStatus = "Dean's List";
        else if(getCgpa() <=3.59)
            deanStatus = "No achievement";
        return deanStatus;
    }
    public String toString() {
        return "\nName : "+getName()+"\nStudent ID : "+getID()+"\nCGPA for last semester : "+getCgpa()+"\nAchievement : "+deanCheck();
    }
}