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
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *  Three parts of the for statement:
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the start of each iteration
         *          3. update the loop variable - executed at the "end" of each iteration
         */
        //int count;  // can be declared outside the loop, but not common
        for(int count = 1;                  // initialization
                count <= 5;                 // condition
                count++)                    // updating of the loop variable
        {
            System.out.println(count);      // loop body
        }
        
        System.out.println("done.");
        
        /*
         * variables declared within the for statment are scoped to the for statement and its
         *  body; undeclared outside of the loop.
         */
        //System.out.println("final value of count is: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops executing one too many
         *  times or one too few times.
         *  
         *  Carefully ask: Should the initial value be 0 or 1?
         *                 Should the condition be < or <= ?
         *                 
         *      Think! Don't just try things and compile/run at random.
         *      
         *  By convention, for simiple for loops, we start at 0 and use the < operator.
         */
        
        // we want to print five "*"
        for(int i = 0; i < 5; i++)  // <= would result in an off-by-one error
        {
            System.out.println("*");
        }
        
        System.out.println("done.");
    }
    
    
    
    
    
    
    
    
}
