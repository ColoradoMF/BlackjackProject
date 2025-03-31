package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {
	// Player HAS-A hand so no fields used here 
	// NO getter for the hand
	protected BlackjackHand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	// method for player to hit
	// put card into hand with add.Card
	public void hit(Card card) {
		this.hand.addCard(card); // this not necessary but shows difference between local  
		
	}
	
	public int getHandValue() {
		// get from call to BlackjackHand.java
		return hand.getHandValue();
	}
	
	//what other methods does the player need?
	public void displayHand() {
		System.out.println(hand);
	}
	
	
}
