import java.util.*;
import java.io.*;
public class customerScreen 
{
    public static int n = 999999;
    public static Cart[] order = new Cart[n]; // 5? 1k? 1m? who cares
    public static String[] memberList = new String[n];

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);


            System.out.println("Are you a member or a guest? [member/guest]: ");
                String type = sc.nextLine();

                System.out.println("\n\nMenu: \n");
                Product.ViewProduct();
            
            System.out.println("How many types of items do you want to purchase?: ");
                int times = s.nextInt();

            for(int i = 0; i < times; i++ )
            {
                System.out.println("Enter product ID: ");
                    int productId = s.nextInt();
                System.out.println("Enter purchase quantity: ");
                    int purchaseQuantity = s.nextInt();     
                System.out.println("Enter name: ");
                    String name = sc.nextLine();

                

                //if he is a member
                if(type.equalsIgnoreCase("member"))
                {

                    //input additional member only infos
                    System.out.println("Enter your address: ");
                        String Address = sc.nextLine();
                    System.out.println("Enter your phone number: ");
                        int phone = s.nextInt();
                    System.out.println("Enter your member ID: ");
                        String memID = sc.nextLine();
                    System.out.println("Enter membership points: ");
                        int points = s.nextInt();
                    

                    order[i] = new Members(purchaseQuantity, productId, name,Address, memID, phone, points);
                    Members m = (Members) order[i];


                    //calculating total
                    double total = order[i].calcTotal();

                    //use discounts
                    Discount d = new Discount();
                    double discount = d.redeeemDiscount(points); 
                    total = d.UseDiscount(total, discount);

                    //generate order_id
                    String orderID = order[i].generate_orderID();


                    //output receipt
                    System.out.println("\n\nReceipt: \n\n" + m.Receipt(total) + "\nYour order ID:" + orderID);

                    // calc and output profit into a .txt file
                    order[i].calcProfit(total);

                    //to save their infos in a file for editting purposes
                    try
                    {
                        FileWriter wr = new FileWriter("MemberList.txt",true);
                        PrintWriter pw = new PrintWriter(wr);
                        
                        pw.print(memID+";"+name+";"+Address+";"+phone+";"+points+";" + "\n");
                        pw.close();
                    }
                    catch(Exception e)
                        {
                            System.err.println("error : "+e.getMessage());
                        }
                    }   

            
                //if he is a just a guest
                else if(type.equalsIgnoreCase("guest"))
                {
                    //input everything into guest first
                    order[i] = new Guest(purchaseQuantity, productId, name);

                    //casting
                    Guest g = (Guest) order[i]; 
                
                    //calculating total
                    double total = order[i].calcTotal();

                  
                    //generate order_id
                    String orderID = order[i].generate_orderID();
                    
                    // calc and output profit into a .txt file
                    order[i].calcProfit(total);


                    //output receipt
                    System.out.println("\n\nReceipt: \n\n" + g.Receipt(total) + "\nYour order ID:" + orderID);
                }


                
                //counts every members and puts their ID in a string
                if(order[i] instanceof Members)
                {
                    Members m = (Members) order[i];
                    
                    //increment member
                    int CM = m.countMember;
                    m.countMember++;

                    //store memberID inside array
                    memberList[CM] =m.getMemberID();

                }
            }  

        s.close();
        sc.close();
    }
}
