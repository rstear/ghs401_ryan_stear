import javax.swing.JOptionPane;

public class Calc
{
    
    
    public static void main()
    {
        String base = JOptionPane.showInputDialog("Enter the base: ");
        String exponent = JOptionPane.showInputDialog("Enter the exponent: ");
    
        double baseDouble = Double.parseDouble(base);
        double exponentDouble = Double.parseDouble(exponent);
        
        System.out.println(Exponents.exp(baseDouble, exponentDouble));
        
    }
}
