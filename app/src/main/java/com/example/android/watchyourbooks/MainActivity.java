package com.example.android.watchyourbooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenMenu(View view) { // This is back in the Activity file
        Intent i = new Intent(this, SearchMenu.class);
        startActivity(i);
    }

    public void OpenList(View view) {
        Intent a = new Intent(this, ListAll.class);
        startActivity(a);
    }

}
