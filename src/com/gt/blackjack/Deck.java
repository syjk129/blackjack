package com.gt.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private Random random;
	private ArrayList<Card> deck;
	private Card[] deckTemplate = {
		new Card("2-S", 2), new Card("3-S", 3), new Card("4-S", 4), 
		new Card("5-S", 5), new Card("6-S", 6), new Card("7-S", 7), 
		new Card("8-S", 8), new Card("9-S", 9), new Card("10-S", 10), 
		new Card("J-S", 10), new Card("Q-S", 10), new Card("K-S", 10), new Card("A-S", 11), 
		new Card("2-H", 2), new Card("3-H", 3), new Card("4-H", 4), 
		new Card("5-H", 5), new Card("6-H", 6), new Card("7-H", 7), 
		new Card("8-H", 8), new Card("9-H", 9), new Card("10-H", 10), 
		new Card("J-H", 10), new Card("Q-H", 10), new Card("K-H", 10), new Card("A-H", 11), 
		new Card("2-C", 2), new Card("3-C", 3), new Card("4-C", 4), 
		new Card("5-C", 5), new Card("6-C", 6), new Card("7-C", 7), 
		new Card("8-C", 8), new Card("9-C", 9), new Card("10-C", 10), 
		new Card("J-C", 10), new Card("Q-C", 10), new Card("K-C", 10), new Card("A-C", 11), 
		new Card("2-D", 2), new Card("3-D", 3), new Card("4-D", 4), 
		new Card("5-D", 5), new Card("6-D", 6), new Card("7-D", 7), 
		new Card("8-D", 8), new Card("9-D", 9), new Card("10-D", 10), 
		new Card("J-D", 10), new Card("Q-D", 10), new Card("K-D", 10), new Card("A-D", 11)};
	
	public Deck(){
		deck = new ArrayList<Card>();
		for (int i=0; i<deckTemplate.length; i++){
			deck.add(deckTemplate[i]);
		}
	}
	
	public Card deal(){
		random = new Random();
		int index = random.nextInt(deck.size());
		Card card = deck.get(index);
		deck.remove(index);
		return card;
	}
}
