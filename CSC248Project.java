import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

class Order2 {
    LocalDateTime now = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    int table;
    String name;
    int quantity;
    int orderNo;
    double price;
    int orderID;

    public Order2 (int t, int q, int o){
        table = t;
        quantity = q;
        orderNo = o;
    }

    public int getTable() {return table;}
    public int getQuantity() {return quantity;}
    public int getOrderNo() {return orderNo;}
    public double getPrice() {setPrice(orderNo); return price;}
    public String getName() {setName(orderNo); return name;}


    public double setPrice(int o){
   
        switch(o) {
        case 1:{price = 12.9;break;}
        case 2:{price = 27.5;break;}
        case 3:{price = 30.0;break;}
        case 4:{price = 7.8;break;}
        case 5:{price = 6.0;break;}
        case 6:{price = 4.5;break;}
        case 7:{price = 5.0;break;}
        case 8:{price = 25.0;break;}
        case 9:{price = 26.5;break;}
        case 10:{price = 1.8;break;}
        case 11:{price = 2.9;break;}
        case 12:{price = 7.5;break;}
        case 13:{price = 3.0;break;}
        case 14:{price = 7.8;break;}
        case 15:{price = 6.0;break;}
        case 16:{price = 4.5;break;}
        case 17:{price = 5.0;break;}
        case 18:{price = 5.0;break;}
        case 19:{price = 6.5;break;}
        case 20:{price = 1.8;break;}       
            default: System.out.println("\nERROR : Unknown Input");}
            return price;
    }
    public String setName(int o){
   
        switch(o) {
        case 1:{name="Tom Yunk Campur";}break;
        case 2:{name="Siakap 2+1 Rasa";break;}
        case 3:{name="Ikan Merapu Stim Aq";break;}
        case 4:{name="Mee Goreng Ayum";break;}
        case 5:{name="Udang Goreng Tepunk";break;}
        case 6:{name="Telur Goreng";break;}
        case 7:{name="Sayur Kang-Keng-Kong";break;}
        case 8:{name="Lamb Chop";break;}
        case 9:{name="Nasi Goreng LGBT";break;}
        case 10:{name="Nasi Putih";break;}
        case 11:{name="Aiyar Ping";break;}
        case 12:{name="Chocolate Milk";break;}
        case 13:{name="Fresh Milk";break;}
        case 14:{name="Iced Cincau";break;}
        case 15:{name="Carrot Juice";break;}
        case 16:{name="Iced Thin Lime";break;}
        case 17:{name="Soy Bean Milk";break;}
        case 18:{name="Pen PineApple Juice";break;}
        case 19:{name="WaterMELON Juice";break;}
        case 20:{name="Sugar cane Juice";break;}       
            default: System.out.println("\nERROR : Unknown Input");}
            return name;
    }

    public void record() {
        try {
            FileWriter wr = new FileWriter("record.txt", true);
            PrintWriter pw = new PrintWriter(wr);
            pw.println(now.format(format)+";"+orderNo+";"+quantity+";"+price*quantity+";"+table);
            pw.close();
        }
        catch(Exception e)
            {
                System.err.println("error : "+e.getMessage());
            }
    }

        public void print() {
        System.out.printf("\t%-20s%-10d%-20.2f%-40s\r\n",getName(), getQuantity(), getPrice()*getQuantity(), getTable());
    }   
        public void check() {
        System.out.printf("\t%-25s%-10d%-20.2f\r\n",getName(), getQuantity(), getPrice()*getQuantity());
    }

}

