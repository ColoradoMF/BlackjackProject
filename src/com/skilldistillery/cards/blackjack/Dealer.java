package com.skilldistillery.cards.blackjack;

import java.util.Collections;

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
		deck.shuffle();
		// dealer shuffles the deck (method call is in Dealer class) 
	}
	
	// take a card out of the deck and return it from the deck
	public Card dealCard() {
		return deck.dealCard();
	}
	
	
}
