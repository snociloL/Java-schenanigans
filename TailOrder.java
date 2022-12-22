abstract class TailOrder {
        private String custName;
        private String orderNum;
        private double deposit;
        private boolean delivery;

        public TailOrder(String c, String o, double d, boolean de) {
            custName=c;
            orderNum=o;
            deposit=d;
            delivery=de;
        }

        public abstract double payment();

        public String getName() {return custName;}
        public String getOrderNum() {return orderNum;}
        public double getDeposit() {return deposit;} 
        public boolean getDelivery() {return delivery;}
    }
