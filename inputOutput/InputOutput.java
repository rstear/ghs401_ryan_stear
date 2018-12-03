import javax.swing.JOptionPane;


public class InputOutput
{
    public static void main()
    {
        
        String username = JOptionPane.showInputDialog("Enter your name: ");
        String password = JOptionPane.showInputDialog("Enter your password: ");
       try
       {
           if (username.equals("Ryan") && password.equals("password"))
           {
               System.out.println(":)");
           }
           else
           {
               System.out.println(":(");
           }
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
    }
}
