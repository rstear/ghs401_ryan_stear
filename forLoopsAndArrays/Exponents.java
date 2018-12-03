
public class Exponents
{
    public static double exp(double a, double b)
    {
        double c = a;
        for (int i = 0; i < b - 1; i++)
        {
            a *= c;
        }
        return a;
    }
}
