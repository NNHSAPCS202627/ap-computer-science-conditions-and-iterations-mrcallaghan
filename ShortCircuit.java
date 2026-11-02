import java.util.Scanner;

/**
 * A short-circuit debugging exercise.
 */
public class ShortCircuit
{
    // Debugging challenge: test with null and "apple". Why does one input crash?
    public static void shortCircuitExample1(String str)
    {
        /*
         * This is a short-circuit example.
         * 
         * For an AND operation, if the left hand operand is false, the right hand operand will
         *  will not be evaluated.  This is because the and logic is predetermined if the 
         *  left operand is false.
         */
        if(str != null && str.length() > 3)
        {
            System.out.println("The string has more than 3 characters and is not null.");
        }
        else
        {
            System.out.println("There is no string longer than 3 characters or is null.");
        }

    }
    // Debugging challenge: test with "kiwi avocado vanilla". 
    //      Why does the ice cream flavor get reported as "avocado"?
    public static void shortCircuitExample2()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two of your favorite fruits: ");
        /*
         * This another short-circuit example.
         * 
         * For an OR operation, if the left operand is true, the right operand will be skipped.
         *   This is because for or logic only one operand needs to be true for the whole
         *   expression to be true.
         *   
         *   This is a bug if we enter "kiwi" for the first fruit.
         */
        String fruit1 = input.next();
        String fruit2 = input.next();
        
        if(fruit1.equals("kiwi") || fruit2.equals("kiwi"))
        {
            System.out.println("Yum! Kiwis!");
        }
        else
        {
            System.out.println("No kiwis this time.");
        }
        //String ghost = input.next();
        System.out.print("Enter your favorite ice cream flavor: ");
        String flavor = input.next();
        System.out.println("Favorite ice cream flavor: " + flavor);
    }
}