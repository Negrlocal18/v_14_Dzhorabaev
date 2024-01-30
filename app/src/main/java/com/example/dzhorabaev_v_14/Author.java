package com.example.dzhorabaev_v_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Author extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.author);
    }
   public void startNewActivity(View v) {
        Intent intent = new Intent(this, Personal.class);
        startActivity(intent);
   }


}
