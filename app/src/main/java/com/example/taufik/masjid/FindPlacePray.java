package com.example.taufik.masjid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FindPlacePray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }
    // Pindah ke Sreen wihara menggunakan intent
    public void wihara(View view) {
        Intent wihara = new Intent(this, Wihara.class);
        startActivity(wihara);
    }
    //Pindah screen ke masjid
    public void masjid(View view) {
        Intent masjid = new Intent(this, Masjid.class);
        startActivity(masjid);
    }
    //Pindah Screen ke gereja
    public void gereja(View view) {
        Intent gereja = new Intent(this, Gereja.class);
        startActivity(gereja);
    }

}
