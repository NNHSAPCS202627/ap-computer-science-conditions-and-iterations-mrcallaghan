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
         * This is an example of a short-circuit.
         * 
         * For an AND operation, if the left hand operand is false, the right hand operand
         *  will not be evaluated.  This is because we have alrady determined the result of the 
         *  and operation.
         * 
         * 
         */
        if(str != null && str.length() > 3)
        {
            System.out.println("The string has more than 3 characters and is not null.");
        }
        else
        {
            System.out.println("There is no string longer than 3 characters or the string is null.");
        }

    }
    // Debugging challenge: test with "kiwi avocado vanilla". Why does the ice cream flavor get reported as "avocado"?
    public static void shortCircuitExample2()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two of your favorite fruits: ");
        String fruit1 = input.next();
        String fruit2 = input.next();
        /*
         * This is also an example of a short-circuit.
         * 
         * For an OR operation, if the left operand is true, the right operand will 
         *  not be evaluated.  This is becuase we have already determined the result of the 
         *  or operation and it will be true.
         */
        if(fruit1.equals("kiwi") || fruit2.equals("kiwi"))
        {
            System.out.println("Yum! Kiwis!");
        }
        else
        {
            System.out.println("No kiwis this time.");
        }

        System.out.print("Enter your favorite ice cream flavor: ");
        String flavor = input.next();
        System.out.println("Favorite ice cream flavor: " + flavor);
    }
}