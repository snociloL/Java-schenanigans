public abstract class Driver { 
 private String name; 
 private String licenseNum; 
 private String icNum; 
 
    public Driver(String n,String l, String i) { 
        name=n; 
        licenseNum=l; 
        icNum=i; 
    }   
    public String getName()  { 
        return name; 
    }   
    public String getLicenseNum() { 
        return licenseNum; 
    }   
    public String getIcNum() { 
        return icNum; 
    }   
public abstract double calcPayment(); 

    public String toString() {
        return name+ "\t" +licenseNum + "\t" + icNum; 
    } 
}

 class Lorry extends Driver{
    private double distanceTravel;
    private char licenseType;
    private double rate;

    public Lorry(String n, String li, String ic, double d, char l) {
        super(n, li, ic);
        distanceTravel = d;
        licenseType = l;
        }

    public double calcPayment() {

        switch(licenseType) {
            case 'A':
            {
                if(distanceTravel <= 200 && distanceTravel >= 1) {
                    rate = 100.0;
                }
                else if(distanceTravel <= 500 && distanceTravel >= 201) {
                    rate = 150.0;
                }
                else if(distanceTravel >= 501) {
                    rate = 200.0;
                }
                break;
            }
            case 'B':
            {
                if(distanceTravel <= 500 && distanceTravel >= 1) {
                    rate = 200.0;
                }
                else if(distanceTravel >= 501) {
                    rate = 250.0;
                }
                break;
            }
            default: System.out.println("\nERROR : Unknown Input");
        }

        return rate;
    }
    public char getLicenseType() {return licenseType;}

}

class Bus extends Driver{
    private char route;
    private double rate;
    private int noOfTrip;

    public Bus(String n, String li, String ic, char l, int no) {
        super(n, li, ic);
        route = l;
        noOfTrip = no;
    }

    public double calcPayment() {

        switch(route) {
            case 'A':
            {
                rate = 50.0;
                break;
            }
            case 'B':
            {
                rate = 75.0;
                break;
            }
            case 'C':
            {
                rate = 100.0;
                break;
            }
            case 'D':
            {
                rate = 150.0;
                break;
            }
            default: System.out.println("\nERROR : Unknown Input");
        }

        return noOfTrip*rate;
    }
}