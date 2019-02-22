// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;
import java.text.DecimalFormat;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound  ===>>  ");
        final int MAX = input.nextInt();
        boolean primes[]= new boolean[MAX + 1];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int i = 2; i < primes.length; i++)
        {
            primes[i] = true;
            //displayPrimes(primes);
        }
        displayPrimes(primes);
        primes[0] = false;
        for (int i = 2; i < primes.length; i++)
        {
            if (primes[i])
            {
                for (int j = i * 2; j < primes.length; j+=i)
                    primes[j] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        DecimalFormat format = new DecimalFormat("0000");
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + (primes.length - 1));
        System.out.println();
        
        int count = 0;
        for (int i = 0; i < primes.length; i++)
        {
            if (primes[i])
            {
                System.out.print((format.format(i)) + " ");
                count += 1;
                if ((count) % 15 == 0) System.out.println();
            }
        }
    }

}



