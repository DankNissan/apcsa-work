// Lab12bv100.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.


import java.util.ArrayList;

public class Lab12bv100
{
    public static void main(String[] args)
    {   
        Deck deck = new Deck();
        System.out.println(deck);
    }
}

class Deck 
{
    private ArrayList<Card> cards;
    private int size;

    public Deck() 
    {
        size = 52;
        cards = new ArrayList<Card>();
        String[] numbers = {
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine",
                "Ten",
                "Jack",
                "Queen",
                "King",
                "Ace" };
        for (int i = 0; i < 9; i++)
        {
            cards.add(new Card("Hearts", numbers[i], i + 2));
        }
        cards.add(new Card("Hearts", numbers[9], 11));
        cards.add(new Card("Hearts", numbers[10], 11));
        cards.add(new Card("Hearts", numbers[11], 11));
        cards.add(new Card("Hearts", numbers[12], 12));
        for (int i = 0; i < 9; i++)
        {
            cards.add(new Card("Spades", numbers[i], i + 2));
        }
        cards.add(new Card("Spades", numbers[9], 11));
        cards.add(new Card("Spades", numbers[10], 11));
        cards.add(new Card("Spades", numbers[11], 11));
        cards.add(new Card("Spades", numbers[12], 12));
        for (int i = 0; i < 9; i++)
        {
            cards.add(new Card("Clubs", numbers[i], i + 2));
        }
        cards.add(new Card("Clubs", numbers[9], 11));
        cards.add(new Card("Clubs", numbers[10], 11));
        cards.add(new Card("Clubs", numbers[11], 11));
        cards.add(new Card("Clubs", numbers[12], 12));
        for (int i = 0; i < 9; i++)
        {
            cards.add(new Card("Diamonds", numbers[i], i + 2));
        }
        cards.add(new Card("Diamonds", numbers[9], 11));
        cards.add(new Card("Diamonds", numbers[10], 11));
        cards.add(new Card("Diamonds", numbers[11], 11));
        cards.add(new Card("Diamonds", numbers[12], 12));
        shuffle();
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < cards.size(); i++) {
            out += "[" + cards.get(i).getSuit() + ", " + cards.get(i).getRank() + ", " + cards.get(i).getValue() + "]\n";
        }
        return out;
    }

    private void shuffle() {
        //  int rand1; int rand2;
        for (int i = 0; i < 1000; i++) {
            int rand1 = (int) (Math.random() * 52);
            int rand2 = (int) (Math.random() * 52);
            Card temp = cards.get(rand1);
            cards.set(rand1, cards.get(rand2));
            cards.set(rand2, temp);
        }
    }
}