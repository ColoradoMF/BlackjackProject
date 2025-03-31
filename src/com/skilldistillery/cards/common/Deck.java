//Create a class Deck. It will hold a List of Cards.
//In the constructor, initialize the List with all 52 cards.
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.

// Someone calls for a new deck, 
// deck provides a new deck of cards with appropriate number of each suit and rank

package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//DO NOT GENERATE A GETTER FOR CARDS CLASS - CLASS KEEPS THE CARDS PRIVATE BY DESIGN 

	private List <Card> cards;
	
	public Deck() {				// No Arg CONSTRUCTOR
		// instantiate a list 
		cards = new ArrayList<>(52);
		// Iterate over Enums to get 13 cards for each of the suits (1 of each rank).
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card card = new Card(rank, suit);
				cards.add(card);
			}
			
		}
		
		// like in Hoppper Class's drawBall method
		// while (CheckDeckSize > 0), 
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	// Deal the "top" card (index 0)
	public Card dealCard() {
		if(checkDeckSize() < 1) {
			return null;
		}
		return cards.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
}