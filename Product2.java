import java.util.Scanner;

public class Product2 {
    String type, color;
    char size;
    double price;

    public Product2() {
        type = null;
        color = null;
        size = 'n';
        price = 0;
    }

    public void setData(String t, String c, char s, double p) {
        type = t;
        color = c;
        size = s;
        price = p;
    }
    public String getType() { return type;}
    public String getColor() {return color;}
    public double getPrice() {return price;}
    public char getSize() {return size;}

    public String toString() {
        return "\nType : "+type+"\nColor : "+color+"\nSize : "+size+"\nPrice : "+price;
    }
    public static void main(String[] args) {
        Queue prodQueue = new Queue();
        Queue shortSLeeve = new Queue();
        Queue shortPants = new Queue();
        Queue booties = new Queue();
        Queue tempQ = new Queue();
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String type, color;
        double price;
        char size;
        double totalSS = 0, totalSP = 0, totalB=0;

        for(int i=0; i<10; i++) {
            System.out.println("\nInsert the type of clothes : ");
            type = sc.nextLine();
            System.out.println("The color : ");
            color = sc.nextLine();
            System.out.println("Size : ");
            size = sc.next().charAt(0);
            System.out.println("Price : ");
            price = num.nextDouble();

            Product2 pq = new Product2();
            pq.setData(type, color, size, price);
            prodQueue.enqueue(pq);
        }

        while(!prodQueue.isEmpty()) {
            Product2 temp = (Product2) prodQueue.dequeue();
            if(temp.getType().equalsIgnoreCase("Short Sleeves")){
                shortSLeeve.enqueue(temp);
                totalSS+=temp.getPrice();
            }
            else if(temp.getType().equalsIgnoreCase("Short Pants"))
                {shortPants.enqueue(temp);
                totalSP+=temp.getPrice();
            }
            else if(temp.getType().equalsIgnoreCase("Booties"))
                {booties.enqueue(temp);
                totalB+=temp.getPrice();
            }
            tempQ.enqueue(temp); 
        }

            while(!prodQueue.isEmpty()) {
                Product2 temp = (Product2) tempQ.dequeue();
                prodQueue.enqueue(temp);
            }

            System.out.println("\nTotal of Short sleeves : RM"+totalSS+"\nTotal of Short pants : RM"+totalSP+"\nTotal of Booties : RM"+totalB);

            //d)	Display all the types and prices of the products of size 'M' and color "blue".
            while(!shortSLeeve.isEmpty()){
                Product2 temp = (Product2) shortSLeeve.dequeue();
                if((temp.getSize()=='M') && (temp.getColor().equalsIgnoreCase("Blue")))
                temp.toString();
            }
            while(!shortPants.isEmpty()){
                Product2 temp = (Product2) shortPants.dequeue();
                if((temp.getSize()=='M') && (temp.getColor().equalsIgnoreCase("Blue")))
                temp.toString();
            }
            while(!booties.isEmpty()){
                Product2 temp = (Product2) booties.dequeue();
                if((temp.getSize()=='M') && (temp.getColor().equalsIgnoreCase("Blue")))
                temp.toString();
            }

        sc.close();
        num.close();
    }
}

