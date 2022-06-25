package com.example.project_royjihanm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ACT_Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Kodingan dibawah ini untuk berpindah dari MainActivity ke Home
                Intent intent = new Intent(ACT_Splash_Screen.this, ACT_Login.class);
                startActivity(intent);
                finish();
            }
        },4000);  //Yang loading splash screenya 3 detik  "3000 = 3 detik"
    }
}