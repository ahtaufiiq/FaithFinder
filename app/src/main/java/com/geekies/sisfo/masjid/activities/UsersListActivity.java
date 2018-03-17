package com.geekies.sisfo.masjid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.view.View;

import com.geekies.sisfo.masjid.Gereja;
import com.geekies.sisfo.masjid.Masjid;
import com.geekies.sisfo.masjid.R;
import com.geekies.sisfo.masjid.Wihara;
import com.geekies.sisfo.masjid.sql.DatabaseHelper;

/**
 * Created by Ginan on 4/28/2017.
 */

public class UsersListActivity extends AppCompatActivity {
    private AppCompatActivity activity = UsersListActivity.this;
    private AppCompatTextView textViewName;
    private DatabaseHelper databaseHelper;

    CardView masjid, gereja, wihara;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_users_list);
        initViews();
        initObjects();

        masjid = (CardView) findViewById(R.id.cv_masjid);
        gereja = (CardView) findViewById(R.id.cv_gereja);
        wihara = (CardView) findViewById(R.id.cv_wihara);

        masjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent masjid = new Intent(UsersListActivity.this, Masjid.class);
                startActivity(masjid);

            }
        });

        wihara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent wihara = new Intent(UsersListActivity.this, Wihara.class);
                startActivity(wihara);

            }
        });

        gereja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gereja = new Intent(UsersListActivity.this, Gereja.class);
                startActivity(gereja);

            }
        });

    }

    /**
     * This method is to initialize views
     */
    private void initViews() {
        textViewName = (AppCompatTextView) findViewById(R.id.textViewName);
    }

    /**
     * This method is to initialize objects to be used
     */
    private void initObjects() {
        databaseHelper = new DatabaseHelper(activity);

        String nameFromIntent = getIntent().getStringExtra("USERNAME");
        textViewName.setText(nameFromIntent);
    }
}