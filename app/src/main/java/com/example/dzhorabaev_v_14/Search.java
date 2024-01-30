package com.example.dzhorabaev_v_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
    }


    public void goBack(View v) {
        Intent intent = new Intent(this, Personal.class);
        startActivity(intent);
    }
}