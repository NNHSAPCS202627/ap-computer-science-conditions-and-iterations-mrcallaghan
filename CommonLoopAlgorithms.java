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
        int fourPlus = 0;

        System.out.print("enter a word ('quit' to stop): ");
        String word = s.next();

        while (!word.equals("quit")) {
            if (word.length() > 4) {
                fourPlus++;
            } else {
                System.out.println("4 or less");
            }

            System.out.print("enter a word ('quit' to stop): ");
            word = s.next();
        }

        return fourPlus;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        return 0;
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
        int counter = 0;
        String input = "";
        System.out.println("enter a word (quit to quit):");
        do
        {
            if (s.hasNextInt() || s.hasNextDouble())
            {
                input = s.next();
                System.out.println("\"" + input +"\" is not a word! Try again.");

                continue;
            }

            input = s.next();

            if (input.toLowerCase().equals("quit"))
            {
                break;
            }

            if (input.length() > 3 && input.toLowerCase().substring(input.length()-3).equals("est"))
            {
                counter += 1;
            }

        }
        while(!input.toLowerCase().equals("quit"));

        return counter;
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
        String current = "";
        String last = "";
        int count = 0;
        do {
            Scanner s = new Scanner(System.in);
            last = current;
            System.out.println("Enter word: ");
            current = s.next();
            count ++;
            System.out.println(last);
            System.out.println(current);
        } while (!(current.equals(last)));
        count --;
        System.out.println(count);
        return count;
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