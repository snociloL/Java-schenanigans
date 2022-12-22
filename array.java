public class array {

    public static void main(String[] args) {
        double[] samplingData = { 2.443, 8.99, 112.3, 45.009, 18.2, 9.00, 3.123, 22.084, 18.08};
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String shortest = " ";
        String shortForm[] = new String [12] ;
        int shortMonth = 100;
        double sum = 0;

        for(int i = 0; i < samplingData.length; i++)
        {
            sum = sum + samplingData[i];
        }
        int i = 0;
        do{
            if(shortMonth > monthName[i].length())
            {
                shortest = monthName[i];
                shortMonth = monthName[i].length();
            }
            i++;
        }while(i<12);

        for(int ii = 0; ii < monthName.length; ii++)
        {
            if(shortMonth > monthName[ii].length())
            {
                shortest = monthName[ii];
                shortMonth = monthName[ii].length();
            } 
        }

        double average = sum/9;
        System.out.println("\nThe sum of all numbers are = " +average);
        System.out.println("\nThe shortest character among each month's name is = " +shortest + "\n");
        
        for(int u = 0; u < monthName.length; u++)
        {
          shortForm[u] = monthName[u].substring(0,3);
            System.out.println(shortForm[u]);
        //alternative : System.out.println(monthName[i].substring(0, 3));
        }
        
        
    }
}
