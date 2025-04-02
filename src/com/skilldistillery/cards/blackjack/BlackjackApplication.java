package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {
	
	// Only fields necessary for MVP functionality
	// No DECK TYPE VARIABLES in app class - dealer has the deck
	private Scanner sc;
	private Dealer dealer;
	private Player player;
	
	public BlackjackApplication() {
		this.dealer = new Dealer();
		this.player = new Player();
	}
	
	public static void main(String[] args) {
		new BlackjackApplication().launchGame();
		
	}
	
	public void launchGame() {
		this.sc = new Scanner(System.in);
		System.out.println("      =====  Blackjack  =====");
		System.out.println("Welcome to the Blackjack table player!");
		System.out.println("Cards are now shuffled and being dealt.");
		System.out.println();
		
		player.hand.addCard(dealer.dealCard());
		dealer.hand.addCard(dealer.dealCard());
		System.out.println("Dealer's one face up card shows:");
		dealer.displayHand();
		System.out.println();
		
		player.hand.addCard(dealer.dealCard());
		dealer.hand.addCard(dealer.dealCard());
	
		System.out.println("Player's two face up cards totaling " + player.getHandValue() + " are:");
		player.displayHand();
		System.out.println();
	
		if (player.hand.isBlackjack() && dealer.hand.isBlackjack()) {
			System.out.println("\nTie! Player and Dealer each have Blackjack!");
		 	return;
		} else if (player.hand.isBlackjack()) {
			System.out.println("\nPlayer dealt Blackjack WINS!");
			return;
		} else if (dealer.hand.isBlackjack()) {
			System.out.println("\nDealer dealt Blackjack wins.");
			return;
		}
		
		boolean playerHandIsBust = false;
		boolean gotResponse = false;
		do {
			System.out.println("Press h for hit or s to stand, then press return.\n");
			String hitOrStay = sc.next();
			sc.nextLine();
			
			if (hitOrStay.equalsIgnoreCase("h")) {
				player.hand.addCard(dealer.dealCard());
				System.out.println("\nYour hit card & hand are now total : " + player.getHandValue() );
				player.displayHand();
				if (player.getHandValue() > 21 ) {
					System.out.println("Player busted & dealer won.");
					playerHandIsBust = true;
					break;
				}
				
			} else if (hitOrStay.equalsIgnoreCase("s")) {
				System.out.println("\nPlayer stands on " );
				System.out.println(player.getHandValue());
				break;
			} else {
				gotResponse = false;
				continue;
			}
		} while (gotResponse = true);
		
		
		if (!playerHandIsBust) {
			while (dealer.getHandValue() < 17) {
				System.out.println("Dealer hits on 16 or less.");
				dealer.hand.addCard(dealer.dealCard());
				dealer.displayHand();
				System.out.println("Dealer's hand now totals: " + dealer.getHandValue() + "\n");
			}
			
			if (dealer.getHandValue() > 21) {
				System.out.println("The dealer busted! Player wins!\n");
			}
			else {
				int playerScore = player.getHandValue();
				int dealerScore = dealer.getHandValue();
				
				System.out.println("Dealer's cards total: " + dealerScore + "\n");
				System.out.println("Dealer's cards are:");
				dealer.displayHand();
				System.out.println();
				
				System.out.println("Player's cards total: " + playerScore + "\n");
				System.out.println("Player's cards are:");
				player.displayHand();
				System.out.println();
				
				
				if (playerScore > dealerScore) {
					System.out.println("You won this hand, player!");
				}
				else if (playerScore < dealerScore) {
					System.out.println("The dealer won this hand.");
				}
				else {
					System.out.println("This hand is a tie.");
				}
				
			}
		}
	}
}