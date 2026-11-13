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
    
    public static void tracingForExample()
    {
        double n = 3;
        for(int i = 3; i < 9; i+=2) 
        {
            n *= i;
        }
        
        System.out.println(n);
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *  1. executes the body of the loop (first)
         *  2. evaluates the condition:
         *          if true, exucutes the body of the loop again
         *          if false, continues exucution after the loop
         */
        int count = 1;          // initialization
        
        do
        {
            System.out.println(count);      // loop body
            
            count++;                        // update the loop variable
        
        }
        while (count <= 5);     // condition
        
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
            /*
             * Sentinel variable / value
             *      value used to terminate a loop, often entered by the user
             */
            value = s.nextInt();
            
            /*
             * This was a bug!  sum was one less than it shoudl be!
             */
            if(value != -1)
            {
                sum += value;
            }
            
        }
        while(value != -1);
        
        return sum;
    }
    
    public static int sumWithContinue()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print("enter a postive integer (-1 to quit): ");
            /*
             * The hasNextInt method of the Scanner returns true if the next token is read as an integer.
             *      Otherwise, it returns false.  It does not consume the next token.  If there are no tokens
             *      , it will wait until there are more.
             */
            if(s.hasNextInt() == false)
            {
                String token = s.next();
                System.out.println("\"" + token + "\" is not an integer; try again.");
                /*
                 * continue:
                 *      1. immediately skips to the end of the inner-most loop
                 *      2. re-evaluate the loop condition and continue with the next iteration
                 *          if the condition is true.
                 */
                continue;
            }
            
            value = s.nextInt();

            if(value == -1)
            {
                /*
                 * break: immediately exit the innermost loop
                 */
                break;
            }
            
            sum += value;
            
        }
        while(value != -1);
        
        return sum;
    }
    
    public static int sumWithBreak()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("enter a postive integer (-1 to quit): ");
            value = s.nextInt();

            if(value == -1)
            {
                /*
                 * break: immediately exit the innermost loop
                 */
                break;
            }
            
            sum += value;
            
        }
        while(value != -1);
        
        return sum;
    }
    
    /*
     * 1 1
     * 1 2
     * 1 3
     * 1 4
     * 2 1
     * 2 2
     * 2 3
     * 2 4
     */
    public static void nestedLoop1()
    {
        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.println(i + " " + j);
            }
        }
    }
    
    public static void nestedLoop2()
    {
        int i = 1;
        while(i <= 2)
        {
            int j = 1;
            while(j <= 4)
            {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }
    }
    
}
