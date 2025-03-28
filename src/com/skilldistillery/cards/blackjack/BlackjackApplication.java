package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {
	
	// Only fields needed for MVP
	// No DECK TYPE VARIABLES - dealer has the deck
	private Scanner sc;
	private Dealer dealer;
	private Player player;
	
	public BlackjackApplication() {
		this.sc = new Scanner(System.in);
		this.dealer = new Dealer();
		this.player = new Player();
	}
	
	public static void main(String[] args) {
		new BlackjackApplication().launch();
		
	}
	
	public void launch() {
		
	}
	
	// lots left to do here
	// what other things need to do

}
