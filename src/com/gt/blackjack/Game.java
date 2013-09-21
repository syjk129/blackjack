package com.gt.blackjack;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Game extends Activity{
	
	Player player; 
	Button bBet1, bBet5, bBet25, bBet100;
	Button bHit, bStand, bClear;
	TextView tvPot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_game);
		player = new Player("Sung"); //DELETE
		updateTitle();
		init();
		
	}
	
	private void updateTitle(){
		setTitle(player.getName() + " : $ " + player.getMoney());
	}
	
	private void init(){
		tvPot = (TextView) findViewById(R.id.tvPot);
		bHit = (Button) findViewById(R.id.bHit);
		bStand = (Button) findViewById(R.id.bStand);
		bClear = (Button) findViewById(R.id.bClear);
		bBet1 = (Button) findViewById(R.id.bBet1);
		bBet5 = (Button) findViewById(R.id.bBet5);
		bBet25 = (Button) findViewById(R.id.bBet25);
		bBet100 = (Button) findViewById(R.id.bBet100);
	}

}
