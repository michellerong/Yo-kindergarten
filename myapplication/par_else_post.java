package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class par_else_post extends AppCompatActivity {

    private ImageButton post1;
    private ImageButton post3;
    private ImageButton post2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_else_post);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        post1=(ImageButton)findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_else_post.this,par_post.class);
                startActivity(i);
            }
        });

        post2=(ImageButton)findViewById(R.id.post2);
        post2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_else_post.this,par_newkid_inform.class);
                startActivity(i);
            }
        });

        post3=(ImageButton)findViewById(R.id.post3);
        post3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_else_post.this,par_video.class);
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
