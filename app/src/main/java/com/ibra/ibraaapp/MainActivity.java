package com.ibra.ibraaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
    public void clickPolice(View view) {
        //gambar Police di click
        Intent p = new Intent(this,Police.class);
        startActivity(p);
    }
    public void clickMarket(View view) {
        //gambar Market di click
        Intent r = new Intent(this,Market.class);
        startActivity(r);
    }
    public void clickSchol(View view) {
        //gambar School di click
        Intent z = new Intent(this,School.class);
        startActivity(z);
    }
}