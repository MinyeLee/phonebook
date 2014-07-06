package com.example.phone_book;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MyList extends Activity {
	private ListView listview;
	//private LazyAdapter adapter;
	private List<Phone_Book>  list;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.inbox_list);
		listview = (ListView)findViewById(R.id.list);
		list = new ArrayList<Phone_Book>();
		setList();
			// adapter = new LazyAdapter(this, list);
		listview.setAdapter(new LazyAdapter(this, list));
			//adapter.notifyDataSetChanged();
		listview.setOnItemClickListener(new OnItemClickListener()
		{
				public void onItemClick(AdapterView<?> parent, View view, int position, long id){
					TextView txtName = (TextView)view.findViewById(R.id.call);
					String name = txtName.getText().toString();
					if("이민예의바른".equals(name)){
						Intent intent = new Intent(getBaseContext(),MinYe.class );
						startActivity(intent);
					}
					else if("오석일일드라마".equals(name)){
						Intent intent1 = new Intent(getBaseContext(),SiActivity.class );
						startActivity(intent1);
					}
					else if("이성령일만".equals(name)){
						Intent intent2 = new Intent(getBaseContext(),SyActivity.class );
						startActivity(intent2);
					}
					else if("고현민수기".equals(name)){
						Intent intent3 = new Intent(getBaseContext(),HmActivity.class );
						startActivity(intent3);
					}
					else if("허유진수성찬".equals(name)){
						Intent intent4 = new Intent(getBaseContext(),YjActivity.class );
						startActivity(intent4);
					}
					
					}
				
        }); 
		}
		
		
        
    
	
	private void setList()
	{
			
			list.add(new Phone_Book(R.drawable.minye,"이민예의바른" ," CSEE", "/ 010-2015-8382"));
	  		list.add(new Phone_Book(R.drawable.seokil,"오석일일드라마"," CSEE","/ 010-4651-6782"));
	  		list.add(new Phone_Book(R.drawable.seongyoung,"이성령일만", "CS&GM ","/ 010-9588-1446"));
	  		list.add(new Phone_Book(R.drawable.hyunmin, "고현민수기"," CS&UX","/ 010-4505-8759"));
	  		list.add(new Phone_Book(R.drawable.youjin,"허유진수성찬"," CSEE", "/ 010-7779-5817"));

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
