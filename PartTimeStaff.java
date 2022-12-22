public class PartTimeStaff extends Staff {
   private int hour;

         PartTimeStaff(String i, int a, String add, int h) {
         super(i,a,add);
         hour=h;
      }
      
      int getHour() {return hour;}
      
      void setData(String i, int ag, String add,int h) {
         super.setIcNo(i);
         super.setAge(ag);
         super.setAddress(add);
         hour=h;
      }
      
      double calculateSalary() {
         double salary=hour*5;
         return salary;
      }
      
      public String toString() {
         return (super.toString()+" Hour : "+hour+" Salary is : "+calculateSalary());
        }
}