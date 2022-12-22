public class Film {
    String title;
    String producer;
    int yearProduce;
    double productionCost;
    double overall;

    public Film(String titleName, String producerName, int year, double cost) {
        title = titleName;
        producer = producerName;
        yearProduce = year;
        productionCost = cost;
    }

    public Film(Film a) {
        title = a.title;
        producer = a.producer;
        yearProduce = a.yearProduce;
        productionCost = a.productionCost;
    }

        public String getTitle() {return title;}
        public String getProduceString() {return producer;}
        public int getYearProduce() {return yearProduce;}
        public double getProductionCost() {return productionCost;}
        public double getOverall() {return overall;}

        public void setTitle(String t) {title = t;}
        public void setProducer(String p) {producer = p;}
        public void setYearProduce(int y) {yearProduce = y;}
        public void setProductionCost(double proCost) {productionCost = proCost;}
        public void setOverall(double o) {overall = o;}

    public double overallCost() {
        overall = productionCost*1.07;
        return overall;
    }
    public boolean moreExpensive(double a, double b) {
        if (a>b)
            return true;
        else
            return false;
    }
    public int filmAge() {
        int age;
        age = 2021-yearProduce;
        return age;
    }
}

