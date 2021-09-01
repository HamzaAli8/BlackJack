package hamza.blackjack;

import java.util.Scanner;

public class Player {

    String name;
    Hand hand;
    int potValue;
    int bet;
    private int gamesPlayed;
    private int gamesWon;


    public Player(String name){

        this.name = name;

        this.potValue = 100;

        hand = new Hand();
    }

    public Player() {

        hand = new Hand();
    }


    public int countNumCards(){

        int count = 0;

        for(Card b: hand.cards){

            count++;
        }

        return count;
    }

    public void printHand() {
        System.out.print("| ");
        for(Card c: hand.cards){

            System.out.print(c.toString() + " | ");
        }
    }

    public void compPrintHand(){

        System.out.println( hand.cards.get(0).toString() +
                " and [Hidden] ");
    }



    public boolean computerAI(){
        hand.calculateScore();
        return hand.handValue < 17;

    }

    /**
     * This method works by ensuring that the user inputs the correct value amount in
     * their bets and to input the correct data (integer).
     */

    public void handleBet() {
        bet = -1;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pot: $" + potValue + "\nHow much would you like to bet?");
            try {
                bet = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Please enter a valid integer");
            }
            if (bet > potValue){

                System.out.println("Please enter value less than or equal to "+ potValue);
            }
        } while (bet > potValue || bet == -1);
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    @Override
    public String toString() {
        return "potValue =" + potValue +
                '}';
    }


}
