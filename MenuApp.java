import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
public class MenuApp {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        Drink menu = new Drink();
        Food menuu = new Food();
        int i=0;
        Order[] ord = new Order[1];
        String response = "Y";
        int tableNum;
        int quantity;
        int orderMenu;
        double total=0;
        Scanner num = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        See mySee = new See();

        System.out.println("\nHye, welcome to SSS Restaurant");
        menuu.MenuList();menu.MenuList();
        do{ 
            System.out.println("\nPLease insert the table number :- "); 
            tableNum = num.nextInt();  
            System.out.println("\nPLease insert the item Code to order :- ");
            orderMenu = num.nextInt();
            System.out.println("\nPLease insert the quantity of the order :- ");
            quantity = num.nextInt();
            ord[i] = new Order(tableNum, quantity, orderMenu);
            ord[i].setPrice();
            System.out.println("\nDo you want to make another order? (Y/N)");
            response = sc.nextLine();
            if (response.equalsIgnoreCase("Y")){
                ord = Arrays.copyOf(ord, i+2);
                i++;
            }
                
            }while (response.equalsIgnoreCase("Y"));  

            try {
                FileWriter wr = new FileWriter("Receipt.txt", false);
                PrintWriter pw = new PrintWriter(wr);
                System.out.print("\nYour receipt has been printed, ");
                mySee.Thankyou();
                mySee.Thank();
                pw.println("=======================================");
                pw.printf("\t\t"+now.format(format)+"\n%-10s%-40s\r\n"," ","Table Num = "+ord[0].getTableNum());
                pw.println("\nTransactions :-\n");
                pw.printf("\t%-20s%-10s%-20s\r\n","Item" ,"Qty","Price");
                for(int u=0; u<ord.length; u++) {
                if(ord[u].getTableNum() == ord[0].getTableNum())
                    pw.printf("\t%-20s%-10d%-20.2f\r\n",ord[u].getName(), ord[u].getQuantity(),ord[u].setPrice()*ord[u].getQuantity());
                if(ord[u].getTableNum() != ord[0].getTableNum()) {
                    pw.println("=======================================");
                    pw.printf("\t%-20s%-10s%-20s\r\n","Item" ,"Qty","Price");
                    pw.printf("\t\t"+now.format(format)+"\n%-10s%-40s\r\n"," ","Table Num = "+ord[u].getTableNum());
                    pw.printf("\t%-20s%-10d%-20.2f\r\n",ord[u].getName(), ord[u].getQuantity(),ord[u].setPrice()*ord[u].getQuantity());
                    }
                    total+=ord[u].setPrice()*ord[u].getQuantity();
                }
                pw.printf("\n\t%-20s%-10s%-20.2f\r\n","Total","", total);
                pw.println("=======================================");
                pw.close();
            }
            catch(Exception e)
                {
                    System.err.println("error : "+e.getMessage());
                }
                sc.close();
                num.close();
    }
}