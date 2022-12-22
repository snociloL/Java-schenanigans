public class BajuMelayu extends TailOrder{
    private int type;
    public BajuMelayu(String c, String o, double d, boolean de, int t) {
        super(c,o,d,de);
        type=t;
    }

    public double payment() {
        double price=0;
        switch(type) {
            case 1:
            {
                price=75.00;
                break;
            }
            case 2:
            {
                price=95.00;
                break;
            }
            default: System.out.println("\nERROR : Unknown Input");
        }
        return price;
    }
}
