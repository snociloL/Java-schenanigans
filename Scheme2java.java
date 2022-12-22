public class Scheme2java {
    public static int Compare(int c, int d) {
        int calc=0;
        if(c < d)
            calc = d/c;
        else if(c > d)
            calc = c/d;
        else if(c==d)
            calc = c*d;
        
        return calc;
    }

    public static void main(String[] args) {
        System.out.println("\nInput for the operation is 462 & 66.");
        System.out.println("\nResults from the comparison ="+ Compare(462, 66) );
    }
}

