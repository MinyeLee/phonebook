package com.example.phone_book;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MinyeAdapter extends BaseAdapter{
	private LayoutInflater inflater;
	private List<MyStory> list1;
	
	
	public MinyeAdapter(Context context, List<MyStory> list) {
		this.inflater = LayoutInflater.from(context);
		this.list1 = list;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list1.size();
	}

	@Override
	public MyStory getItem(int position) {
		// TODO Auto-generated method stub
		return list1.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if(v==null) v = inflater.inflate(R.layout.mystory,null);
		
		ImageView ivImage = (ImageView)v.findViewById(R.id.mypic);
		ImageView ivImage1 = (ImageView)v.findViewById(R.id.mypic1);
		ImageView ivImage2 = (ImageView)v.findViewById(R.id.mypic2);
		ImageView ivImage3 = (ImageView)v.findViewById(R.id.mypic3);
		ImageView ivImage4 = (ImageView)v.findViewById(R.id.mypic4);
		ImageView ivImage5 = (ImageView)v.findViewById(R.id.mypic5);
		ImageView ivImage6 = (ImageView)v.findViewById(R.id.mypic6);
		ImageView ivImage7 = (ImageView)v.findViewById(R.id.mypic7);
		TextView tv_text = (TextView)v.findViewById(R.id.text);
		TextView tv_title = (TextView)v.findViewById(R.id.title);
		TextView tv_menu = (TextView)v.findViewById(R.id.menu);
		TextView tv_addr = (TextView)v.findViewById(R.id.addr);
		ImageView ivImage8 = (ImageView)v.findViewById(R.id.mymap);
		
		ivImage.setImageResource(getItem(position).getMyimage());
		ivImage1.setImageResource(getItem(position).getMyimage1());
		ivImage2.setImageResource(getItem(position).getMyimage2());
		ivImage3.setImageResource(getItem(position).getMyimage3());
		ivImage4.setImageResource(getItem(position).getMyimage4());
		ivImage5.setImageResource(getItem(position).getMyimage5());
		ivImage6.setImageResource(getItem(position).getMyimage6());
		ivImage7.setImageResource(getItem(position).getMyimage7());
		
		tv_text.setText(getItem(position).getMystory());
		tv_title.setText(getItem(position).getMytitle());
		tv_menu.setText(getItem(position).getMymenu());
		tv_addr.setText(getItem(position).getMyaddr());
		ivImage8.setImageResource(getItem(position).getMymap());
		return v;
	}

}
