import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Order for Baju Kurung or Baju Melayu ? (BK/BM) :-");
        String baju = sc.nextLine();
        int embTotal=0;
        if(baju.equalsIgnoreCase("BK")) {
            System.out.println("Insert the amount of Baju Kurung you want to order :- ");
            int quantity = num.nextInt();
            BajuKurung[] bk = new BajuKurung[quantity];
            for(int i=0; i<quantity;i++) {
                System.out.println("Insert your name:- ");
                    String name = sc.nextLine();
                System.out.println("Insert order number:- ");
                    String orderNum = sc.nextLine();
                System.out.println("Insert type of Baju Kurung:- ");
                    int type = num.nextInt();
                System.out.println("Insert the amount of deposit :- ");
                    double deposit = num.nextDouble();
                System.out.println("Do you want delivery service ? (true/false):- ");
                    Boolean delivery = sc.nextBoolean();
                System.out.println("Do you want embroidery (true/false):- ");
                    Boolean embroidery = sc.nextBoolean();
                if(embroidery==true)
                    embTotal++;
                bk[i] = new BajuKurung(name, orderNum, deposit, delivery, type, embroidery);
            }
            System.out.println("\nOrder Number\t\tPrice(RM)\n=======================================");
                for(int i=0; i<quantity;i++){
                    if(bk[i].getDelivery())
                        System.out.println("\n"+bk[i].getOrderNum()+"\t\t\t"+(bk[i].payment()+5.0));
                    else
                    System.out.println("\n"+bk[i].getOrderNum()+"\t\t\t"+bk[i].payment());
                }
        }
            else if(baju.equalsIgnoreCase("BM")) {
                System.out.println("Insert the amount of Baju Melayu you want to order :- ");
                int quantity = num.nextInt();
                BajuMelayu[] bm = new BajuMelayu[quantity];
                for(int i=0; i<quantity;i++) {
                    System.out.println("Insert your name:- ");
                        String name = sc.nextLine();
                    System.out.println("Insert order number:- ");
                        String orderNum = sc.nextLine();
                    System.out.println("Insert type of Baju Melayu:- ");
                        int type = num.nextInt();
                    System.out.println("Insert the amount of deposit :- ");
                        double deposit = num.nextDouble();
                    System.out.println("Do you want delivery service ? (true/false):- ");
                        Boolean delivery = sc.nextBoolean();
    
                    bm[i] = new BajuMelayu(name, orderNum, deposit, delivery, type);
                    
                }
                System.out.println("\nOrder Number\t\tPrice(RM)\n=======================");
                for(int i=0; i<quantity;i++){
                    if(bm[i].getDelivery())
                        System.out.println("\n"+bm[i].getOrderNum()+"\t\t\t"+(bm[i].payment()+5.0));
                    else
                    System.out.println("\n"+bm[i].getOrderNum()+"\t\t\t"+bm[i].payment());
                }
                
        }

        System.out.println("\nTotal of Baju Kurung with embroidery = "+embTotal);
        
        sc.close();
        num.close();
    }
}
