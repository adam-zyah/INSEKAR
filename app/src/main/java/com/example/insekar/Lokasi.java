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

        // Puskesmas Cilongok I
        LatLng CilongokI = new LatLng(-7398700, 109.123438);
        mMap.addMarker(new MarkerOptions().position(CilongokI).title("Puskesmas Cilongok I"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CilongokI));

        // Puskesmas Cilongok II
        LatLng CilongokII = new LatLng(-7.446471, 109.160355);
        mMap.addMarker(new MarkerOptions().position(CilongokI).title("Puskesmas Cilongok II"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CilongokII));

        // Puskesmas Gumelar
        LatLng Gumelar = new LatLng(-7.373670, 108.981425);
        mMap.addMarker(new MarkerOptions().position(Gumelar).title("Puskesmas Gumelar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gumelar));

        // Puskesmas II Tambak
        LatLng IITambak = new LatLng(-7.612881, 109.413663);
        mMap.addMarker(new MarkerOptions().position(IITambak).title("Puskesmas II Tambak"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IITambak));

        // Puskesmas Jatilawang
        LatLng Jatilawang = new LatLng(-7.543392, 109.121674);
        mMap.addMarker(new MarkerOptions().position(Jatilawang).title("Puskesmas Jatilawang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jatilawang));

        // Puskesmas Kalibagor
        LatLng Kalibagor = new LatLng(-7.473552, 109.297506);
        mMap.addMarker(new MarkerOptions().position(Kalibagor).title("Puskesmas Kalibagor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalibagor));

        // Puskesmas Karang Lewas
        LatLng KarangLewas = new LatLng(-7.416744, 109.183888);
        mMap.addMarker(new MarkerOptions().position(KarangLewas).title("Puskesmas Karang Lewas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KarangLewas));

        // Puskesmas Kebasen
        LatLng Kebasen = new LatLng(-7.534175, 109.198043);
        mMap.addMarker(new MarkerOptions().position(Kebasen).title("Puskesmas Kebasen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kebasen));

        // Puskesmas Kedung Banteng
        LatLng KedungBanteng = new LatLng(-7.392801, 109.199927);
        mMap.addMarker(new MarkerOptions().position(KedungBanteng).title("Puskesmas Kedung Banteng"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KedungBanteng));

        // Puskesmas Kembaran I
        LatLng KembaranI = new LatLng(-7.400447, 109.285341);
        mMap.addMarker(new MarkerOptions().position(KembaranI).title("Puskesmas Kembaran I"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KembaranI));

        // Puskesmas Kemrajen I
        LatLng KemrajenI = new LatLng(-7.591420, 109.291599);
        mMap.addMarker(new MarkerOptions().position(KemrajenI).title("Puskesmas Kemrajen I"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KemrajenI));

        // Puskesmas Kemrajen II
        LatLng KemrajenII = new LatLng(-7.592496, 109.272324);
        mMap.addMarker(new MarkerOptions().position(KemrajenII).title("Puskesmas Kemrajen II"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KemrajenII));


    }
}