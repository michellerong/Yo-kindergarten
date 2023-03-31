package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_newkid_show extends AppCompatActivity {
    private ImageButton post1;
    private ImageButton post3;
    private ImageButton post4,bpost2;
    private ImageButton modify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_newkid_show);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        post1=(ImageButton)findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_newkid_show.this,mem_post.class);
                startActivity(i);
            }
        });

        post3=(ImageButton)findViewById(R.id.post3);
        post3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_newkid_show.this,mem_activityvideo_show.class);
                startActivity(i);
            }
        });

        post4=(ImageButton)findViewById(R.id.post4);
        post4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_newkid_show.this,mem_main_screen.class);
                startActivity(i);
            }
        });
        bpost2=(ImageButton)findViewById(R.id.bpost2);
        bpost2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_newkid_show.this,mem_newkid_inform.class);
                startActivity(i);
            }
        });

        modify=(ImageButton) findViewById(R.id. modify);
        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_newkid_show.this,mem_newkid_post.class);
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
