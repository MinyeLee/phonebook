package com.example.phone_book;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity{
	
	GoogleMap mGoogleMap;
	
	
	
    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.googlemap);
	
		mGoogleMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		startLocationService();

		}
	private class GPSListener implements LocationListener{
		
		public void onLocationChanged(Location location){
			Double latitude = location.getLatitude();
			Double longitude = location.getLongitude();
			
			showCurrentLocation(latitude, longitude);
		}
		public void onProviderDisabled(String provider){}
		public void onProviderEnabled(String provider){}
		public void onStatusChanged(String provider, int status, Bundle extras){}
	}
	
	private void startLocationService(){
		LocationManager manager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		
		Location location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		
		GPSListener gpsListener = new GPSListener();
		long minTime = 10000;
		float minDistance = 0;
		
		manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, minDistance, gpsListener);
		Toast.makeText(getApplicationContext(), "Location Service started.", Toast.LENGTH_SHORT).show();
		manager.requestLocationUpdates(
	            LocationManager.NETWORK_PROVIDER,
	            minTime, minDistance, gpsListener);
	}
	
	
	private void showCurrentLocation(Double latitude, Double longitude){
		LatLng currentPoint = new LatLng(latitude, longitude);
	    mGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentPoint, 17));
	    mGoogleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		showAllmyItems(latitude, longitude);
	}
	
	private void showAllmyItems(Double latitude, Double longitude){
		MarkerOptions marker = new MarkerOptions();
		marker.position(new LatLng(latitude, longitude));
		marker.title("이름 : 창업보육센터 404호");
		marker.snippet("번호 : 010 2015 8382");
		marker.draggable(true);
		marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.changbo));
	
		mGoogleMap.addMarker(marker);
	}
	
	public void onResume(){
		super.onResume();
		mGoogleMap.setMyLocationEnabled(true);
	}
	
}
