// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment. 

public class Lab11bst
{
    public static void main(String[] args)
    { 
      Deck deck = new Deck();
      System.out.println(deck);
    }
}


class Deck 
{
    private Card[] cards;
    private int size;

    public Deck() 
    {
        size = 52;
        cards = new Card[size];
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
        for (int i = 0; i < 52; i++) cards[i] = new Card("Spades", "Ace", 11);
        for (int i = 0; i < 13; i++)
        {
          cards[i].setSuit("Clubs");
          cards[i].setRank(numbers[i]);
          if (i < 9) cards[i].setValue(i + 2);
          else if (i < 12) cards[i].setValue(10);
          else cards[i].setValue(11);
        }
        for (int i = 0; i < 13; i++)
        {
          cards[i + 13].setSuit("Diamonds");
          cards[i + 13].setRank(numbers[i]);
          if (i < 9) cards[i + 13].setValue(i + 2);
          else if (i < 12) cards[i + 13].setValue(10);
          else cards[i + 13].setValue(11);
        }
        for (int i = 0; i < 13; i++)
        {
          cards[i + 26].setSuit("Hearts");
          cards[i + 26].setRank(numbers[i]);
          if (i < 9) cards[i + 26].setValue(i + 2);
          else if (i < 12) cards[i + 26].setValue(10);
          else cards[i + 26].setValue(11);
        }
        for (int i = 0; i < 13; i++)
        {
          cards[i + 39].setSuit("Spades");
          cards[i + 39].setRank(numbers[i]);
          if (i < 9) cards[i + 39].setValue(i + 2);
          else if (i < 12) cards[i + 39].setValue(10);
          else cards[i + 39].setValue(11);
        }
        shuffle();
    }
  
    public String toString() {
        String out = "";
        for (Card card: cards) {
            out += "[" + card.getSuit() + ", " + card.getRank() + ", " + card.getValue() + "]\n";
        }
        return out;
    }
    
    private void shuffle() {
      //  int rand1; int rand2;
        for (int i = 0; i < 1000; i++) {
            int rand1 = (int) (Math.random() * 52);
            int rand2 = (int) (Math.random() * 52);
            Card temp = cards[rand1];
            cards[rand1] = cards[rand2];
            cards[rand2] = temp;
        }
    }
}
