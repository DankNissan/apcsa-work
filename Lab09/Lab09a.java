// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09a
{
    private static int num, den;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
            System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}



class Rational
{
    int firstNum,firstDen,reducedNum,reducedDen;
    double decimal;
    
    public Rational(int n,int d)
    {
        firstNum = n;
        firstDen = d;
        decimal = 1.0 * firstNum / firstDen;
    }
    
    public int getNum()
    {
        return firstNum;
    }
    
    public int getDen()
    {
        return firstDen;
    }
    
    public double getDecimal()
    {
        return decimal;
    }
    
    public void reduce()
    {
        int gcf = getGCF(firstNum,firstDen);
        reducedNum = firstNum / gcf;
        reducedDen = firstDen / gcf;
    }
    
    public String getOriginal()
    {
        return "" + firstNum + "/" + firstDen;
    }
    
    public String getReduced()
    {
        reduce();
        return "" + reducedNum + "/" + reducedDen;
    }
    
    public void displayData()
    {
        System.out.println();
        System.out.print(getOriginal() + " equals " + getDecimal());
        System.out.print(" and reduces to " + getReduced());
        System.out.println();
    }

    public int getGCF(int n1,int n2)
    {
        int rem = 0;
        int gcf = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
        return gcf;
    }
}
