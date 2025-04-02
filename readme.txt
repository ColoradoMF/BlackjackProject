###Blackjack Project

##Blackjack Project Description
This project was a solid, simple exercise to drive home object-oriented programming (OOP), giving me an opportunity to apply many key concepts we've learned at Skill Distillery during the first four weeks of this intensive cohort.

With a text based interface in the console, the player is dealt a hand of cards dealt by alternating with the dealer for the deal of each card. The player’s two cards are shown face up and the dealer receives one card face down in accordance with the rules of Blackjack.  The player is then given the option to stand or hit, that is to be dealt additional card(s) in attempting to exceed the total of the cards the dealer receives while not going over 21 points (bust).

Two Packages and Nine Classes:
The Blackjack Package within a generalized “Cards” directory contains the classes specific to the game of Blackjack including:
* Player
* Dealer
* BlackjackApplication
* BlackjackHand

A Common Package within the “Cards” directory has classes useful for reuse to create any card game:
* Deck
* Card
* Hand
* Suit
* Rank
This design allows repurposing the common classes for other card games is possible without rewriting code for those classes.

##Blackjack Project User Stories
User Story 1
Create a class structure that models a Deck of cards. Remember a Deck holds Cards, and cards are dealt to Hands which will hold the dealt cards. The Hands are attached to a Player (Dealer and Player).

User Story 2
Add methods and fields to your classes that model the functionality of shuffling and dealing a deck of cards. Remember that when a Card is dealt, the Dealer removes a card from the deck to deal to a specific player's hand.

User Story 3
Deal two hands of cards - one to a Dealer and another to a Player. As the Dealer deals a Card from the deck, the card will be placed into the Hand of either the Dealer or the Player.

User Story 4
The Dealer's decisions are based on basic BlackJack game logic in the program:
The Dealer decides to Hit or Stand based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stand (the "rule of 17").
* Your program must display the dealt cards in each player's hand (including Dealer's) per the rules of Blackjack. For example, the first round dealt looks like:
    * 1st card - face up (displayed) to Player
    * 2nd card - face down (not displayed) to Dealer
    * 3rd card - face up (displayed) to Player
    * 4th card - face up (displayed) to Dealer
* After the 1st round of cards are dealt, allow the player to Hit (add cards to their hand) or Stand (not add cards to their hand) according to how lucky the player is feeling.
* After the Player announces "Stand", then it's the Dealer's turn. Dealer abides by the "rule of 17".
* Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 (you decide).

User Story 5
Determine and display the winner of each round, where the winner is the player (either Dealer or Player) closest to 21, without going over 21.

##Lessons Learned
This project reinforced a number of programming skills, including:
* Structuring code in an object-oriented way
* Building classes with object fields
* Writing and organizing methods effectively
* Using collections to manage data
* Implementing conditionals to drive game logic

##Technologies and Concepts Used
* Extensive OOP principles
* Debugging using Eclipse
* Loops: do-while, for, foreach
* ArrayLists
* Scanner for user input
* Class instantiation and method calls

##Grading Criteria
* The program must not be contained in a single main() function—it must follow an object-oriented design.
* The game starts with both the player and dealer alternately receiving two cards.
* If either gets 21 on the deal, the game ends and the winner is declared.
* The player can hit as many times as they want until they either bust or choose to stand.
* Once the player stands, the dealer follows Blackjack’s rule of 17 to decide whether to hit or stay.
* The game ends if a player’s total card value exceeds 21.
* A winner for the hand is determined and displayed at the console.


## Code sample
```java
	public class SomeClass {


	}

```