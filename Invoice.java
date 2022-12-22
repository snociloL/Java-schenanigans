class Invoice 
{
    int invoiceNum;
    int date;
    int participants;
    String customerName;
    char packCode;
    double price, total, discount;

    public Invoice (int i, int d, String c, char p, double harga, int parti)
    {
        invoiceNum =  i;
        date = d;
        customerName = c;
        packCode = p;
        price = harga;
        participants = parti;
    }

    public char getPackCode(){return packCode;}
    public int getInvoiceNum(){return invoiceNum;}
    public int getDate(){return date;}
    public String getCustomerName(){return customerName;}
    public double getPrice(){return price;}
    public double getTotal(){return total;}
    public int getParticipants(){return participants;}


    public double grandTotal() 
    {
        if (participants<14)
            discount = 1.0;
        else if(participants>=14 && participants>=40)
            discount = 0.9;
        else if(participants>40)
            discount = 0.85;

        total= price*participants*discount;
        return total;
    }

    public String toString() {
        return"Invoice Statement";
    }
}