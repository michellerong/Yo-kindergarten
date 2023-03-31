package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class par_post extends AppCompatActivity {

    private Button par_act;
    private Button par_inform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_post);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        par_act=(Button)findViewById(R.id.par_act);
        par_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( par_post.this,par_video.class);
                startActivity(i);
            }
        });

        par_inform=(Button)findViewById(R.id.par_inform);
        par_inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( par_post.this,par_newkid_inform.class);
                startActivity(i);
            }
        });


    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }
}
