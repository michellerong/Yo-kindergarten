package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class mem_activitypic_show extends AppCompatActivity {
    private ImageButton mem_new;
    private ImageButton post1;
    private ImageButton post2;
    private ImageButton post4;
    private ImageButton mem_up_video;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_activitypic_show);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_new=(ImageButton)findViewById(R.id.mem_new);
        mem_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_activitypic_show.this,mem_activitypic.class);
                startActivity(i);
            }
        });

        post1=(ImageButton)findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_activitypic_show.this,mem_post.class);
                startActivity(i);
            }
        });

        post2=(ImageButton)findViewById(R.id.post2);
        post2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_activitypic_show.this,mem_newkid_inform.class);
                startActivity(i);
            }
        });

        post4=(ImageButton)findViewById(R.id.post4);
        post4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_activitypic_show.this,mem_main_screen.class);
                startActivity(i);
            }
        });

        mem_up_video=(ImageButton)findViewById(R.id.mem_up_video);
        mem_up_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_activitypic_show.this,mem_activityvideo_show.class);
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
