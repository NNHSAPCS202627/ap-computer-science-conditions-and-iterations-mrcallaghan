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

        /*
         * if statement
         * 
         *  Statements in the if block are executed if the conditional expression is true.
         *  
         *  Conditional expressions evaulate to either true or false.
         *      The conditional expression must go inside of parentheses.
         *      (Unlike Python, there is no colon after the conditional expression.)
         *      
         *  Statements are grouped by blocks (i.e., { } ).
         *      (Unlike Python, blocks are not defined by indentation.)
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * { } are not required for a single statement
         *      However, they are always a good idea!
         *      Leaving them out can lead to bugs like this:
         */
        if (coinFlip == 0)
            System.out.println("coin is tails!");     
            System.out.println("better luck next time...");  // not in the if block!
            
        /*
         * if, else statement
         * 
         *  The else block is executed if the conditional expression evaluates to false
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        else  // optional
        {
            System.out.println("coin is tails!");
        }
        
        /*
         * if, else if, else statement
         * 
         *  (Unlike Python, Java uses "else if" instead of "elif").
         */
        // model a die roll of four sides (1-4)
        int dieRoll = (int) (Math.random() * 4) + 1;
        System.out.println("roll is: " + dieRoll);
        
        if (dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if (dieRoll == 2)
        {
            System.out.println("rolled a two");
        }
        else if (dieRoll == 3)
        {
            System.out.println("rolled a three");
        }
        else
        {
            System.out.println("rolled a four");
        }
        
        
        
        
        
        
        

    }
}
