package com.herrbert74.aanpe;

import android.os.Bundle;
import android.view.Menu;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;

@EActivity(resName="activity_main")
public class MainActivity extends com.herrbert74.aanpelib.MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@AfterViews
	public void afterViews(){
		hello.setText("why?");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
