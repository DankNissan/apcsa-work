// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15avst
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
        magic.checkRows();          // for 100 & 110 Point Version Only
        magic.checkColumns();        // for 100 & 110 Point Version Only
        magic.checkDiagonals();      // for 100 & 110 Point Version Only
    }
}

class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
    }

    public void computeMagicSquare()
    {
        int squareX = size / 2 + 1; int squareY = 1;
        for (int i = 1; i <= size * size; i++)
        {
            //System.out.println(i);
            magic[squareY - 1][squareX - 1] = i;
            if (i % 5 == 0)
            {
                squareY += 1;
            }
            else
            {
                squareX += 1; squareY -= 1;
            }
            if (squareX > size) squareX = 1;
            if (squareY == 0) squareY = size;
        }
    }

    public void displayMagicSquare()
    {
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        System.out.println();
        for (int row[] : magic)
        {
            for (int x : row)
            {
                System.out.print(output.format(x) + " ");
            }
            System.out.println();
        }
    }

    public void checkRows()
    {
        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("================");
        System.out.println();
        for (int row[] : magic)
        {
            int sum = 0;
            String out = "";
            for (int x : row)
            {
                out += output.format(x) + "+";
                sum += x;
            }
            out = out.substring(0, out.length() - 1);
            out += " = " + sum;
            System.out.println(out);
        }
    }

    public void checkColumns()
    {
        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("================");
        System.out.println();
        for (int i = 0; i < size; i++)
        {
            int sum = 0;
            String out = "";
            for (int[] column : magic)
            {
                out += output.format(column[i]) + "+";
                sum += column[i];
            }
            out = out.substring(0, out.length() - 1);
            out += " = " + sum;
            System.out.println(out);
        }
    }

    public void checkDiagonals()
    {
        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("==================");
        System.out.println();
        int sum = 0; String out = "";
        for (int i = 0; i < 5; i++)
        {
            out += output.format(magic[i][i]) + "+";
            sum += magic[i][i];
        }
        out = out.substring(0, out.length() - 1);
        out += " = " + sum;
        System.out.println(out);
        sum = 0; out = "";
        for (int i = 0; i < 5; i++)
        {
            out += output.format(magic[4-i][4-i]) + "+";
            sum += magic[4-i][4-i];
        }
        out = out.substring(0, out.length() - 1);
        out += " = " + sum;
        System.out.println(out);
    }

}

