import java.util.StringTokenizer;
import java.io.*;
public class Nursery {
    public static void main(String[] args) {
        try {
            String name, category, itemCode, size;
            double price=0.00,tHS =0.00, tHM=0.00,tHB=0.00,tLS=0.00, tLM=0.00, tLB=0.00;

            FileReader fr = new FileReader("flower.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            FileWriter wr = new FileWriter("Sales.txt");
            PrintWriter pw = new PrintWriter(wr);
            pw.print("SALES : ");
            pw.println("\n");
            pw.printf("%-20s%-20s%-20s%-20s%-20s\r\n", "NAME", "CATEGORY", "ITEM CODE", "SIZE", "PRICE");

            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");

                name = data.nextToken();
                category = data.nextToken();
                itemCode = data.nextToken();
                size = data.nextToken();
                price = Double.parseDouble(data.nextToken());
                String formattedPrice =String.format("%.2f",price);
    
                pw.printf("%-20s%-20s%-20s%-20s%-20s\r\n",name,category,itemCode,size,formattedPrice);

                if(category.equalsIgnoreCase("hiasan")&&size.equalsIgnoreCase("small"))
                    tHS+=price;
                else if(category.equalsIgnoreCase("hiasan")&&size.equalsIgnoreCase("medium"))
                    tHM+=price;
                else if(category.equalsIgnoreCase("hiasan")&&size.equalsIgnoreCase("big"))
                    tHB+=price;
                else if(category.equalsIgnoreCase("landskap")&&size.equalsIgnoreCase("small"))
                    tLS+=price;
                else if(category.equalsIgnoreCase("landskap")&&size.equalsIgnoreCase("medium"))
                    tLM+=price;
                else if(category.equalsIgnoreCase("landskap")&&size.equalsIgnoreCase("big"))
                    tLB+=price;
            }

            pw.println("\nTotal Hiasan/Small : "+tHS);
            pw.println("Total Hiasan/Medium : "+tHM);
            pw.println("Total Hiasan/Big : "+tHB);
            pw.println("Total Landskap/Small : "+tLS);
            pw.println("Total Landskap/Medium : "+tLM);
            pw.println("Total Landskap/Big : "+tLB);
            br.close();
            pw.close();
            
        }
        catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    
    }
}
