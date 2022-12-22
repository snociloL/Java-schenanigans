import java.io.*;
import java.util.StringTokenizer;

public class MAYA {
    public static void main(String[] args) {
        try {
            String code;
            int lect2021=0, lect2022=0, lect2023=0,sumDip=0, sumBT=0;

            FileReader fr = new FileReader("MayaStudents.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            FileWriter dwr = new FileWriter("DLectures.txt");
            PrintWriter outfileD = new PrintWriter(dwr);

            //Diploma lectures output
            outfileD.println("Lectures Projection for 2021 to 2023");
            outfileD.println("------------------------------------");
            outfileD.println("\nDiploma");
            outfileD.printf("\n%-30s%-20s%-20s%-20s\r\n", "Year", "2021", "2022", "2023");

            FileWriter btwr = new FileWriter("BTLectures.txt");
            PrintWriter outfileBT = new PrintWriter(btwr);
            
            //Bachelor (Technology) Lectures output
            outfileBT.println("Lectures Projection for 2021 to 2023");
            outfileBT.println("------------------------------------");
            outfileBT.println("\nBachelor (Technology)");
            outfileBT.printf("\n%-30s%-20s%-20s%-20s\r\n", "Year", "2021", "2022", "2023");

            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");

                code = data.nextToken();
                lect2021 = Integer.parseInt(data.nextToken());
                lect2022 = Integer.parseInt(data.nextToken());
                lect2023 = Integer.parseInt(data.nextToken());
                
                Enrollment enr =new Enrollment(code, lect2021, lect2022, lect2023);
                
                if(enr.getCode().equals("D")){
                    outfileD.printf("%-30s%-20d%-20d%-20d", "No. of Lectures",enr.getYr21(), enr.getYr22(),enr.getYr23());
                    sumDip = (enr.getYr21()/20)+(enr.getYr22()/20)+(enr.getYr23()/20);
                }
                else if(enr.getCode().equals("BT")){
                    outfileBT.printf("%-30s%-20d%-20d%-20d", "No. of Lectures",enr.getYr21(), enr.getYr22(),enr.getYr23());
                    sumBT = (enr.getYr21()/15)+(enr.getYr22()/15)+(enr.getYr23()/15);
                }


            }

            outfileD.printf("\n%-30s%-20d\r\n", "Total Lectures :",sumDip);
            outfileBT.printf("\n%-30s%-20d\r\n", "Total Lectures :",sumBT);
            br.close();
            outfileBT.close();
            outfileD.close();
            
        }
        catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    
    }
    
}
