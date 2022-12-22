//import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
public class test {

    public static void main(String[] args) {
    int productId;
    int quantity;
    String prodName;
    String description;
    double price;
    
    try {
        FileReader fr = new FileReader("list.txt");
        BufferedReader br = new BufferedReader(fr);
        String strLine;
        FileWriter pass = new FileWriter("ProductList.txt");
        PrintWriter pw = new PrintWriter(pass);

        pw.printf("%-20s%-20s%-20s%-20s%-20s\r\n", "Product ID", "Product Name", "Quantity", "Description", "Price");
        while ((strLine = br.readLine()) != null) {
            StringTokenizer data = new StringTokenizer(strLine,";");
            
            productId = Integer.parseInt(data.nextToken());
            prodName = data.nextToken();
            quantity = Integer.parseInt(data.nextToken());
            description = data.nextToken();
            price = Double.parseDouble(data.nextToken());
            pw.printf("%-20d%-20s%-20d%-20s%-20f\r\n", productId, prodName, quantity, description, price);
        }
        pw.close();
        br.close();
        }
        catch(Exception e) {
        System.err.println("Error : "+e.getMessage());
        }
    }
}