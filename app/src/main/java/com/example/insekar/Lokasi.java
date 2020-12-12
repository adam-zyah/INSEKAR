package com.example.insekar;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Lokasi extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Puskesmas Ajibarang I
        LatLng ajibarangI = new LatLng(-7.4091421217207065, 109.08174521853091);
        mMap.addMarker(new MarkerOptions().position(ajibarangI).title("Puskesmas Ajibarang I"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ajibarangI));

        // Puskesmas Ajibarang II
        LatLng ajibarangII = new LatLng(-7.406006893447268, 109.10245695411318);
        mMap.addMarker(new MarkerOptions().position(ajibarangII).title("Puskesmas Ajibarang II"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ajibarangII));

        // Puskesmas Banyumas
        LatLng Banyumas = new LatLng(-7.516912061914808, 109.29563628479585);
        mMap.addMarker(new MarkerOptions().position(Banyumas).title("Puskesmas Banyumas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Banyumas));

        // Puskesmas Banturaden I
        LatLng BanturadenI = new LatLng(-7.365341006371147, 109.2328656271238);
        mMap.addMarker(new MarkerOptions().position(BanturadenI).title("Puskesmas Banturaden I"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BanturadenI));

        // Puskesmas Banturaden II
        LatLng BanturadenII = new LatLng(-7.361701914556777, 109.23689961778354);
        mMap.addMarker(new MarkerOptions().position(BanturadenII).title("Puskesmas Banturaden II"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BanturadenII));
    }
}