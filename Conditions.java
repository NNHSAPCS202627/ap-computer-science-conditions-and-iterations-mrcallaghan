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
        int coinFlip = (int)(Math.random() * 2);
        System.out.println("Random number: " + coinFlip);
        
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
            System.out.println("the coin is heads!");
        }
        else
        {
            System.out.println("the coin is tails!");
        }
        
        // model the roll of a four-sided die (1-4)
        int dieRoll = (int)(Math.random() * 4) + 1;
        /*
         * if, else if, else statement
         * 
         *  (Unlike Python, Java uses "else if" instead of "elif").
         */
        if (dieRoll == 1)
        {
            System.out.println("rolled a 1");
        }
        else if (dieRoll == 2)  // can have as many else if block as you need
        {
            System.out.println("rolled a 2");
        }
        else if (dieRoll == 3)  // can have as many else if block as you need
        {
            System.out.println("rolled a 3");
        }
        else  // not required, but the best choice here
        {
            System.out.println("rolled a 4");
        }

    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter two fruits: ");
        String str1 = s.next();  // scan first token from the input stream up to the first space
        String str2 = s.next();
        
        /*
         * The equality operator ("==") returns true if the two variables (e.g., str1 and str2)
         *      contain the same value.  For variables of a class type, like Strings, this 
         *      means that they contain the same reference value.  That is, they refer
         *      to the same object in memory, not that the Strings contain the same sequence of 
         *      characters.
         *      
         *      Alias: two variables that refer to the same object
         */
        if (str1 == str2)
        {
            System.out.println("String references are equal");
        }
        else
        {
            System.out.println("String references are NOT equal");
        }
        
        
        /*
         * The equals method return true if the two string obejcts referenced by the vairables
         *      are "equal".  What equal means is defined by the class.  For Strings, it
         *      means that the two obejcts have the same sequence of characters.
         */
        if (str1.equals(str2))
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are NOT equal");
        }
        
        /*
         * If we want to check if strings are NOT equal, we use the logical complement operator
         *  (i.e., !)
         */
        if(!str1.equals(str2))
        {
            System.out.println("strings are NOT equal");
        }
        
        
        /*
         * We will determine which string comes first lexicographically using the 
         *      compareTo method of the String class.
         *      
         *      compareTo return an int value:
         *          0:  if the strings are equal (same sequence of characters)
         *          <1: if str1 < str2 lexicographically
         *          >1: if str1 > str2 lexicographically
         */
        int result = str1.compareTo(str2);
        System.out.println("Result from comparison: " + result);
        
        String firstStr = null;
        if(result < 0)
        {
            firstStr = str1;
        }
        else if (result > 0)
        {
            firstStr = str2;
        }
        
        if(firstStr == null)
        {
            System.out.println("The strings are equal");
        }
        else
        {
            System.out.println("the first string is: " + firstStr);
        }
        
        
    }
    
    
    
    
    
    
    
    
}
