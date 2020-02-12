import javax.swing.JOptionPane;

public class Heloworld{
    
    public static void main( String[] args){
        
        String FistNumber =
            JOptionPane.showInputDialog("Enter first integer");
        
        String secondNumber =
            JOptionPane.showInputDialog("Enter second integer");
        
        int number1 = Integer.parseInt(FistNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The sum is "+sum,"sum of teo Integers",JOptionPane.PLAIN_MESSAGE);
    }
}

        
