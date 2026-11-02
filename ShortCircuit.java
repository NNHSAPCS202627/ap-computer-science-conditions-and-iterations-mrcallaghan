import java.util.Scanner;

/**
 * Write a description of class ShortCircuit here.
 *
 * @author mrcallaghan
 * @version 02nov2026
 */
public class ShortCircuit
{
    // Debugging challenge: test with null and "apple". Why does one input crash?
    public static void shortCircuitExample1(String str)
    {
        /*
         * This is an example of a "short-circuit" in Java.
         * 
         * For an AND operation, if the left operand is false, the right operand
         *  will not be evaluated.  This is because we already determined the result of the
         *  AND operation will be false.
         */
        if(str != null && str.length() > 3)
        {
            System.out.println("The string has more than 3 characters.");
        }
        else
        {
            System.out.println("There is no string longer than 3 characters.");
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
         * This is another example of a short-circuit.
         * 
         * For an OR operation, if the left operand is true, the right operand will not
         *      be evaluated.  This is because we have already determined the entire OR
         *      logic to be true.
         */
        if(fruit1.equals("kiwi")|| fruit2.equals("kiwi"))
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