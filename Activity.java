public class Activity {
    private String activityName;
    private char organizer;
    private double budget;
    private String date;

    public Activity(String a, char o, double b, String d) {
        activityName = a;
        organizer = o;
        budget = b;
        date = d;
    }

    public void setActivityName(String a) {activityName = a;}
    public void setOrganizer(char o) {organizer = o;}
    public void setbudget(double b) {budget = b;}
    public void setDate(String d) {date = d;}

    public String getActivityName() {return activityName;}
    public String getDate() {return date;}
    public double getBudget() {return budget;}
    public char getOrganizer() {return organizer;}



    public String toString() {
        return "\nActivity Name : "+getActivityName()+"\nOrganizer : "+getOrganizer()+"\nTotal Budget : RM"+getBudget()+"\nDate : "+getDate();
    }
}

class RoomActivity extends Activity{
    private String roomType;
    private int numOfParticipant;
    Activity aktiviti;


    public RoomActivity(String a, char o, double b, String d, String r, int n) {
        super(a,o,b,d);
        roomType = r;
        numOfParticipant = n;
    }

    public void setRoomType(String r) { roomType = r;} 
    public void setNumOfParticipant(int n) { numOfParticipant = n;}

    public String getRoomtype() {return roomType;}
    public int getParticipants() {return numOfParticipant;}
    
    
    public double roomCharges(int num, char org) { //Fixed rate for Government Activities is RM1500.00. Private and University organisers will be charged RM25.00 and RM10.00 for each participant respectively.
        double orgFee;
        double total;
        switch(org) {
            case 'G':
            {
                total = 1500.00;
                break;
            }
            case 'P':
            {
                orgFee = 25.00;
                total = orgFee*num;
                break;
            }
            case 'U':
            {
                orgFee = 10.00;
                total = orgFee*num;
                break;
            }
            default: {
                System.out.println("\nERROR : Unknown Input. Please try again");
                total =0;
            }
        }return total;
    }
    public String toString() {
        return super.toString();
    }
    public String printer() {
        return "\nRoom Type : "+getRoomtype()+"\nNumber of Participants : "+getParticipants();
    }
}
