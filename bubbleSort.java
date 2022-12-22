import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        int[] num = new int[6];
        int temp = 0;

        Scanner numScanner = new Scanner(System.in);

        for(int i=0; i<num.length; i++) {
        System.out.println("Insert a num");
        num[i] = numScanner.nextInt();
        }
        System.out.println("Numbers before being sorted :- \n"+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);

        for(int i=0; i<num.length; i++) {
            for(int u=1; u<(num.length-i); u++) {
                if(num[u-1] > num[u]){
                    temp = num[u-1];
                num[u-1] = num[u];
                num[u] = temp;
                }
            }
        }
        System.out.println("Numbers after being sorted :- \n"+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);
        numScanner.close();
    }
}