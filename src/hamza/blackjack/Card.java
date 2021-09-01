package hamza.blackjack;

public class Card {

    char suit;
    String rank;


    public Card(char suit, String rank) {

        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {

        String card = rank + suit;

        return card;
    }

    /**
     * This method looks at the 'rank' value of a card and returns an int value corresponding to the rank.
     * @return
     */

    public int getCardValue() {

        switch (rank) {

            case "Ace":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "Jack":
                return 10;
            case "Queen":
                return 10;
            case "King":
                return 10;

            default: return 0;
        }
    }


}
