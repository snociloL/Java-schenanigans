import java.io.*;
import java.util.StringTokenizer;

public class Menu {
    String type;

    public Menu() {
        type=null;
    }

    public void MenuList() {
        System.out.printf("%-10s%-40s%-20s\r\n","No."," Item ","Price");

    }
}

class Food extends Menu {
    double price;

    public Food() {
        super();
        price=0;
    }

    public void MenuList() {
        super.MenuList();
        try {
            FileReader fr = new FileReader("foodList.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
                int itemID = Integer.parseInt(data.nextToken());
                String item = data.nextToken();
                double price = Double.parseDouble(data.nextToken());
                System.out.printf("%-10d%-40s%-20.2f\r\n",itemID,item,price);
            }
            br.close();
        }
        catch (Exception e) {
            System.err.println("Error : "+e.getMessage());
        }

    }
    
}


class Drink extends Menu {
    double price;

    public Drink() {
        super();
        price=0;
    }

    public void MenuList() {
        System.out.println("================================================================");
        try {
            FileReader fr = new FileReader("drinkList.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            while ((strLine = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(strLine,";");
                int itemID = Integer.parseInt(data.nextToken());
                String item = data.nextToken();
                double price = Double.parseDouble(data.nextToken());
                System.out.printf("%-10d%-40s%-20.2f\r\n",itemID,item,price);     
            }
            br.close();
        }
        catch (Exception e) {
            System.err.println("Error : "+e.getMessage());
        }

    }
    
}