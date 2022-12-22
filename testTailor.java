import java.util.*;

class TailorOrder
{
    private String custNo;
    private String custName;
    private String date;
    private char custType;

    public TailorOrder()
    {
        custNo = "null";
        custName = "null";
        date = "00/00/0000";
        custType = 'n';
    }
    public TailorOrder( String cNo, String cName, String d, char cType)
    {
        custNo = cNo;
        custName = cName;
        date = d;
        custType = cType;
    }

    //mutator
    public void setCustNo(String cNo){custNo = cNo;}
    public void setCustName(String cName){custName = cName;}
    public void setDate(String d){date = d;}
    public void setCustType(char t){ custType = t;}

    //accesor
    public String getCustNo(){return custNo;}
    public String getCustName(){return custName;}
    public String getDate(){return date;}
    public char getCustType(){return custType;}
}

 class Uniform extends TailorOrder
{
    private String uniformType;
    private boolean cotton;
    double charges = 0;


    public Uniform()
    {
        super();
        uniformType = null;
        cotton = false;
    }
    public Uniform(String cNo, String cName, String d, char cType, String uT, boolean c)
    {
        super(cNo,cName,d,cType);
        uniformType = uT;
        cotton = c;
    }

    //mutator
    public void setUniformType(String UT){uniformType = UT;}
    public void setCotton(boolean c){cotton = c;}
    //accessor
    public String getUniformType(){return uniformType;}
    public boolean getCotton(){return cotton;}



    public double calcCharges(String u, boolean c)
    {
        if(u.equals("Office") && c)
        {
            charges = 100;
        }
        if(u.equals("Office") && c == false)
        {
            charges = 60;
        }
        if(u.equals("School") && c)
        {
            charges = 80;
        }
        if(u.equals("School") && c == false)
        {
            charges = 40;
        }

        return charges;
    }
}


public class testTailor
{
    
    public static void main(String[] args) 
    {
        Uniform[] uniform = new Uniform[5];
        Scanner sc  = new Scanner(System.in);
        Scanner s  = new Scanner(System.in);

        for(int i = 0; i< 5; i++)
        {
            uniform[i] = new Uniform();

            System.out.println("Enter customer's ID number : ");
                uniform[i].setCustNo(sc.nextLine());
            System.out.println("Enter customer's name : ");
               uniform[i].setCustName(sc.nextLine());
            System.out.println("Enter Order date: ");
                uniform[i].setDate(sc.nextLine());
            System.out.println("Enter customer type: ");
                uniform[i].setCustType(s.next().charAt(0));

            System.out.println("Enter uniform type: ");
                uniform[i].setUniformType(sc.nextLine());
            System.out.println("Cotton as uniform material : ");
                uniform[i].setCotton(s.nextBoolean());

                System.out.println("\nCharges in RM: " + uniform[i].calcCharges(uniform[i].getUniformType(), uniform[i].getCotton()) + "\n");
        }      
        sc.close();
        s.close();
    }
}