public class CSC248Project {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Queue orderQ = new Queue();
        LinkedList <Order2> recordLL = new LinkedList<>();
        ArrayList <String> nameAL = new ArrayList<>();
        String response = "yes";
        String input = "";
        int table;
        int quantity;
        int orderNo;
        int quantityCount = 0;
        double totalCount = 0.0;
        double total=0.0;
        double totalProfit=0.0;

do {
            System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~ Menu Page ~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n\t Command Codes : \n\t(1) Order - To set a customer order. \n\t(2) Profit - To check total earnings. \n\t(3) Top - To see customer's favorite order. \n\t(4) Search - To find certain Food/Drink earnings. \n\t(Out) To exit.");
            System.out.println("\n\tInput = ");
            input = sc.nextLine();
    if (input.equalsIgnoreCase("1")){
        System.out.println("\nCustomer order(s):");
        System.out.println("================================================================");
        try {
            FileReader fr = new FileReader("foodList.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
                int itemID = Integer.parseInt(data.nextToken());
                String item = data.nextToken();
                double price = Double.parseDouble(data.nextToken());
                System.out.printf("%-10d%-40s%-20.2f\r\n",itemID,item,price);     
            }
            br.close();
        }
        catch (Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
        do {
        System.out.println("\n\tInsert Table Number :");
        table= sc.nextInt();
        System.out.println("\tInsert Order No :");
        orderNo= sc.nextInt();
        System.out.println("\tInsert Quantity :");
        quantity= num.nextInt();
        Order2 temp = new Order2(table, quantity, orderNo);
        System.out.println("\n\tDo you want to add another order? (Yes/No)");
        sc.nextLine();
        response = sc.nextLine();
        orderQ.enqueue(temp);        
    }while(!response.equalsIgnoreCase("no"));

    System.out.println("\n\tConfirm order? (Yes/No)");
    String confirm = sc.nextLine();
    if(confirm.equalsIgnoreCase("Yes")){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~ Here are the list of the order(s) ~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t"+now.format(format));
        System.out.println("\nTransactions :-\n");
        System.out.printf("\t%-20s%-10s%-20s%-40s\r\n","Item" ,"Qty","RM","Table Num");
            total = 0.0;
            while(!orderQ.isEmpty()) {
            Order2 temp = (Order2) orderQ.dequeue();
            temp.print();
            temp.record();
            total += temp.getPrice()*temp.getQuantity();
            
            }
    
        System.out.printf("\n\t%-20s%-10s%-20.2f\r\n","Total","", total);
        System.out.println("\n\tAnything else to do? (Yes/Out)");
        input = sc.nextLine();
    }
    else if(confirm.equalsIgnoreCase("No"))
        System.out.println("\n\tThe Order has been cancelled and discarded.");
    }

    try {
        FileReader fr = new FileReader("record.txt");
        BufferedReader br = new BufferedReader(fr);
        String strLine;

        while ((strLine = br.readLine()) != null) {
            StringTokenizer data = new StringTokenizer(strLine,";");

            data.nextToken();
            orderNo = Integer.parseInt(data.nextToken());
            quantity = Integer.parseInt(data.nextToken());
            data.nextToken();
            table = Integer.parseInt(data.nextToken());
            Order2 temp = new Order2(table, quantity, orderNo);
            recordLL.add(temp);
            nameAL.add(temp.getName());
        }
        br.close();
    }
    catch(Exception e) {
        System.err.println("Error : "+e.getMessage());
    }

    if(input.equalsIgnoreCase("2")) {
        totalProfit = 0.0;
        while(!recordLL.isEmpty()){
            Order2 temp = (Order2) recordLL.remove();
            totalProfit += temp.getQuantity()*temp.getPrice();
        }
        System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~ Current Profit ~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n\tTotal profits : RM"+totalProfit);

    } else if(input.equalsIgnoreCase("3")){
            for(int i=0; i<recordLL.size(); i++) {
            for(int u=1; u<(recordLL.size()-i); u++) {
                if(/*recordLL.get(u-1).getPrice()*/recordLL.get(u-1).getQuantity() < (/*recordLL.get(u).getPrice()*/recordLL.get(u).getQuantity())){
                    Order2 temp = recordLL.get(u-1);
                recordLL.set(u-1, recordLL.get(u));
                recordLL.set(u, temp);
                }
                if(recordLL.get(u-1).getName().equals(recordLL.get(u).getName())) {
                    recordLL.get(u-1).quantity += recordLL.get(u).getQuantity();
                    recordLL.remove(u);
                }
                for(int o=2; o<recordLL.size()-u;o++){
                    if(recordLL.get(o-1).getName().equals(recordLL.get(o).getName())) {
                        recordLL.get(o-1).quantity += recordLL.get(o).getQuantity();
                        recordLL.remove(o);
                    }
                }       
            }

        }
        System.out.print("\n~~~~~~~~~~~~~~~~~~~~~ Top favorite orders ~~~~~~~~~~~~~~~~~~~~ ");
        System.out.printf("\n\t%-25s%-10s%-20s\r\n","Item" ,"Qty","RM");
        for(int i=0; i<recordLL.size(); i++){
                recordLL.get(i).check();
            }
    } else if(input.equalsIgnoreCase("4")) {
        System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~ Search Page ~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n\tEnter FOOD/DRINK NAME to be searched: ");
            String nameSearch = sc.nextLine();
            //int index = Collections.binarySearch(nameAL, nameSearch);
            for(int i=0;i<nameAL.size();i++) {
                if(nameAL.get(i).equalsIgnoreCase(nameSearch)){
                    quantityCount += recordLL.get(i).getQuantity();
                    totalCount = recordLL.get(i).getPrice();
                }
            }
            System.out.printf("\n\t%-20s%-10s%-20s\r\n","Item" ,"Qty","RM");
            System.out.printf("\n\n\t%-20s%-10d%-20.2f\r\n",nameSearch, quantityCount, totalCount*quantityCount);
    }
    }while(!input.equalsIgnoreCase("out"));
    System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~ Thank you for the hard work ~~~~~~~~~~~~~~~~~~~~");
    
    sc.close();
    num.close();
    }
}
