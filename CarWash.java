import java.util.Scanner;

public class CarWash {

    private String carType;
    private String washSelection;
    private double amountCharge;

    public CarWash(String c, String w, double a) {
        carType = c;
        washSelection = w;
        amountCharge = a;
    }

        public void setCarType(String c) {carType = c;}
        public void setWashSelection(String w) {washSelection = w;}
        public void setAmountCharge(double a) {amountCharge = a;}

        //getters
        public String getCarType() {return carType;}
        public String getWashSelection() {return washSelection;}
        public double getAmountCharge() {return amountCharge;}

        //printer
        public String toString() {
            return "\nCar Type : "+getCarType()+"\nWash Selection : "+getWashSelection()+"\nAmount Charge : "+getAmountCharge();
        }		

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String carType;
        String washSelection;
        double amountCharge, totalAmount=0;
        Queue qCarWash = new Queue();
        Queue temp = new Queue();

        for(int i=0;i<2;i++) {
            System.out.println("\nInsert car type :");
            carType = sc.next();
            System.out.println("Insert type of wash :");
            washSelection = sc.next();
            System.out.println("Insert amount charge :");
            amountCharge = num.nextDouble();
            CarWash cw = new CarWash(carType, washSelection, amountCharge);
            qCarWash.enqueue(cw);
        }

        while(!qCarWash.isEmpty()) {
            CarWash c = (CarWash) qCarWash.dequeue();
            totalAmount += c.getAmountCharge();
            temp.enqueue(c);
        }
        System.out.println("Total amount of charges : RM"+totalAmount);
sc.close();num.close();
    }
} 