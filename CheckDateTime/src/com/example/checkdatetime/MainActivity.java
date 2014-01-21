package com.example.checkdatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView myDateTimeView;
	private Button myShowDate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myDateTimeView = (TextView)findViewById(R.id.textView1);
		myShowDate = (Button)findViewById(R.id.whatTime);
		
		myShowDate.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showCurrentDate();
			}
		});
		showCurrentDate();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void showCurrentDate() {
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy.MM.dd '/' hh:mm:ss a zzz");
		Date currentTime = new Date();
				
		myDateTimeView.setText(sdf.format(currentTime));
		
	}
}
