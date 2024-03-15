package com.example.laporanmasyarakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.FirebaseApp;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                if(FirebaseUtil.isLoggedIn()){
                    startActivity(new Intent(Splash.this,Home.class));
                }else{
                    startActivity(new Intent(Splash.this,LoginRakyat.class));
                }
                finish();
            }
        },1000);
    }
}