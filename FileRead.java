import java.io.*;

class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("in.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
            br.close();
        }
        catch (Exception e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
}