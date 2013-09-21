package com.gt.blackjack;

public class Player {
	
	private String name;
	private int money;
	
	public Player(String name){
		this.name = name;
		this.money = 300;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMoney(){
		return money;
	}
	
	public boolean canBet(int amount){
		if (money >= amount){
			return true;
		} else {
			return false;
		}
	}
	
	public void bet(int amount){
		money -= amount;
	}
	
	public void win(int pot){
		money += pot;
	}
	
}
