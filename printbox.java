import javax.swing.JOptionPane;
public class printbox {
    public static void main(String[] args) {
        String input;
            input = JOptionPane.showInputDialog("Enter a number");
        int num = Integer.parseInt(input);
        String output;
            output = "The number you have enter is \n " +num;
        JOptionPane.showMessageDialog(null, output);
    }
}
