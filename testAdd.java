import java.util.Scanner;

public class testAdd {
    public static void main(String[] args) {
        double t=0,a;
        Add kira = new Add();
    
    Scanner keyboard = new Scanner(System.in);
        
        for(int i=0;i<kira.no.length; i++) {
            System.out.println("Number "+kira.label[i] + " : ");
            kira.no[i]= keyboard.nextInt();
            t += kira.no[i];
            kira.setTotal(t);
        }

        a=kira.getTotal()/kira.no.length;
        kira.setAverage(a);
        System.out.println("Total : "+kira.getTotal());
        System.out.println("Average : "+kira.getAverage());
        
        keyboard.close();
    }
    
}
