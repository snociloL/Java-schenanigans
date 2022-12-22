import java.io.*;
import java.util.StringTokenizer;
public class enrollApp {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("enrollment.txt");
            BufferedReader br = new BufferedReader(fr);

            String studID, studName, course, program, strLine;
            int i=0, ctu551 = 0;
            Enroll[] enroll = new Enroll[22];

            FileWriter FW = new FileWriter("CS240_CTU553.txt");
            PrintWriter pw = new PrintWriter(FW);
            
            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
                
                studID = data.nextToken();
                studName = data.nextToken();
                program = data.nextToken();
                course = data.nextToken();
                
                enroll[i] = new Enroll(studID, studName, program, course);
                if(enroll[i].courseCheck()==true) {
                    ctu551++;
                }
                if(enroll[i].program.equalsIgnoreCase(" CS240") && enroll[i].course.equalsIgnoreCase(" CTU553"))
                    pw.println(enroll[i].studID+" "+enroll[i].studName);
                i++;
            }
            br.close();
            pw.close();
            System.out.println("Total of CTU551 students = "+ctu551);
        }
        catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
}
