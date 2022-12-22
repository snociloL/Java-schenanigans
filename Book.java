import java.util.*;

public class Book {
    private String title;
    private String type;
    private String author;
    private String publisher;
    private double price;
    public Book(String tl, String tp, String a, String pub, double p){
        title = tl;
        type = tp;
        author = a;
        publisher = pub;
        price = p;
    }
    public String getTitle() {return title;}
    public String getType() {return type;}
    public String getAuthor() {return author;}
    public String getPublisher() {return publisher;}
    public double getPrice() {return price;}

    public String toString() {
        return "\nTitle : "+title+"\nType : "+type+"\nAuthor : "+author+"\nPublisher : "+publisher+"\nPrice : "+price;
    }

    public static void main(String[] args) {
        Stack<Book>bookStack = new Stack<>();
        Stack<Book> computerStack = new Stack<>();
        Stack<Book> mathStack = new Stack<>();
        Book mostExpensive = new Book("", "", "", "pub", 0.0);
        double expensive = 0;
         String title;
         String type;
         String author;
         String publisher;
         double price;
         Scanner sc = new Scanner(System.in);
         Scanner num = new Scanner(System.in);

         for(int i=0; i<4; i++) {
            System.out.println("\nInsert the title of the book : ");
            title = sc.nextLine();
            System.out.println("Type of book : ");
            type = sc.nextLine();
            System.out.println("The author : ");
            author = sc.nextLine();
            System.out.println("The publisher : ");
            publisher = sc.nextLine();
            System.out.println("Price : ");
            price = num.nextDouble();
            Book b = new Book(title, type, author, publisher, price);
            bookStack.push(b);
         }

         while(!bookStack.isEmpty()) {
            Book temp = (Book) bookStack.pop();
            if(temp.getType().equalsIgnoreCase("Computer")) {
                computerStack.push(temp);
            if(temp.getPrice()>expensive && temp.getType().equalsIgnoreCase("Computer")){
                    mostExpensive = temp;
                    expensive =temp.getPrice();
                }
            }
            if(temp.getType().equalsIgnoreCase("Math"))
                mathStack.push(temp); 
         }

         while(!computerStack.isEmpty()) {
             Book temp = (Book) computerStack.pop();
             System.out.println(temp.toString());
         }
         while(!mathStack.isEmpty()) {
            Book temp = (Book) mathStack.pop();
            System.out.println(temp.toString());
        }

        System.out.println("\nMost expensive book :- "+mostExpensive.toString());

         sc.close();
         num.close();
    }
    }
