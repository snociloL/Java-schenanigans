public class Members extends Guest
{
    private String CustomerAddress;
    private String memberId;
    private int phoneNum;
    private String MembershipStatus;
    private int MembershipPoints;


    public int countMember = 0;
    
    public Members(int PQ, int PI, String n, String CA, String MI, int PN, int MP)
    {
        super(PQ, PI, n);
        CustomerAddress = CA;
        memberId = MI;
        phoneNum = PN;
        MembershipPoints = MP;
    }
   
    //mutator
    public void setCustomerAddress(String CA){CA = CustomerAddress;}
    public void setCustomerId(String MI){MI = memberId;}
    public void setPhoneNum(int p){p = phoneNum;}
    public void setMembershipStatus(String MS){MS = MembershipStatus;}
    public void setMembershipPoints(int MP){MP = MembershipPoints;}


    //accessor
    public String getCustomerAddress(){return CustomerAddress;}
    public String getMemberID(){return memberId;}
    public int getPhoneNumber(){return phoneNum;}
    public String getMembershipStatus(){return MembershipStatus;}
    public int getMembershipPoints(){return MembershipPoints;}


   
    //for member
    public String Receipt(double total)
    {
      return("Name: " + super.getName() + "\nAddress: " + CustomerAddress + "\nPhone number: " + phoneNum  + "\nTotal RM: " + total);
    }

   
    public void editInfo(String n, String ad, int p)
    {
        super.name = n;
        CustomerAddress = ad;
        phoneNum = p;
    }

} 