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
         *      used to repeat code an indefinite number of times
         *      
         *      evaluates a condition (i.e., boolean expression)
         *          if true, executes the body of the loop and then re-evaluates the expression
         *          if false, skips the loop body and continues
         */
        
        int count = 1;          // initialization before loop
        
        while (count <= 5)      // condition
        {
            System.out.println(count);      // loop body to be repeated
            
            // ++ is the post-increment operator:
            //      equivalent to count += 1 and count = count + 1
            count++;                        // increment loop variable
        }
        
        System.out.println("done.");
        
    }
    
    public static void whileExample2()
    {
        int count = 1;
        /*
         * This is an example of an infinite loop!  (logic error)
         * 
         * if the condition was count != 50, the loop will run forever because count
         *      is never the value of 50
         */
        // print from 1 to 49 by 2's; debug me!
        while(count <= 50)
        {
            System.out.println(count);
            
            count += 2;
        }
        
        System.out.println("done.");
    }
    
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *      Three parts of the for statement:
         *          1. intialization - executed only once
         *          2. condition - boolean expression evaluated at the start of each loop iteration
         *          3. update the loop variable = executed at the end of each iteration and before 
         *                  reevaualting the the condition.
         */
        int count;
        for(count = 1;          // initialization
                count <= 5;         // condition
                count++)            // update the loop variable
        {
            System.out.println(count);     // loop body
        }
        
        /*
         * variables initialized inside of a for statement or loop body are scoped to the loop and 
         *      don't exist outside of it.
         */
        System.out.println("done. The current value of count outside the loop is: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops executing one too many or one too few
         *      times.
         *      
         *      Carefully ask: 
         *          - Should the initial value be 1 or 0 ?
         *          - Should we end at < or <= ?
         *          
         *          
         *    For simple for loops, we usually start at 0 and use <.
         */
        
        // intends to print 10 asterisks!
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("*");
        }
        
        
    }
    
    
    
    
    
    
}
