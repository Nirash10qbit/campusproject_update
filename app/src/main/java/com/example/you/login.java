package com.example.you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

public class login extends AppCompatActivity {

    ImageView logo,App_Name,splashImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logo = findViewById(R.id.logo);
        App_Name = findViewById(R.id.app_name);
        splashImg = findViewById(R.id.img);


        splashImg.animate().translationY(-4000).setDuration(1000).setStartDelay(2000);
        logo.animate().translationY(4000).setDuration(1000).setStartDelay(2000);
        App_Name.animate().translationY(4000).setDuration(1000).setStartDelay(2000);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(com.example.you.login.this,load.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}