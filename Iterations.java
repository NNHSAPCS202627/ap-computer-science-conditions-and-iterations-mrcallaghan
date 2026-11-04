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
    
    
    
    
    
    
    
    
    
}
