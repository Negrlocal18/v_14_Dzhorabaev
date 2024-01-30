package com.example.dzhorabaev_v_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Personal extends AppCompatActivity {



    private Button btnCam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        btnCam = (Button) findViewById(R.id.btnCam);
        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
            }
        });
    }
    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, Author.class);
        startActivity(intent);
    }
}