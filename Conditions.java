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
        else
        {
            System.out.println("coin is tails!");
        }
        
        /*
         * if, else if, else statement
         * 
         *  (Unlike Python, Java uses "else if" instead of "elif").
         */
        // model a four-sides die (1-4)
        int dieRoll = (int) (Math.random() * 4) + 1;
        
        if(dieRoll == 1)
        {
            System.out.println("you rolled a one!");
        }
        else if (dieRoll == 2)
        {
            System.out.println("you rolled a two!");
        }
        else if (dieRoll == 3)
        {
            System.out.println("you rolled a three!");
        }
        else  // not required
        {
            System.out.println("you rolled a four!");
        }
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter two fruits: ");
        String str1 = s.next();  // next gets the next token from the input stream
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two variables contain the same value.
         *      For variables of a class type, including Strings, this means that they contain
         *      the same reference.  That is, they refer to the same object in memory, not
         *      that the characters are in the same sequence.
         *      
         *  Alias: when two variables refer to the same object
         *      
         */
        if (str1 == str2)
        {
            System.out.println("string references are equal");
        }
        else
        {
            System.out.println("string references are NOT equal");
        }
        
        /*
         * The equals method returns true if the two objects referenced by the variables
         *  are "equal".  Equality is determeined by the class.  For Strings, it means
         *  that the two objects have the same sequence of characters.
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
         * If we want to check if the strings are not equal, we use the logical complement
         *  operator (i.e., !)
         */
        if (! str1.equals(str2))
        {
            System.out.println("strings are NOT equal");
        }
        
        /*
         * We will determine which String comes first lexicographically using the compareTo
         *      method of the String class.
         *      
         *      compareTo returns an int:
         *          0:      if the strings are equal (same sequence of chars)
         *          <0:     if str1 < str2 lexicographically
         *          >0:     if str1 > str2 lexicographically
         */
        int result = str1.compareTo(str2);
        System.out.println("Result of comparison: " + result);
        
        String firstStr = null;
        if (result < 0)
        {
            firstStr = str1;
        }
        else if (result > 0)
        {
            firstStr = str2;
        }
        
        if (firstStr == null)
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("the first string is: " + firstStr);
        }
        
    }
    
    
    
    
    
    
    
    
    
    
}
