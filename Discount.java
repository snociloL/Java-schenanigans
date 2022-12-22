public class Discount 
{
    private char DiscountCode;
    private double Discount;
    private double StatusBonusDiscount;

    public Discount()
    {
        DiscountCode = ' ';
        Discount = 0.0;
        StatusBonusDiscount = 0.0;
    }


    //mutator
    public void setDiscountCode(char DC){DC = DiscountCode;}
    public void setDiscount(double D){D = Discount;}
    public void setStatusBonusDiscount(double SBD){SBD = StatusBonusDiscount;}

    //accessor
    public char getDiscountCode(){return DiscountCode;}
    public double getDiscount(){return Discount;}
    public double getStatusBonusDiscount(){return StatusBonusDiscount;}



    public double redeeemDiscount(int MP)
    {
        //converting points to codes
        if(MP >= 800)
        {
            DiscountCode = 'A';
        }
        else if(MP >= 400)
        {
            DiscountCode = 'B';
        }
        else if(MP >= 200)
        {
            DiscountCode = 'C';
        }


        //converting codes to discount %
        if(DiscountCode == 'A')
        {
            Discount = 0.4;
        }
        else if(DiscountCode == 'B')
        {
            Discount = 0.3;
        }
        else if(DiscountCode == 'C')
        {
            Discount = 0.2;
        }
        else
        {
            Discount = 0.0;
        }

        return Discount;
    }

        //public double UseDiscount()
        public double UseDiscount(double t, double d)
        {
            t -= (t * d);
            return t;
        }
}