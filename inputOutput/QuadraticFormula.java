import javax.swing.JOptionPane;

public class QuadraticFormula
{
    
    public static int alt = 1;
    
    public static double inputA;
    public static double inputB;
    public static double inputC;
    
    public static double zeros(double a, double b, double c)
    {
        a = inputA;
        b = inputB;
        c = inputC;
        if (alt == 1)
        {
            System.out.println("The value of B^2 is: " + b * b);
            System.out.println("The value of 4ac is: " + 4 * a * c);
            System.out.println("The value of root (B^2 -4ac) is: " + Math.sqrt(b * b - (4 * a * c)));
        }
        return ((-1 * b) + (alt * Math.sqrt(b * b - (4 * a * c))))/(2 * a);
    }
    
    public static void main()
    {
        inputA = Double.parseDouble(JOptionPane.showInputDialog("Input a value for A"));
        inputB = Double.parseDouble(JOptionPane.showInputDialog("Input a value for B"));
        inputC = Double.parseDouble(JOptionPane.showInputDialog("Input a value for C"));
        if (inputB * inputB - (4 * inputA * inputC) < 0)
        {
            System.out.println("Imaginary zeros");
        }
        else
        {
            System.out.println(zeros(inputA, inputB, inputC));
            alt *= -1;
            System.out.println(zeros(inputA, inputB, inputC));
            alt *= -1;
        }

    }
}
