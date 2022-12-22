import javax.swing.JOptionPane;

public class manipulate {
    public static void main(String[] args) {
        String flightNum;
        String flightOper = "0";
        String input;
        flightNum = JOptionPane.showInputDialog("Please enter your Flight Number : ");
        input = flightNum.substring(0, 2);
        
        switch(input) {
            case "AK":
            {
                flightOper = "Airasia Airlines";
                break;
            }
            case "FY" : 
            {
                flightOper = "Firefly Airlines";
                break;
            }
            case "GD" :
            {
                flightOper = "Garuda Airlines";
                break;
            }
            case "MH" :
            {
                flightOper = "Malaysia Airlines";
                break;
            }
            case "MN" :
            {
                flightOper = "Manila Airlines";
                break;
            }
            case "PL" :
            {
                flightOper = "Pelangi Airlines";
                break;
            }
            default : System.out.println("\nERROR : Unknown Input");
        }
    
        JOptionPane.showMessageDialog(null,"Your Flight Operator is " + flightOper);

    }
}