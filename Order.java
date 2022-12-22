public class Order   {
 private int tableNum;
 private int quantity;
 private int orderMenu;
 private String name;
 
 Order() {
   tableNum = 0;
   quantity = 0;
   orderMenu = 0;
 }

 public Order(Order o) // copy constructor
 {
     tableNum = o.tableNum;
     quantity = o.quantity;
     orderMenu = o.orderMenu;
     name = o.name;
 }

 Order(int tableNum, int quantity, int orderMenu)  {
   this.tableNum = tableNum;
   this.quantity = quantity;
   this.orderMenu = orderMenu;
 }
 
 public int getTableNum() {return tableNum;}
 
 int getQuantity() {return quantity;}
 
 int getOrderMenu() {return orderMenu;}

 String getName() {return name;}
 
 void setTableNum(int t) {tableNum = t;}
 
 void setOrderMenu(int o) {orderMenu = o;}

 void setQuantity(int q) {quantity = q;}
 
 public double setPrice()  {
   double total = 0.0;
   
   switch(orderMenu) {
   case 1:{name="Tom Yunk Campur";total += 12.9;break;}
   case 2:{name="Siakap 2+1 Rasa";total += 27.6;break;}
   case 3:{name="Ikan Merapu Stim Aq Yahoo";total += 30.0;break;}
   case 4:{name="Mee Goreng Ayum";total += 7.8;break;}
   case 5:{name="Udang/Sotong Goreng Tepunk";total += 6.0;break;}
   case 6:{name="Telur Goreng";total += 4.5;break;}
   case 7:{name="Sayur Kang Keng Kong Goreng";total += 5.0;break;}
   case 8:{name="Lamb Chop";total += 25.0;break;}
   case 9:{name="Nasi Goreng LGBT";total += 26.5;break;}
   case 10:{name="Nasi Putih";total += 1.8;break;}
   case 11:{name="Mango Juice";total += 2.9;break;}
   case 12:{name="Chocolate Milk";total += 7.6;break;}
   case 13:{name="Fresh Milk";total += 3.0;break;}
   case 14:{name="Iced Cincau";total += 7.8;break;}
   case 15:{name="Carrot Juice";total += 6.0;break;}
   case 16:{name="Iced Thin Lime";total += 4.5;break;}
   case 17:{name="Soy Bean Milk";total += 5.0;break;}
   case 18:{name="Pen PineApple Juice";total += 5.0;break;}
   case 19:{name="WaterMELON Juice";total += 6.5;break;}
   case 20:{name="Sugar cane Juice";total += 1.8;break;}       
       default: System.out.println("\nERROR : Unknown Input");}
       return total;  
   }
 }