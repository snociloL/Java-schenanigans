public class Staff {
   private String icNo;
   private int age;
   private String address;
   
    Staff(){
      icNo="null";
      age=0;
      address="null";
     }


      Staff(String i, int a, String add){
      icNo=i;
      age=a;
      address=add;
     }
     
     String getIcNo() {return icNo;}
     
     int getAge() {return age;}
     String getAddress() {return address;}
     
     void setIcNo(String ic) {icNo=ic;}
     void setAge(int a) {age=a;}
     void setAddress(String a) {address=a;}
     
     public String toString() {
     return (" ic No : "+icNo+" Age : "+age+" Address : "+address);
     }
}