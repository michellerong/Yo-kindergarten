package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class par_activitypic extends AppCompatActivity {
    private ImageButton post1;
    private ImageButton post2;
    private ImageButton post4;
    private ImageButton par_up_video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_activitypic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        post1=(ImageButton)findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(  par_activitypic.this,par_post.class);
                startActivity(i);
            }
        });

        post2=(ImageButton)findViewById(R.id.post2);
        post2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(  par_activitypic.this,par_newkid_inform.class);
                startActivity(i);
            }
        });

        post4=(ImageButton)findViewById(R.id.post4);
        post4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(  par_activitypic.this,par_else_post.class);
                startActivity(i);
            }
        });

        par_up_video=(ImageButton)findViewById(R.id.par_up_video);
        par_up_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(  par_activitypic.this,par_video.class);
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
