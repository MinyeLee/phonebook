package com.example.phone_book;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LazyAdapter extends BaseAdapter {
	private LayoutInflater inflater;
	private List<Phone_Book> list;
	
	
	public LazyAdapter(Context context, List<Phone_Book> list) {
		this.inflater = LayoutInflater.from(context);
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Phone_Book getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = convertView;
		if(v==null) v = inflater.inflate(R.layout.listitem,null);
		
		ImageView ivImage = (ImageView)v.findViewById(R.id.picture);
		TextView tv_name = (TextView)v.findViewById(R.id.call);
		TextView tv_phone = (TextView)v.findViewById(R.id.m);
		TextView tv_major = (TextView)v.findViewById(R.id.n);
		
		ivImage.setImageResource(getItem(position).getImage());
		tv_name.setText(getItem(position).getName());
		tv_phone.setText(getItem(position).getPhone());
		tv_major.setText(getItem(position).getMajor());
		return v;
	}

}
