import java.util.Scanner;

/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author mrcallaghan
 * @version 04nov2026
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop:
         * 
         *      evaluates a condition (i.e., boolean expression)
         *          if true, executes the body of the loop and then re-evaluates the expression
         *          if false, skips the body of the loop an dcontinues
         *          
         *  while loops are most useful if you don't know how many loops are required
         */
        int count = 1;      // initialization
        
        while(count <= 5)       // loop condition
        {
            System.out.println(count);      // loop body
            // ++ is equivalent to: count += 1 OR count = count + 1
            count++;                        // update the loop variable
        }
        System.out.println("done.");
        
    }
    
    public static void whileExample2()
    {
        int count = 1;
        
        /*
         * This is an example of an infinite loop!
         * 
         * A better condition would be: count <= 50
         * 
         * Otherwise, the loop variable is never the value of 50 and the loop executes 
         *      infinitely.
         */
        
        // intended to print up to 50 by 2's, starting at 1
        while(count != 50)
        {
            System.out.println(count);
            
            count += 2;
        }
        
        System.out.println("done.");
    }
}
