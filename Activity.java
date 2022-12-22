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

    public String toString() {
        return "bruh"+activityName+organizer+budget+date;
    }
}

class RoomActivity {
    private String roomType;
    private int numOfParticipant;
    Activity aktiviti;


    public RoomActivity(String r, int n) {
        roomType = r;
        numOfParticipant = n;
    }

    public void setRoomType(String r) { roomType = r;} 
    public void setNumOfParticipant(int n) { numOfParticipant = n;}

    public String getRoomtype() {return roomType;}
    public int getParticipant() {return numOfParticipant;}
    
    
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
}
