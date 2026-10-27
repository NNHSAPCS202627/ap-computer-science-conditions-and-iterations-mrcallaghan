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
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two variables contain the same
         *  value.  For variables of a class type, inlcuding String, this means that 
         *  they contain the same reference.  That is, they refer to the same object
         *  in memory, not that the two stings have the same sequence of characters.
         *  
         *  Alias: two variabels refer to the same object
         */
        if(str1 == str2)
        {
            System.out.println("String references are equal.");
        }
        else
        {
            System.out.println("String references are NOT equal.");
        }
        
        /*
         * The equals method returns true if the two objects references by the variables
         *   are "equal". What "equal" means for objects is determined by the class. For 
         *   strings, it means the objects have the same sequence of characters.
         */
        if(str1.equals(str2))
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are NOT equal");
        }
        
        /*
         * If we want to check if strings are not equal, we use the logical complement
         *  operator (i.e., !)
         */
        if(! str1.equals(str2))
        {
            System.out.println("strings are NOT equal");
        }
        
        /*
         * We will determine which string comes first lexicographically using the 
         *      compareTo method of the String class.
         *      
         *      compareTo returns an int:
         *          0:      if the strings are equal (same sequence of characters)
         *          <0:     if str1 < str2 lexicographically
         *          >0:     if str1 > str2 lexicographically
         *          
         */
        int result = str1.compareTo(str2);
        System.out.println("Comparison result: " + result);
        
        String first = null;
        if(result < 0)
        {
            first = str1;
        }
        else if (result > 0)
        {   
            first = str2;
        }
        
        if (first != null)
        {
            System.out.println("The first String is: " + first);
        }
        else
        {
            System.out.println("The strings are equal");
        }
        
    }
    
    
    
    
    
    
    
    
    
}
