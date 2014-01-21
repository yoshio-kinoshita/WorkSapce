package com.example.singletouchsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;

public class SingleTouchSample extends Activity {
	
	private MainView mainView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mainView = new MainView(this);
//		setContentView(R.layout.activity_single_touch_sample);
		setContentView(mainView);
	}
	
	public boolean onTouchEvent(MotionEvent event) {
		
		int x = (int)event.getX();
		int y = (int)event.getY();
		
		mainView.setTouchXY(x, y);
		
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			mainView.setTouchState("Down");
			break;
		case MotionEvent.ACTION_UP:
			mainView.setTouchState("UP");
			break;
		case MotionEvent.ACTION_MOVE:
			mainView.setTouchState("MOVE");
			break;
		}
		
		mainView.invalidate();
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.single_touch_sample, menu);
		return true;
	}

}
