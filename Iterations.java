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
    
    public static void forExample()
    {
        /*
         * for loop:
         *      
         *      three main parts of the for statement:
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the start of every loop iteration
         *          3. updating the loop variable - executed at the end of each iteration and
         *                  before reevaluating the loop condition.
         */
        //int count;
        for(int count = 1;              // initialization
                count <=5;              // condition
                count++)                // update the loop variable
        {
            System.out.println(count);  // loop body            
        }
        
        System.out.println("done.");
        
        // variables declared within the for statment are scoped to the body of the loop
        //System.out.println("final value of count is: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error.  It is common with for loops executing one too many times,
         *      or one too few.
         *      
         *      Carfully ask: Should the initial value start at 1 or 0?
         *                    Should the condition end at < or <= ?
         *                    
         *      By convetion for simple for loops, we start at 0 and use <.
         */
        
        // intent of program is to print 5 asterisks
        for(int i = 0; i <= 5; i++)  // would require the < to debug this! (or start at 1 instead of 0)
        {
            System.out.println("*");
        }
    }
    
    
    public static void doExample()
    {
        /*
         * do loop (do-while loops)
         * 
         *  1. executes the body of the loop first
         *  2. evaluates the condition:
         *          if true, executes the body of the loop again
         *          if false, continue execution after the loop
         */
        
        int count = 1;  // initialization
        
        do
        {
            System.out.println(count);  // loop body
                
            count++;                    // update the loop variable
        }
        while(count <= 5);  // condition
        
        System.out.println("done.");
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("enter a postive integer (-1 to quit): ");
            
            value = s.nextInt();
            
            if(value != -1)
            {
                sum += value;
            }
        }
        while(value != -1);
        
        return sum;
    }
    
    
    
    
}
