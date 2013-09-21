package com.gt.blackjack;

public class Card {
	
	private String id;
	private int value;
	
	public Card(String id, int value){
		this.id = id;
		this.value = value;
	}
	
	public String getID(){
		return id;
	}
	
	public int getValue(){
		return value;
	}
	
}
