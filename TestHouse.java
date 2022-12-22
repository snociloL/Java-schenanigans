import java.util.Scanner;
public class TestHouse {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        Person[]owner = new Person[2];
        House[]N = new House[2];

        String name; String ic; char gender; boolean government;
        char houseType; double area;
        double discount = 1.00, price;
        int terCount=0;
        int semiCount=0;
        int bunCount=0;
        int conCount=0;

        for(int i =0; i<2; i++) {
            System.out.println("\nPlease insert your info credentials :-");
            System.out.println("\nName : ");
            name = info.nextLine();
            System.out.println("IC Number : ");
            ic = info.nextLine();
            System.out.println("Your Gender (M/F/N) : ");
            gender =info.next().charAt(0);
            System.out.println("Do you work for the government? (true/false) :");
            government = info.nextBoolean();
            System.out.println("\nYour House Type (T/S/B/C) : ");
            houseType = info.next().charAt(0);
            System.out.println("\nYour House Area : ");
            area = num.nextDouble();

            owner[i] = new Person();
            owner[i].setPerson(name, ic, gender, government);
            N[i] = new House();
            N[i].setHouse(houseType, area);

            if(N[i].houseType == 'T') {
                terCount++;
            }
            if(N[i].houseType == 'S') {
                semiCount++;
            }
            if(N[i].houseType == 'B') {
                bunCount++;
            }
            if(N[i].houseType == 'C') {
                conCount++;
            }
        }
        
        for(int i=0;i<2;i++) {
            price = N[i].calculateTax();
            //if(owner[i].fromKedah() == true)
            System.out.println(N[i].toString());
            System.out.println(owner[i].getInfo());
            if(owner[i].government == true)
                discount -= 0.15;
            if(owner[i].ic.substring(7, 9).equals("02"))
                discount -= 0.08;

            if(owner[i].ic.substring(7,9).equals("02"))
                System.out.println("\nFinal Tax Price after discount : RM"+price*discount);
        }
        System.out.println("\n\nTotal numbers of people who live in each types of houses :-\nTerrace : "
        +terCount+"\nSemi-Detached : "+semiCount+"\nBungalow : "+bunCount+"\nCondominium : "+conCount);

        info.close();
        num.close();
    }
}