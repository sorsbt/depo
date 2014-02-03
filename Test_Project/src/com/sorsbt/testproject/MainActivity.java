package com.sorsbt.testproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DoSomething();
	}

	/*
	 * 
	 * Test Void for git
	 * 
	 **/
	
	private void DoSomething(){
		//TODO: Our code comes here...
		Toast.makeText(getApplicationContext(), "hrehe", 1000).show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
