package hamza.blackjack;

import java.util.ArrayList;

public class Hand {


    ArrayList<Card> cards;
    int handValue;

    public Hand(){

        cards = new ArrayList<Card>();
    }

    /**
     * This method works by calculating the score of each player and their respective
     * total value of their dealt hand and returns an integer value. For an extra degree of functionality
     * if a player has an ace the number of aces are accounted for and the value of that ace
     * is determined by the number of aces. The ace can have a value of 1 or 11.
     *
     * In my method since an ace returns a value of 1 automatically, to get to 11 you increment that ace
     * by 10 depending on the number of aces in the hand. Otherwise nothing is added if there is more than one ace.
     * @return
     */

    public int calculateScore()
    {
        boolean hasAce = false;
        handValue= 0;
        for(Card c: cards){

            handValue = c.getCardValue() + handValue;

            if(c.rank == "Ace"){

                if(!hasAce) {
                    handValue += 10;
                    hasAce = true;
                }else {
                    handValue += 0;
                }
            }
        }
        return handValue;
    }


    public boolean checkHandValue(){

        if (handValue > 21){

            return true;
        }

        else return false;
    }


}
