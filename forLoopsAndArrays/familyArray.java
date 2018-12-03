
public class familyArray
{
    public static void main()
    {
        String[] name = new String[4];
        name[0] = "Ryan";
        name[1] = "Kathleen";
        name[2] = "James";
        name[3] = "Sarah";
    
        int[] age = new int[4];
        age[0] = 17;
        age[1] = 50;
        age[2] = 52;
        age[3] = 15;
    
        for (int i = 0; i < age.length; i++)
        {
            System.out.println(name[i] + " is " + age[i] + " years old.");
        }
    }
}
