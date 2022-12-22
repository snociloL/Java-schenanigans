public class StudentProject {
    private String stuName;
    private String projTitle;
    private String supervisor;
    private double projMarks;

    //Normal constructor
    public StudentProject (String name, String title, String supName, double mark){
        stuName = name;
        projTitle = title;
        supervisor = supName;
        projMarks = mark;
    }

    //Accessor or Getters Method
    public String getName() { return stuName; }
    public String getTitle() { return projTitle; }
    public String getSupervisor() { return supervisor; }
    public double getMark() { return projMarks; }
    
    //display information
    public String toString() {
        return "\nName : "+getName()+"\nProject Title : "+getTitle()+"\nSupervisor Name : "+getSupervisor()+"\nProject Marks : "+getMark();
    }
}
