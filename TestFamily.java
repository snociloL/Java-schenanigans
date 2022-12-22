import java.util.Scanner;

public class TestFamily {
    public static void main(String[] args) {
        double incomeMalay=0.0;
        double incomeChinese=0.0;
        double incomeIndian=0.0;
        double sumIncome= 0.0, sumChild=0.0;
        double average=0.0;

        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        Family[] individual = new Family[20];

        for(int i=0; i<individual.length; i++) {
            individual[i] = new Family();

            System.out.println("\nPlease insert your Id Number : ");
             individual[i].id = str.nextLine();
            System.out.println("\nYour Race || Malay(M), Chinese(C), Indian(I): ");
             individual[i].race = str.nextLine();
            System.out.println("\nYour Monthly Income : RM");
             sumIncome += individual[i].income = num.nextDouble();
            System.out.println("\nNumber of Childrens : ");
             sumChild += individual[i].numberChild = num.nextInt();
            System.out.println("\nState of Residency : ");
             individual[i].state = str.nextLine();

            if(individual[i].race.equals("M"))
                incomeMalay+= individual[i].income;
            else if(individual[i].race.equals("C"))
                incomeChinese+= individual[i].income;
            else if(individual[i].race.equals("I"))
                incomeIndian+= individual[i].income;
    }
    for(int i=0;i<individual.length;i++) {
        System.out.println(individual[i].displayInfo());
    }
    average = sumIncome/sumChild;
    System.out.println("\nAverage Income per Child : RM"+average+"\nThe total income for each races :- \nMalay : RM"+incomeMalay+"\nChinese : RM"+incomeChinese+"\nIndian : RM"+incomeIndian);
    str.close();
    num.close();
}
}