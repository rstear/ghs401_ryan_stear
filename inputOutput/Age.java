import javax.swing.JOptionPane;
import java.util.Scanner;

public class Age
{
    
    
    
    public static void main()
    {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        if (age >= 16)
        {
            System.out.println("You may earn your driver's license");
        }
        else
        {
            System.out.println("You may not earn your driver's license");
        }
        
    }
}
