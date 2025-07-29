import java.util.*;
import java.util.Scanner;

class nameList {
    private String name;
    private int age;
    public nameList(String n, int a) {
        name=n;
        age=a;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

    public boolean compareTo(nameList nList) {
        return false;
    }
    public String toString() {
        return "Name: "+name+", Age: "+age;
    }
}
public class Week4Ex {
    public static void main(String[] args) {
        ArrayList<nameList> nameLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        String name;
        int age=0, index=0;
        
        for (int i =0; i<3;i++) {
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Enter age: ");
            age = num.nextInt();
            nameLists.add(i, new nameList(name, age));
        }
        System.out.println("\nNameList before being sorted :- \n");
        for (int i=0; i<nameLists.size();i++) {
            System.out.println(nameLists.get(i).toString());
        }
        
        for(int i=0; i<nameLists.size(); i++) {
            for(int u=1; u<(nameLists.size()-i); u++) {
                if(nameLists.get(u-1).getName().compareTo(nameLists.get(u).getName())>0){
                    nameList temp = nameLists.get(u-1);
                nameLists.set(u-1, nameLists.get(u));
                nameLists.set(u, temp);
                }
            }
        }
        System.out.println("\nNameList after being sorted :- \n");
        for (int i=0; i<nameLists.size();i++) {
            System.out.println(nameLists.get(i).toString());
        }
        System.out.println("Enter name to be searched: ");
            String nameSearch = sc.nextLine();
        //index = Collections.binarySearch(nameLists, nameSearch);
        for(int i=0;i<nameLists.size();i++) {
            if(nameLists.get(i).getName().equalsIgnoreCase(nameSearch))
                index = i;
        }
        System.out.println("The searched name "+nameSearch+" is found at index "+index);
        sc.close();
        num.close();
    }   
}
