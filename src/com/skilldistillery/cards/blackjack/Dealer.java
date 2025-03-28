package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

// player doesn't have a deck of cards
	// no fields
	// NO getter for the deck
public class Dealer extends Player {
	
	private Deck deck;
	
	public Dealer() {
		super();
		deck = new Deck();
	}
	
	// take a card out of the deck and return it from the deck
	public Card dealCard() {
		return deck.dealCard();
	}
	
	
}
