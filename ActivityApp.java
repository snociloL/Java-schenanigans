import java.util.Scanner;

public class ActivityApp {

public static void main (String[] args)   {

Scanner sc = new Scanner(System.in);
Scanner num = new Scanner(System.in);
RoomActivity[] activity = new RoomActivity[50]; 
char organiser = ' ';
int lab30 =0;

for (int i = 0; i < activity.length; i++)
 {
  System.out.print("\n\nBOOKING NO."+ (i+1));
  System.out.print("\n---------------");

  System.out.println("\nActivity Name : ");
  String activityName = sc.nextLine(); 

  System.out.println("\nOrganiser ( Government // Private // University): ");
  organiser = sc.next().charAt(0);

  System.out.println("\nEnter Budget: ");
  double budget = num.nextDouble();

  sc.nextLine();
  System.out.println("\nEnter Date (dd/mm/yyyy): ");
  String date = sc.nextLine();

  System.out.println("\nChoose Room Type (Auditorium // Meeting Room //  Computer Lab // Seminar Room): ");
  String roomType = sc.nextLine();

  System.out.println("\nEnter Number of Participants: ");
  int numOfParticipant = num.nextInt();

  activity [i] = new RoomActivity(activityName, organiser, budget, date, roomType, numOfParticipant);

  System.out.println(activity [i].toString());

  if (roomType.equalsIgnoreCase("L")  && numOfParticipant > 30)
   {
   lab30++;
   }
  sc.nextLine();
   }

   for(int i = 0; i<activity.length; i++){
    if (organiser == 'P')
    {
   System.out.println(activity [i].toString());
    }
    if (activity[i].getRoomtype().equalsIgnoreCase("L")  && activity[i].getParticipants() > 30)
    {
   System.out.println(activity[i].printer());
   System.out.println("\nNumber of Computer Lab that has been use with 30+ participants :"+lab30);
    }
   }

   sc.close();
   num.close();
   }

}