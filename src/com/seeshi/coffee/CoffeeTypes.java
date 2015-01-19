package com.seeshi.coffee;

import android.app.Activity;
import android.os.Bundle;

public class CoffeeTypes extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  
	  int incomingPosition = getIntent().getIntExtra("position",-1);
	  
	  if(incomingPosition != -1) {
		  if(incomingPosition == 0){
			  setContentView(R.layout.americano);
		  }
		  else if(incomingPosition == 1){
			  setContentView(R.layout.breve);
		  }
		  else if(incomingPosition == 2){
			  setContentView(R.layout.black);
		  }
		  else if(incomingPosition == 3){
			  setContentView(R.layout.cafeaulait);
		  } 
		  else if(incomingPosition == 4){
			  setContentView(R.layout.melange);
		  } 
		  else if(incomingPosition == 5){
			  setContentView(R.layout.mocha);
		  } 
		  else if(incomingPosition == 6){
			  setContentView(R.layout.latte);
		  } 
		  else if(incomingPosition == 7){
			  setContentView(R.layout.macchiato);
		  } 
		  else if(incomingPosition == 8){
			  setContentView(R.layout.cappuccino);
		  } 
		  else if(incomingPosition == 9){
			  setContentView(R.layout.carajillo);
		  } 
		  else if(incomingPosition == 10){
			  setContentView(R.layout.coole);
		  } 
		  else if(incomingPosition == 11){
			  setContentView(R.layout.eiskaffee);
		  } 
		  else if(incomingPosition == 12){
			  setContentView(R.layout.flatwhite);
		  } 
		  else if(incomingPosition == 13){
			  setContentView(R.layout.galao);
		  } 
		  else if(incomingPosition == 14){
			  setContentView(R.layout.iced);
		  } 
		  else if(incomingPosition == 15){
			  setContentView(R.layout.irish);
		  }
		  }
	}
	  
}

