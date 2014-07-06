package com.example.phone_book;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
		
		textview.setText("짜잔~~민예의 첫 전화번호부");
		setContentView(textview);
	}

}
