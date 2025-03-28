package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	// no fields
	// NO getter for the hand
	protected BlackjackHand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	// method for player to hit
	// put card into hand with add.Card
	public void hit(Card card) {
		this.hand.addCard(card);
		
	}
}
