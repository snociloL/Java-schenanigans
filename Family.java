public class Family {
    String id;
    String race;
    int numberChild;
    double income;
    String state;

    public Family() {
        id = "null";
        race = "null";
        numberChild = 0;
        income = 0.0;
        state = "null";
    }

    public String getId() {return id;}
    public String getRace() {return race;}
    public int getNumberChild() {return numberChild;}
    public double getIncome() {return income;}
    public String getState() {return state;}

    public String displayInfo() {
       if(state.equals("Selangor"))
            return "\nID Number :"+getId()+"\nRace : "+getRace()+"\nNumber of Childrens : "+getNumberChild()+"\nFamily's Income "+getIncome()+"\nState of residency : "+getState();
        else
            return "";
    }
}