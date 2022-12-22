import java.util.Scanner;
public class FilmApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        String title;
        String producer;
        int yearProduce;
        double productionCost;
        
        
    System.out.println("Enter the title of the film : ");
        title = sc.nextLine();
    System.out.println("Enter the producer of said film : ");
        producer = sc.nextLine();
    System.out.println("Enter the year it was released  : ");
        yearProduce = num.nextInt();
    System.out.println("Enter the film's production cost  : ");
        productionCost = num.nextDouble();


        Film film1 = new Film(title, producer, yearProduce, productionCost);
        Film film2 = new Film(film1);
        film2.setProductionCost(film2.getProductionCost()*1.05);
        film2.setTitle("Jumanji");

        if(film2.filmAge()>=5)
            System.out.println("The film "+film2.getTitle()+" had already reached 5 years of production age");
        else if(film2.filmAge()<5)
            System.out.println("The film "+film2.getTitle()+" has not yet reached 5 years of production age");
        
        if(film1.moreExpensive(film1.productionCost, film2.productionCost))
            System.out.println("The film "+film1.getTitle()+" is more expensive than "+film2.getTitle());
        else if(film1.moreExpensive(film2.productionCost, film1.productionCost))
            System.out.println("The film "+film2.getTitle()+" is more expensive than "+film1.getTitle());

            sc.close();
            num.close();
    }
}