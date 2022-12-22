import java.io.*;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try { Scanner scanner = new Scanner(System.in);
            FileWriter wr = new FileWriter("list.txt", true);
            PrintWriter pw = new PrintWriter(wr);

            pw.println("====================");
            for(int i=0; i<1; i++) {
                System.out.print("\nName : ");
                String name = scanner.next();
                System.out.print("\nPrice : ");
                double price = scanner.nextDouble();
                Products p1 = new Products(name,price);

                pw.print(p1.name+";"+p1.price);
            }
            pw.close();
            scanner.close();
        }
        catch(Exception e)
            {
                System.err.println("error : "+e.getMessage());
            }
            
    }
}
