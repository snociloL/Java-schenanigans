import java.util.Scanner;

public class Recursion {
    public static int Rec(int n){
        if(n==1)
            return 1;
        return (n*n) + Rec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.err.println("Insert an Integer = ");
        n = sc.nextInt();
        System.err.println(Rec(n));
        sc.close();
    }
}
