package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int waktu_loading = 4000;
        new Handler().postDelayed(() -> {
            Intent home = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(home);
            finish();
        }, waktu_loading);
    }
}