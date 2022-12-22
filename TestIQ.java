import java.util.ArrayList;

public class TestIQ {
public static void main(String[] args)
{
   ArrayList <Integer> data = new ArrayList<>();
   int i,num;
     
   for (i=0; i<20; i+=3)
   {
      data.add((i * 2) - i);
   }
   System.out.println("The elements are: "+ data);
     
   for (i=0; i<data.size(); i++)
   {
     num = Integer.parseInt(data.get(i).toString());
     if ((num % 4)  == 0)
        data.remove(i);
   }
   System.out.println("The new elements are: "+ data);
  }
{
}
}