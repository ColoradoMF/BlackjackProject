	// print each card in a list
	// before start looping, skip the first one
	// one card to player tell 
	// one card to dealer face down
	// one card to player face up
	// one card to dealer face up
	
	//	player tell if want to hit 
	
	// public void printHand();

package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	// NO FIELDS in this class, they're in the super class so visible to this class
	
	public BlackjackHand() {
	}
	
	@Override
	public int getHandValue() {
		int value = 0;
		for (Card card : cardsInHand) {
			value = value + card.getCardValue();
		}
		return value;
	}
	
	public boolean isBlackjack() {
		if(getHandValue() == 21) {
			return true;
		}
		return false;
	}
	
	public boolean isBust() {
		if(getHandValue() > 21) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String output = "";
		for (Card card : cardsInHand) {
			output = output + card.toString();
		}
		return output;
	}

}