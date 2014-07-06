package com.example.phone_book;


//import android.graphics.drawable.Drawable;



public class Phone_Book {
	private int image; 
	private String name;
	private String phone;
	private String major;
	
	public Phone_Book() 
	{
		super();
	}
	
	public Phone_Book(int image, String name, String phone, String major) {
		super();
		this.image = image;
		this.name = name;
		this.phone = phone;
		this.major = major;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
