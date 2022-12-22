public class BajuKurung extends TailOrder {
    private int type;
    private boolean embroidery;

    public BajuKurung(String c, String o, double d, boolean de, int t, boolean e) {
        super(c,o,d,de);
        type=t;
        embroidery=e;
    }

    public double AddEmbroidery() {
        if(embroidery==true)
            return 25.0;
        else
            return 0.0;
    }

    public double payment() {
        double price=0;
        switch(type) {
            case 1:
            {
                price=30.00;
                break;
            }
            case 2:
            {
                price=60.00;
                break;
            }
            case 3:
            {
                price=55.00;
                break;
            }
            case 4:
            {
                price=110.0;
                 break;
            }
            default: System.out.println("\nERROR : Unknown Input");
        }
        return price+AddEmbroidery();
    }
}