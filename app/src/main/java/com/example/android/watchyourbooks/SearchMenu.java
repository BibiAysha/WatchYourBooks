package com.example.android.watchyourbooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_menu);
    }

    public void OpenGenre(View view)
    {
        Intent b= new Intent(this, GenreList.class);
        startActivity(b);
    }

    public void OpenTrueOrder(View view)
    {
        Intent b= new Intent(this,TrueOrder.class);
        startActivity(b);
    }

    public void OpenReverseOrder(View view)
    {
        Intent b= new Intent(this, ReverseOrder.class);
        startActivity(b);
    }

    public void OpenBookMovies(View view)
    {
        Intent b= new Intent(this, BookMoviesList.class);
        startActivity(b);
    }
}
