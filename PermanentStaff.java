public class PermanentStaff extends Staff {

    private String jobTitle;
    private int workingYear;

    public PermanentStaff() {
       super();
       jobTitle = "null";
       workingYear = 0;
    }

    public PermanentStaff(String i, int a, String add, String j, int w) {
        super(i, a, add);
       jobTitle = j;
       workingYear = w;
       
    }

    String getjobTitle() {return jobTitle;}
    int getWorkingYear() {return workingYear;}

    void setJobTitle(String j) {jobTitle=j;}
    void setWorkingYear(int w) {workingYear=w;}

    double calculateSalary() {
        double salary=0;

        if(workingYear<=10) {
            switch(jobTitle) {
                case "Clerk" :
                {
                    salary=1500;
                    break;
                }
                case "Clerk Assistant":
                {
                    salary=1000;
                    break;
                }
                default: System.out.println("\nERROR : Unknown Input");
            }
        }
        else if(workingYear>10) {
            switch(jobTitle) {
                case "Clerk" :
                {
                    salary=2000;
                    break;
                }
                case "Clerk Assistant":
                {
                    salary=1500;
                    break;
                }
                default: System.out.println("\nERROR : Unknown Input");
            }
        }
        return salary;
     }
     
     public String toString() {
        return (super.toString()+"\nJobTitle : "+jobTitle+" Working year(s) : "+workingYear+" Salary is : "+calculateSalary());
       }
}
