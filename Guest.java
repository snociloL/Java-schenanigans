public class Guest extends Cart
{
    public int countGuest = 0;
    

    public Guest(int PQ, int PI, String n)
    {
        super( PQ, PI, n);
    }


    //for guest
    public String Receipt(double total)
    {
      return("\nName:"+ super.getName() + "\nQuantity bought: " + super.purchaseQuantity + "\nTotal RM: " + total);
    }

}