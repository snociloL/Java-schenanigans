import java.io.*;
import java.util.StringTokenizer;
public class TestPhotocopy {
    public static void main(String[] args) {  
        try
            {
            FileReader fr = new FileReader("photocopyInfo.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter wr = new FileWriter("quizRequest.txt");
            PrintWriter pw = new PrintWriter(wr);
            String strLine;
            Photocopy[]copiesArr = new Photocopy[200];

            while ((strLine = br.readLine()) != null) {
            StringTokenizer data = new StringTokenizer(strLine,",");
            String lectName = data.nextToken();
            String staffID = data.nextToken();
            String facCode = data.nextToken();
            String assType = data.nextToken();
            int masterNum = Integer.parseInt(data.nextToken());
            int copiesNum = Integer.parseInt(data.nextToken());
            int i=0;
            {
                copiesArr[i]= new Photocopy();
                copiesArr[i].setPhotocopy(lectName, staffID, facCode, assType, masterNum, copiesNum);

                if(copiesArr[i].facCode.equals("FHTM"))
                    System.out.println(copiesArr[i].toString());
                if (copiesArr[i].assType.equals("quiz"))
                    pw.print("\nDetail of request for Quiz \nDetail : \nStaff ID : "+copiesArr[i].staffID+" Number of pages for master copy : "
                    +copiesArr[i].masterNum+" Number of copies required : "+copiesArr[i].copiesNum+"Total : "+copiesArr[i].masterNum*copiesArr[i].copiesNum);
                }i++;
            }
            br.close();
            pw.close();
        }
            catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
            }
        }
}

