package com.seeshi.coffee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Browse extends ListActivity{

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);

	  String[] coffeeTypes = getResources().getStringArray(R.array.coffeeTypes);
	  setListAdapter(new ArrayAdapter<String>(this, R.layout.listview, coffeeTypes));

	  ListView mylv = getListView();
	  mylv.setTextFilterEnabled(true);

	  mylv.setOnItemClickListener(new OnItemClickListener() {
	    public void onItemClick(AdapterView<?> parent, View view,
	        int position, long id) {
	    	
	    	Intent myIntent = new Intent(Browse.this, CoffeeTypes.class);
	        myIntent.putExtra("position", position);
	        startActivity(myIntent);

	    }
	  });
	}
}
