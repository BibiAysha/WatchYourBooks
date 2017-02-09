package com.example.android.watchyourbooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GenreList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_list);
    }

    public void OpenRomance(View view)
    {
        Intent b= new Intent(this, RomanceList.class);
        startActivity(b);
    }
    public void OpenMystery(View view)
    {
        Intent b= new Intent(this, MysteryList.class);
        startActivity(b);
    }

    public void OpenDrama(View view)
    {
        Intent b= new Intent(this, DramaList.class);
        startActivity(b);
    }

    public void OpenSciFi(View view)
    {
        Intent b= new Intent(this, SciFiList.class);
        startActivity(b);
    }

    public void OpenPolitical(View view)
    {
        Intent b= new Intent(this, PoliticalList.class);
        startActivity(b);
    }
}
