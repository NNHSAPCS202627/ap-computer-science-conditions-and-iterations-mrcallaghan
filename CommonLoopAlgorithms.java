import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        String newToken = "";

        System.out.print("Enter words and press the Enter key as you go (Type 'quit' to stop):\n");

        while (true)
        {
            newToken = s.next().toLowerCase();
            int length = newToken.length();

            if (newToken.equals("quit")) {
                //end loop
                break;
            }

            if (length > 4) {
                //increment counter if the word's length is 5 or more characters
                counter++;
            }

        }

        return counter;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);
        String string;
        int value = 0;
        do{
            System.out.println("Enter you string here");
            string = s.nextLine();
            if (string.equals("quit"))
                break;
            if (string.substring(0,3).equals("con"))
                value++;
        }
        while (true);
        return value;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner s = new Scanner(System.in);
       
        int count = 0;
       
        do
        {
            System.out.println("Enter a word (quit to quit) :");
           
            String token = s.next();
           
            if(token.equals("quit"))
            {
                break;
            }
           
            if(token.substring(token.length() - 3).equals("est"))
            {
                count++;
            }
        }
        while(true);
       
        return count;
    }

    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        return "";
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        return 0;
    }

    /*
     * Loop Algorithm #6: Prompting until Criteria Is Met
     * prompts the user to enter a word that is alphabetically after "north"
     *        and has more than six characters
     * continues to prompt the user until the word meets the criteria
     * @return the word that meets the criteria
     */
    public static String promptUntilMatch()
    {
        return "";
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit
     * on its own line (right-most digit first).
     */
    public static void identifyDigits(int intValue)
    {
    }
}