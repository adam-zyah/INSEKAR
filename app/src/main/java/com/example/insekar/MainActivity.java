package com.example.insekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView puskesmas, pendaftaran, antrian, tesmata, info, maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puskesmas();
        pendaftaran();
        antrian();
        tesmata();
        info();
        maps();
    }

    public void puskesmas() {
        puskesmas = (ImageView)findViewById(R.id.puskesmas);
        puskesmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this, Puskesmas.class);
                startActivity(p);
            }
        });
    }

    public void pendaftaran() {
        pendaftaran = (ImageView)findViewById(R.id.pendaftaran);
        pendaftaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(MainActivity.this, Pendaftaran.class);
                startActivity(daftar);
            }
        });
    }

    public void antrian() {
        antrian = (ImageView)findViewById(R.id.antrian);
        antrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Antrian.class);
                startActivity(a);
            }
        });
    }

    public void tesmata() {
        tesmata = (ImageView)findViewById(R.id.tesmata);
        tesmata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(MainActivity.this, TesMata.class);
                startActivity(t);
            }
        });
    }

    public void info() {
        info = (ImageView)findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Info.class);
                startActivity(i);
            }
        });
    }

    public void maps() {
        maps = (ImageView)findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, Lokasi.class);
                startActivity(m);
            }
        });
    }
}