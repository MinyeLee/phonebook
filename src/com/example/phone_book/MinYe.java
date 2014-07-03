package com.example.phone_book;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.ListView;


public class MinYe extends Activity{

	private ListView listview1;
	//private LazyAdapter adapter;
	private List<MyStory>  list1;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.minye);
		listview1 = (ListView)findViewById(R.id.list1);
		list1 = new ArrayList<MyStory>();
		setList();
			// adapter = new LazyAdapter(this, list);
		listview1.setAdapter(new MinyeAdapter(this, list1));
			//adapter.notifyDataSetChanged();
		
		}
	private void setList()
	{
			
			list1.add(new MyStory(R.drawable.first, R.drawable.second, R.drawable.third, R.drawable.fourth, R.drawable.six, R.drawable.five, R.drawable.seven, R.drawable.eight,"미국가다.." ," 이민예의바른", "전산전자 - 컴공심화", "벧엘410호", R.drawable.mymap));
	  		
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /*OnItemClickListener listViewExampleClickListener = new OnItemClickListener()
    {
    public void onItemClick(AdapterView<?> parentView, View clickedView, int position, long id)
    {
        String toastMessage = ((TextView) clickedView).getText().toString() + " is selected. position is " + position + ", and id is " + id;

        Toast.makeText(
            getApplicationContext(),
            toastMessage,
            Toast.LENGTH_SHORT
        ).show();
    }
    };*/
}

