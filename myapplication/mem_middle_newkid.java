package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class mem_middle_newkid extends AppCompatActivity {
    private ImageButton modify,bpost2;
    private ImageButton post1;
    private ImageButton post3;
    private ImageButton post4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_middle_newkid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        modify=(ImageButton)findViewById(R.id.modify);
        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_middle_newkid.this,mem_middle_newkid_modify.class);
                startActivity(i);
            }
        });

        bpost2=(ImageButton)findViewById(R.id.bpost2);
        bpost2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_middle_newkid.this,mem_newkid_inform.class);
                startActivity(i);
            }
        });

        post1=(ImageButton)findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( mem_middle_newkid.this,mem_post.class);
                startActivity(i);
            }
        });

        post3=(ImageButton)findViewById(R.id.post3);
        post3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( mem_middle_newkid.this,mem_activityvideo_show.class);
                startActivity(i);
            }
        });

        post4=(ImageButton)findViewById(R.id.post4);
        post4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( mem_middle_newkid.this,mem_main_screen.class);
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
