# BlackJack 

This a text based BlackJack game. The game is a simplified version to the one described in 
(https://en.wikipedia.org/wiki/Blackjack) . The objective of the game is to beat the dealer,
which can be done in the following number of ways:


* Get 21 points on the player's first two cards (known as a blackjack), as long
  as the dealer does not also get blackjack
* Reach a final score higher than the dealer without exceeding 21
* Let the dealer draw additional until his hand exceeds 21.

This game is implemented by using a standard 52 card deck, the player has
two options  whether to stand or hit.

* **Hit:** Take another card from dealer
* **Stand:** Player decides to take no more cards,the dealer then draws.



The dealer hits until his cards total 17 or more points

The player is paid in 1:1 ratio, for every dollar placed as a bet he receives the
same in return.

* A blackjack beats any hand that is not a blackjack, even one with a value of 21.
* In the case of a tied score known as push, here the bets are normally returned
without any adjustment to the pot.
  
***

# How to run the game

Download the folder and run the BlackJackController_Final.java file contained inside the
src directory. The game was built using Java 8.9.1 on IntelliJ (2021.2)



## Sample output of program



```
Hi welcome to BlackJack, please enter your name: 
Hamza
Pot: $100
How much would you like to bet?
150
Please enter value less than or equal to 100
Pot: $100
How much would you like to bet?
20
Here are your first 2 cards:
3♠ | 4♦ | 
Your hand is valued at:  7
Dealer cards: 
Jack♠ and [Hidden] 
Would user like another card? (Y/N)
y
3♠ | 4♦ | 10♥ | Your hand is valued at :17
Would user like another card? (Y/N)
y
3♠ | 4♦ | 10♥ | Jack♥ | Your hand is valued at :27
Bust! Hand currently valued at:27
Dealer wins
Number of games played: 1
Number of games won:  0
Dealer score: 20
Jack♠ | 10♠ | 
Your score :27
3♠ | 4♦ | 10♥ | Jack♥ | 
Would you like to play another game? (Y/N)
y
Pot: $80
How much would you like to bet?
70
Here are your first 2 cards:
Queen♦ | 2♠ | 
Your hand is valued at:  12
Dealer cards: 
King♣ and [Hidden] 
Would user like another card? (Y/N)
y
Queen♦ | 2♠ | 2♣ | Your hand is valued at :14
Would user like another card? (Y/N)
y
Queen♦ | 2♠ | 2♣ | 9♥ | Your hand is valued at :23
Bust! Hand currently valued at:23
PUSH
Number of games played: 2
Number of games won:  0
Dealer score: 25
King♣ | 5♠ | King♠ | 
Your score :23
Queen♦ | 2♠ | 2♣ | 9♥ | 
Would you like to play another game? (Y/N)
n
Thanks for playing!
Well done you leave with $80

```