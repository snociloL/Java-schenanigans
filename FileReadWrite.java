import java.io.*;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            double total=0;
            int product=0;
            FileReader fr = new FileReader("in.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            FileWriter wr = new FileWriter("out.txt");
            PrintWriter pw = new PrintWriter(wr);

            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");

                data.nextToken();
                double price = Double.parseDouble(data.nextToken());
                total=total+price;
                product++;
            }
            pw.println("Product :"+product+"Total :"+total);
            br.close();
            pw.close();
            
        }
        catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
}
