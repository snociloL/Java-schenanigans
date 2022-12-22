import java.util.Scanner;
public class Delivery {
    String id; 
    char destination;
    double weight;

    public Delivery() {
        id="xxx000";
        destination='X';
        weight=0.00;
    }

    public Delivery(Delivery a) {
        id=a.id;
        destination=a.destination;
        weight=a.weight;
    }

    //accessors
    public String getId() {return id;}
    public char getDestination() {return destination;}
    public double getWeight() {return weight;}
    
    //mutators
    public void setId(String i) {id = i;}
    public void setDestination(char d) {destination = d;}
    public void setWeight(double w) {weight=w;}

    public double calculateFee() {
        double fee=0;
        if(weight<5) {
            switch(destination) {
                case 'L' :
                {
                    fee=5.5*weight;
                    break;
                }
                case 'O':
                {
                    fee=(7.5*weight)+10.0;
                    break;
                }
                default: System.out.println("\nERROR : Unknown Input");
            }
        }
        else if(5<=weight) {
            switch(destination) {
                case 'L' :
                {
                    if(weight<=16)
                        fee=5.3*weight;
                    else if(weight>16)
                        fee=5.0*weight;
                    break;
                }
                case 'O':
                {
                    fee=(7.0*weight)+15.0;
                    break;
                }
                default: System.out.println("\nERROR : Unknown Input");
            }
        }
        return fee;
    }

    public String toString() {
        return "\nID : "+id+" Destination : "+destination+" Weight (kg) : "+weight+" Total Fee : RM"+calculateFee();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    

    System.out.println(" ID Number: ");
        String id=input.nextLine();
    System.out.println(" Destination (L/O) : ");
        char destination=input.next().charAt(0);
    System.out.println(" Weight : ");
        int weight=input.nextInt();
    Delivery d = new Delivery();

    d.setId(id);
    d.setDestination(destination);
    d.setWeight(weight);

    if(weight<5.0)
        System.out.println(d.toString());

    input.close();
    }
}

