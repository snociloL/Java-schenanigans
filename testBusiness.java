import java.util.Scanner;

public class testBusiness {

    public static void main(String[] args) {
        double s;
        Business[]person = new Business[2];
        Scanner keyboard = new Scanner(System.in);
        Scanner key = new Scanner(System.in);
        keyboard.useDelimiter("\n");

        for(int i=0; i<person.length; i++) { 

            person[i] = new Business();
            
        System.out.print("Name : ");
            person[i].name=keyboard.nextLine();
        System.out.println("Age : ");
            person[i].age=key.nextInt();
        System.out.println("Salary : ");
            s= key.nextDouble();
            person[i].setSalary(s);
        System.out.println(person[i].checkStatus());
        System.out.print("\n\n");
        }
        key.close();
        keyboard.close();
    }
    
}
