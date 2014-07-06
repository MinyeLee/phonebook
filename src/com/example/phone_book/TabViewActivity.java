package com.example.phone_book;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings({ "unused", "deprecation" })
public class TabViewActivity extends TabActivity{

	private static final String HOME = "HOME";
	private static final String LIST = "LIST";
	private static final String ABOUT = "ABOUT";
	private static final String EPILOGUE = "EPILOGUE";
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = getTabHost();
		
		TabHost.TabSpec homespec = tabHost.newTabSpec(HOME);
		Intent intent1 = new Intent(this, Home.class);
		homespec.setContent(intent1);

		homespec.setIndicator("HOME");
		
		TabHost.TabSpec listspec = tabHost.newTabSpec(LIST);
		listspec.setContent(new Intent().setClass(this, MyList.class));
		
		listspec.setIndicator("LIST");
		
		TabHost.TabSpec aboutspec = tabHost.newTabSpec(ABOUT);
		aboutspec.setContent(new Intent().setClass(this, Detail.class));
		
		aboutspec.setIndicator("ABOUT");
		
		TabHost.TabSpec epiloguespec = tabHost.newTabSpec(EPILOGUE);
		epiloguespec.setContent(new Intent().setClass(this, Map.class));
		
		epiloguespec.setIndicator("SITE");
		
		tabHost.addTab(homespec);
		tabHost.addTab(listspec);
		tabHost.addTab(aboutspec);
		tabHost.addTab(epiloguespec);
		//intent = new Intent().setClass(this, MainActivity.class);
		

		tabHost.setCurrentTab(0);
	}
}