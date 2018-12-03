
public class forLoops
{
    public static void main()
    { 
        int[] myArray = new int[12];
        
        myArray[1] = 17;
        myArray[myArray.length - 2] = 13;
        myArray[myArray.length - (myArray.length - 1)] = 17;
        
        /*for (int i = 0; i < myArray.length; i++)
        {
            System.out.println("The value of my Array at " + i + " is " + myArray[i]);
        }*/
        
        int[] myArrayOne = new int[100];
        int lineCount = 0;
        
        for (int i = 0; i < myArrayOne.length; i++)
        {
            myArrayOne[i] = i * 5;
        }
        
        for (int i = 0; i < myArrayOne.length; i++)
        {
            if (lineCount >= 0 && lineCount < 5)
            {
                System.out.print("Item " + (i + 1) + " is " + myArrayOne[i] + ", ");
                lineCount++;
            }
            else
            {
                lineCount = 0;
                System.out.println();
            }
        }
    }
}
