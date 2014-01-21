package com.example.mapviewsample;

import android.os.Bundle;
import android.view.Menu;

import com.google.android.maps.MapActivity;

public class MapViewSample extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_view_sample);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.map_view_sample, menu);
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}

}
