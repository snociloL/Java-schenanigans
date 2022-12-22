/*import java.io.*;

public class FileInput {
            
    public static void main(String []arg) throws IOException
        {
            try
            {
            FileReader reader = new FileReader("data.txt");
            BufferedReader in = new BufferedReader(reader);
            String name = null; float score, total = 0;
            while ((name = in.readLine())!=null){
                score = Float.parseFloat(in.readLine());
                total += score;
                System.out.println("Name:"+ name + "Score:" + score);
            }
                System.out.println("Total score : " + total);
                in.close();
            }
            catch(FileNotFoundException fnf) {
                System.out.println(fnf.getMessage());
                }
               catch(EOFException eof) {
                System.out.println(eof.getMessage());
                }
                catch(IOException io) {
                System.out.println(io.getMessage());
                }
            }
}*/

import java.io.*;
import java.util.*;

    public class FileInput {
    
        public static void main(String []arg) throws IOException {
            try {
                File reader = new File("data.txt");
                Scanner in = new Scanner(reader);
                String name = null; float score, total = 0;

                while (in.hasNextLine()) {
                    name = in.next();
                    score = in.nextFloat();
                    total += score;
                    System.out.println("Name: " + name + " Score: " + score);
                }
                System.out.println("\nTotal score : " + total);
                in.close();
            }
            catch(IOException io) {
                System.out.println(io.getMessage());
                }
        }
}

