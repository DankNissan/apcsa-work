// Lab08v100.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08v100
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   // used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        }
        while (notFinished);
    }
}


class Palindrome
{
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
     * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
     */
    public static boolean isPal(String s)
    {
        if (s.equals(""))
            return false;
        String compare = "";
        String pal = s.toLowerCase();
        int length = pal.length();
        int i;
        for (i = 0; i < length; i++) {
            if (!(isLetter(pal.substring(length - i - 1, length - i))))
                return false;
            compare = compare + pal.substring(length - i - 1, length - i);
        }
        if (compare.equals(pal))
            return true;
        return false;
    }  

    /*
     * Precondition:  s is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static boolean isLetter(String letter)
    {
        if (letter.compareTo("a") >= 0 && letter.compareTo("z") <= 0)
            return true;
        return false;
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static String purge(String s)
    {
        String lower = s.toLowerCase();
        lower = lower.trim();
        int length = lower.length();
        String out = "";
        int i;
        for (i = 0; i < length; i++)
            if (isLetter(lower.substring(i, i + 1)))
                out = out + lower.substring(i, i + 1);
//        System.out.println(out);
        return out;
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        if (isPal(s))
            return false;
        String compare = "";
        String purged = purge(s);
        String temp = purged;
        if (temp.equals(""))
            return false;
        int length = purged.length();
        int i;
        for (i = 0; i < length; i++)
            compare = compare + purged.substring(length - i - 1, length - i);
        if (compare.equals(temp))
            return true;
        return false;      // This statement is provided to allow initial compiling.
    }

}

