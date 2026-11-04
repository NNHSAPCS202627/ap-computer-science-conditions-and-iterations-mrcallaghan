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
         * while loops:
         * 
         *      evaluates a condition (i.e., boolean expression)
         *          if true, executes teh body of the loop and then re-evaluates the expression
         *          if false, skips the loop body and continue
         */
        int count = 1;      // initialization
        
        while(count <= 5)       // loop condition
        {
            System.out.println(count);          // loop body
            // equivalent to count += 1 or count = count + 1
            count++;                            // update the loop variable
        }
        
        System.out.println("done");
    }
    
    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         * 
         * A better conditon would be: count <= 50
         */
        int count = 1;
        
        while(count != 50)
        {
            System.out.println(count);
            count += 2;
        }
        
        System.out.println("done");
    }
}
