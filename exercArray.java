import java.util.Scanner;

public class exercArray {
    public static void main(String[] args) {
        double [] no = new double[2];
        char [] label = {'A','B'};
        double average, total=0;

        Scanner keyboard = new Scanner(System.in);

        for(int i=0;i<no.length; i++) {
            System.out.println("Number "+ label[i] + " : ");
            no[i]=keyboard.nextDouble();

            total += no[i];

        }
        average=total/no.length;

        System.out.println("Total : "+total);
        System.out.println("Average : "+ average);
        keyboard.close();
    }
}
