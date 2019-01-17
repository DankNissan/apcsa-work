// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09b
{
    private static int num1,den1,num2,den2;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r1 = new Rational(num1,den1);
        Rational r2 = new Rational(num2,den2);
        Rational r3 = new Rational();
        
        r3.divide(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + " = " + r3.getReduced());
        r3.multiply(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getReduced());
        r3.add(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + " = " + r3.getReduced());
        r3.subtract(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + " = " + r3.getReduced());
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 1st numerator ----> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the 1st denominator --> ");
        den1 = input.nextInt();
        System.out.print("\nEnter the 2nd numerator ----> ");
        num2 = input.nextInt();
        System.out.print("\nEnter the 2nd denominator --> ");
        den2 = input.nextInt();
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
    
    public Rational()
    {
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
    
    public void divide(Rational r1, Rational r2)
    {
        firstNum = r1.getNum() * r2.getDen();
        firstDen = r1.getDen() * r2.getNum();
    }
    
    public void multiply(Rational r1, Rational r2)
    {
        firstNum = r1.getNum() * r2.getNum();
        firstDen = r1.getDen() * r2.getDen();
    }
    
    public void add(Rational r1, Rational r2)
    {
        int commonMult = r1.getDen() * r2.getDen();
        firstNum = (r1.getNum() * (commonMult / r1.getDen())) + (r2.getNum() * (commonMult / r2.getDen()));
        firstDen = commonMult;
    }
    
    public void subtract(Rational r1, Rational r2)
    {
        int commonMult = r1.getDen() * r2.getDen();
        firstNum = (r1.getNum() * (commonMult / r1.getDen())) - (r2.getNum() * (commonMult / r2.getDen()));
        firstDen = commonMult;
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
