package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	// DO NOT use a getter in cardsInHand
	
	protected List<Card> cardsInHand;
	
	public Hand() {
		cardsInHand = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cardsInHand.add(card);
	}

	public void clear() {
		// also can use cardsInHand = ArrayList<>();
		cardsInHand.clear();
	}
	
	public abstract int getHandValue();
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cardsInHand=").append(cardsInHand).append("]");
		return builder.toString();
	}
	
}
