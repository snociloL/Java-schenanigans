import java.io.*;
import java.util.StringTokenizer;
public class Q1 {
    public static void main(String[] args) {
        try {
            int total17=0 , total18=0;
            FileReader fr = new FileReader("hfmdcases.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;

            FileWriter wr = new FileWriter("report.txt");
            PrintWriter pw = new PrintWriter(wr);

            pw.printf("\n\t%-20s%-20s%-20s\r\n","State","2017", "2018");
            while ((str = br.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(str,";");

                String state = token.nextToken();
                int year17 = Integer.parseInt(token.nextToken());
                int year18 = Integer.parseInt(token.nextToken());
                pw.printf("\t%-20s%-20d%-20d\r\n", state ,year17, year18);
                total17 += year17;
                total18 += year18;
            }
            pw.println("\nTotal cases for 2017 is "+total17);
            pw.println("Total cases for 2018 is "+total18);
            br.close();
            pw.close();
            
        }
        catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
}
