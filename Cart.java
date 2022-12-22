import java.io.*;
import java.util.StringTokenizer;
public abstract class Cart
{ 
    protected int purchaseQuantity;
    private int productId;
    protected String name;
    protected double totalProfit;
    protected static double profit;

    public Cart(int purchaseQua, int prodId, String n)
    {
        purchaseQuantity = purchaseQua;
        productId = prodId;
        name = n;
    }

    public Cart()
    {
        purchaseQuantity = 0;
        productId = 0;
        name = null; 
    }

    //mutator
    public void setpurchaseQuantity (int purchaseQua) { purchaseQuantity = purchaseQua;}
    public void setproductId (int proId) { productId = proId;}
    public void setString ( String n){n = name;}
    public void setTotalProfit( double tp){tp = totalProfit;}

    //accessor
    public int getpurchaseQuantity () { return purchaseQuantity;}
    public int getproductId () { return productId;}
    public String getName () { return name;}
    public double getTotalProfit() {return totalProfit;}



    public abstract String Receipt(double total);
    

    public double calcTotal()
    {
        double total  = 0;

        for(int i = 0; i< purchaseQuantity; i++)
        {
            if(productId == 1)
            {
                total += 70.00;
            }
            if(productId == 2)
            {
                total += 1.50;
            }
            if(productId == 3)
            {
                total += 0.80;
            }
            if(productId == 4)
            {
                total += 1.80;
            }
            if(productId == 5)
            {
                total += 49.90;
            }
        }


        return total;
    }

    public String generate_orderID()
    {
        double order_Id = Math.random();
        String formattedID =String.format("%.2f",order_Id);
        
        return formattedID;
    }


    public void calcProfit(double t)
    {   
        //print profit into txt file
        try
        { 
            FileWriter wr = new FileWriter("totalProfit.txt",true);
            PrintWriter pw = new PrintWriter(wr);

            pw.print("\n"+t + ";");
            pw.close();
        }

        catch (Exception e)
        {
            System.err.println("Error : " + e.getMessage());
        }
    
    }

    public static void printProfit()
        {
            try
        {

            FileReader fr = new FileReader("totalProfit.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(strLine,";");
                profit += Double.parseDouble(st.nextToken());
            }
            br.close();
        }

        catch (Exception e)
        {
            System.err.println("Error : " + e.getMessage());
        }
            String formattedPrice =String.format("%.2f",profit);
            System.out.println("\nYour total profit currently is RM: " + formattedPrice);
        }        
    }