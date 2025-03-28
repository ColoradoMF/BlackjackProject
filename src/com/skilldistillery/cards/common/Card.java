//Create a class called Card.
//
//A card has a Suit and Rank. Set these in the constructor.
//Generate the methods hashCode and equals
//Add a toString which says rank + " of " + suit.
//Add a method getValue to return the card's numeric value.

//Put in the following order:
// fields
// CTORS (constructors)
// Getters/setters
// other methods

// Equals & Hashcode
// to String

package com.skilldistillery.cards.common;

import java.util.Objects;

public class Card {
	
	//Card has Suit and a Rank (field that encapsulates rank/suit not "is-a" that extends by inheritance)
	// set in a constructor for each:
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	// method to return card's numeric value (the card's rank). 
	public int getCardValue() {
		return rank.getValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [rank=").append(rank).append(", suit=").append(suit).append("]");
		return builder.toString();
	}

}
