package com.example.insekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView puskesmas, pendaftaran, antrian, tesmata, info, maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://movimentomilenio.com/wp-content/uploads/2020/08/a37d3958bdd242f57a1b962469fcb635.jpg"));
        slideModels.add(new SlideModel("https://yi-files.s3.eu-west-1.amazonaws.com/products/788000/788894/1343683-full.jpg"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/08/03/09/39/medical-5459633_960_720.png"));
        slideModels.add(new SlideModel("https://static.vecteezy.com/ti/gratis-vektor/t3/364496-gesundheitswesen-kostenlos-vektor.jpg"));
        imageSlider.setImageList(slideModels,true);

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