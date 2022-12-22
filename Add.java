public class Add {
    private double average,total;
    double [] no = new double[2];
    char[] label;
    
    public Add() {
        total=0;
        label = new char[]{'A','B'};
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double t) {
        total = t;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double a) {
        average = a;
    }
}
