import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Product{
    static int productId;
    static int quantity;
    static String prodName;
    static String description;
    static double price;


    public Product(String listName) {
        try {
            FileReader fr = new FileReader(listName);
            BufferedReader br = new BufferedReader(fr);
            String strLine;


            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
                
                productId = Integer.parseInt(data.nextToken());
                prodName = data.nextToken();
                quantity = Integer.parseInt(data.nextToken());
                description = data.nextToken();
                price = Double.parseDouble(data.nextToken());
            }
            br.close();
            }
            catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
            }
    }
    //Modify Products
    public void setProdId(int prodId) {productId = prodId;}
    public void setProdQua(int qua) {quantity = qua;}
    public void setProdName(String nama) {prodName = nama;}
    public void setPrice(double harga) {price = harga;}
 
    protected void AddProduct() {

        try { Scanner scanner = new Scanner(System.in);
            FileWriter wr = new FileWriter("list.txt", true);
            PrintWriter pw = new PrintWriter(wr);

            {
                System.out.print("\nProduct ID : ");
                String productId = scanner.next();
                System.out.print("\nProduct Name : ");
                String prodName = scanner.next();
                System.out.print("\nQuantity : ");
                String quan = scanner.next();
                System.out.print("\nDescription : ");
                String desc = scanner.next();
                System.out.print("\nPrice : ");
                String price = scanner.next();

                pw.print("\n"+productId+";"+prodName+";"+quan+";"+desc+";"+price+";");

                System.out.println("\nThe product has been added! Please check the list once more.");
            }
            pw.close();
            scanner.close();
        }
        catch(Exception e)
            {
                System.err.println("error : "+e.getMessage());
            }
         }

    public static void ViewProduct() {
        try {
            FileReader fr = new FileReader("list.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;
            FileWriter wr = new FileWriter("ProductList.txt");
            PrintWriter pw = new PrintWriter(wr);
    
            pw.printf("%-20s%-20s%-20s%-30s%-20s\r\n", "Product ID", "Product Name", "Quantity", "Description", "Price");
            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
            
                productId = Integer.parseInt(data.nextToken());
                prodName = data.nextToken();
                quantity = Integer.parseInt(data.nextToken());
                description = data.nextToken();
                price = Double.parseDouble(data.nextToken());
                String formattedPrice =String.format("%.2f",price);
                pw.printf("%-20d%-20s%-20d%-30s%-20s\r\n", productId, prodName, quantity, description, formattedPrice);

                
            }
            pw.close();
            br.close();
            }
            catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
            }

            System.out.println("\nProducts List has been created. Please open the file to see the contents.");
    }
}