import java.io.*;
import java.util.StringTokenizer;

public class GradeCheck {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("CSC186.txt");
            BufferedReader br = new BufferedReader(fr);

            String strLine, name, id;
            double quiz, project, lab, test1, test2, finals, totalMark;
            int totalPass = 0;
            int totalFail = 0;

            FileWriter pass = new FileWriter("CSC186Pass.txt");
            PrintWriter pwPass = new PrintWriter(pass);

            FileWriter fail = new FileWriter("CSC186Fail.txt");
            PrintWriter pwFail = new PrintWriter(fail);

            pwPass.println("UITM ID\t\t\tName\t\t\t\t\tQuiz\t\t\tProject\t\t\tLab\t\t\t Test 1\t\t\t Test 2\t\t\tFinal Exam\t\t\tTotal Mark");
            pwFail.println("UITM ID\t\t\tName\t\t\t\t\tQuiz\t\t\tProject\t\t\tLab\t\t\t Test 1\t\t\t Test 2\t\t\tFinal Exam\t\t\tTotal Mark");
            
            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
                
                id = data.nextToken();
                name = data.nextToken();
                quiz = Double.parseDouble(data.nextToken());
                project = Double.parseDouble(data.nextToken());
                lab = Double.parseDouble(data.nextToken());
                test1 = Double.parseDouble(data.nextToken());
                test2 = Double.parseDouble(data.nextToken());
                finals = Double.parseDouble(data.nextToken());
                totalMark = quiz + project + lab + test1 + test2 + finals;

                if (totalMark >= 50) {
                    pwPass.println(id+"\t\t"+name+"\t\t\t"+quiz+"\t\t\t\t"+project+"\t\t\t\t"+lab+"\t\t\t\t"+test1+"\t\t\t\t"+test2+"\t\t\t\t"+finals+"\t\t\t\t"+totalMark);
                    totalPass++;
                }
                else {
                    pwFail.println(id+"\t\t"+name+"\t\t\t"+quiz+"\t\t\t\t"+project+"\t\t\t\t"+lab+"\t\t\t\t"+test1+"\t\t\t\t"+test2+"\t\t\t\t"+finals+"\t\t\t\t"+totalMark);
                    totalFail++;
                }
            }
            pwPass.println("\n****Number of record : "+totalPass);
            pwFail.println("\n****Number of record : "+totalFail);
            br.close();
            pwPass.close();
            pwFail.close();

        }
        catch(Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
}