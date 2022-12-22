import java.util.Scanner;

public class TestWorker {
    public static void main(String[] args) {

        int numStaff;
        String name, icNumber,unit;
        Scanner num = new Scanner(System.in);
        int mdCount=0;
        System.out.println("Insert the number of workers : ");
        numStaff = num.nextInt();

        Worker[]staff = new Worker[numStaff];
        
        Scanner info = new Scanner(System.in);

        for(int i=0; i<staff.length; i++) {
            staff[i] = new Worker();

            System.out.println("\nPlease insert your info credentials :- \nName : ");
                name = info.nextLine();
            System.out.println("IC Number : ");
                icNumber= info.nextLine();
            System.out.println("Work Unit/Department, Marketing Department (MD)/ Finance Department (FD) : ");
                unit = info.nextLine();
            System.out.print(unit);
            staff[i].setWorker(name, icNumber, unit);
            
            if(unit.equals("MD")) {
                mdCount++;
            }
            System.out.println(staff[i].displayInfo());
            System.out.println("Kelantan Origin : "+staff[i].fromKelantan());
        }
        System.out.println("Number of people from Marketing Department : "+mdCount);
        num.close();
        info.close();
    }
}