package com.seeshi.coffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends Activity {
    /** Called when the activity is first created. */

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button myButton = (Button)findViewById(R.id.button1);
        
        myButton.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
             startActivity(new Intent(Start.this, Browse.class));
            }
            });
    }
}