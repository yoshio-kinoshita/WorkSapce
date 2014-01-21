package com.example.singletouchsample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MainView extends View{
	
	private String touchState;
	private int touchX;
	private int touchY;

	public MainView(Context context) {
		super(context);
		
		touchState = "";
		touchX = 0;
		touchY = 0;
		
		setBackgroundColor(Color.rgb(255, 255, 255));
	}
	
	protected void onDraw(Canvas canvas) {
		
		Paint p = new Paint();
		p.setAntiAlias(true);
		
		p.setTextSize(32.0f);
		
		p.setColor(Color.rgb(0, 0, 0));
		
		canvas.drawText("TouchState:" + touchState, 8, 40, p);
		canvas.drawText("(" + touchX + ", " + touchY + ")", 8, 80, p);
	}
	
	public void setTouchXY(int x, int y) {
		touchX = x;
		touchY = y;
	}
	
	public void setTouchState(String state) {
		touchState = state;
		
	}
}
