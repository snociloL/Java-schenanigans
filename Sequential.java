import javax.swing.JOptionPane;
public class Sequential {
    public static void main(String[] args) {

        //Input part
        String Question;
        Question = JOptionPane.showInputDialog("Enter the 1st number");
            double num1 = Double.parseDouble(Question);
        Question = JOptionPane.showInputDialog("Enter the 2nd number");
            double num2 = Double.parseDouble(Question);
        Question = JOptionPane.showInputDialog("Enter the 3rd number");
            double num3 = Double.parseDouble(Question);
        Question = JOptionPane.showInputDialog("Enter the 4th number");
            double num4 = Double.parseDouble(Question);
        
        // Calculation part
        double sum = num1 + num2 + num3 + num4;
        double product = num1 * num2 * num3 * num4;
        double average = (num1 + num2 + num3 + num4)/4;

        //Output part
            String answer;
            answer="The 1st number is " +num1 +
                "\n The 2nd number is " +num2 +
                "\n The 3rd number is " +num3 +
                "\n The 4th number is " +num4 +
                "\n The sum of all 4 numbers are " +sum +
                "\n The product of all 4 numbers are " +product +
                "\n The average between all 4 numbers are " +average;
                JOptionPane.showMessageDialog(null, answer);
    }
}
