import javax.swing.JOptionPane;

public class GPA
{
    
    public static void  main()
    {
        double gradePointAverage = Double.parseDouble(JOptionPane.showInputDialog("What is your GPA? "));
        
        if (gradePointAverage <= 0)
        {
            System.out.println("Noice");
        }
        else if (gradePointAverage >= 5)
        {
            System.out.println("Damn");
        }
        else if (gradePointAverage > 0 && gradePointAverage < 5)
        {
            System.out.println("Great Work!");
            double sum = CalculationClass.addition(5, 12);
            System.out.println(sum);
            Age.main();
        }
    }
}
