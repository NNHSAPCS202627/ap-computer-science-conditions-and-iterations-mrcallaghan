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
        int count = 0;
        String word;
        System.out.println("Enter a word (enter quit to end)");
        do
        {
            word = s.next();
            if (!word.equals("quit") && word.length() > 4)
            {
                count ++;
            }
        }
        while (!word.equals("quit"));
        return count;
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
        int words = 0;
        String word = "";
        while (!(word.equals("quit"))) {
            System.out.print("Enter a word (quit to exit)");
            word = s.next();
            if ((word.substring(0,3)).equals("con")) {
                words++;
            }
        }

        return words;
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

        String word = "";

        System.out.print("Enter suffix: ");
        String suffix = s.nextLine();

        while (!word.equals("0"))
        {
            System.out.print("Enter word (0 to stop): ");
            word = s.nextLine();
            if (!word.equals("0"))
            {
                if (word.length() >= suffix.length())
                {
                    if (word.substring(word.length() - suffix.length(), word.length()).equals(suffix))
                    {
                        count++;
                    }
                }
                else
                {
                    System.out.println("Word too short!");
                }
            }
        }
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
        Scanner s = new Scanner(System.in);
        System.out.println("enter a word: ");
        String str = s.next();
        String finalStr = "";
        for (int i = 0; i < str.length(); i++) {
            finalStr += str.substring(str.length() - 1 - i, str.length() - i);
        }
        return finalStr;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        int numUniques = 0;
        String str1 = "";
        String str2 = "";
        do
        {
            if (numUniques % 2 == 0) {
                System.out.print("\nEnter a string: ");
                str1 = s.next();
                numUniques++;
            } else {
                System.out.print("\nEnter a string: ");
                str2 = s.next();
                numUniques++;
            }
        }
        while (!str1.equals(str2));
        return numUniques - 1;
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
        String n = "north";
        String s;
        Scanner s1 = new Scanner(System.in);
        do
        {
            System.out.print("Enter a string that is alphabetically after north and has more than six characters: ");
            s = s1.next();
        }
        while (!((s.compareTo(n) > 0)&&(s.length() >= 6)));
        return s;
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