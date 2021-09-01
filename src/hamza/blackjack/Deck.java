package hamza.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    ArrayList<Card> deck;
    ArrayList<Integer> usedCards;
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

    public Deck(){

        deck = new ArrayList<Card>();
        createDeck();
        usedCards = new ArrayList<Integer>();
    }

    /**
     * This method loops through both the suits and ranks, then sequential adds them to the deck. A card object
     * is created and then added onto the deck.
     */

    public void  createDeck(){

        for (char suit: suits){

            for (String rank: ranks){

                deck.add(new Card(suit,rank));
            }
        }
    }

    public String toString(){
        String deckCard = "";
        int i = 1;
        for(Card aCard: deck){

            deckCard += "\n" + i + "-" + aCard.toString();
            i++;
        }
        return deckCard;
    }

    /** This method works by dealing a set of random cards to a player (user or computer). It takes a player
     * object as a parameter and deals that a object cards from deck.
     *
     * @param player
     */

    public void deal(Player player){

        Random r = new Random();

        int num = r.nextInt(52);

        while (usedCards.contains(num)){

            num = r.nextInt(52);
        }
        usedCards.add(num);

        player.hand.cards.add(deck.get(num));
    }


}
