package com.example.myapplication;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

    public class splash extends AppCompatActivity {

        private ImageView logo;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            //logo = findViewById(R.id.splash_logo);

            //Animation myanim = AnimationUtils.loadAnimation(splash.this, R.anim.fade_in);
            //logo.startAnimation(myanim);

            final Intent aftersplash = new Intent(splash.this,indentity.class);
            Thread timer = new Thread(){
                @Override
                public void run() {
                    try{
                        sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        startActivity(aftersplash);
                        finish();
                    }
                }
            };
            timer.start();
        }
    }

