package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_post extends AppCompatActivity {
    private ImageButton mem_new;
    private Button mem_act;
    private Button mem_inform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_post);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_new=(ImageButton)findViewById(R.id.mem_new);
        mem_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_post.this,mem_selectpost.class);
                startActivity(i);
            }
        });

        mem_act=(Button)findViewById(R.id.par_act);
        mem_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_post.this,mem_activityvideo_show.class);
                startActivity(i);
            }
        });

        mem_inform=(Button)findViewById(R.id.par_inform);
        mem_inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_post.this,mem_newkid_inform.class);
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
