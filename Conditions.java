import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author mrcallaghan
 * @version 22oct2026
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int) (Math.random() * 2);
        System.out.println("The random number is: " + coinFlip);
        
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        if (coinFlip == 0)
            System.out.println("coin is tails!");     
            System.out.println("better luck next time...");  // not in the if block!
    
    }
}
