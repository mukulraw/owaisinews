package com.owaisinews.owaisinews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        t = new Timer();

        t.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent inte  = new Intent(Splash.this , MainActivity.class);
                startActivity(inte);
                finish();

            }
        } , 1500);


    }
}
