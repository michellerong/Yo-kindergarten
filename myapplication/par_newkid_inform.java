package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class par_newkid_inform extends AppCompatActivity {
    private ImageButton post1;
    private ImageButton post3;
    private ImageButton post4;
    private Button small,middle,big,PSODF,curriculum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_newkid_inform);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        post1=(ImageButton)findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( par_newkid_inform.this,par_post.class);
                startActivity(i);
            }
        });

        post3=(ImageButton)findViewById(R.id.post3);
        post3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( par_newkid_inform.this,par_video.class);
                startActivity(i);
            }
        });

        post4=(ImageButton)findViewById(R.id.post4);
        post4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( par_newkid_inform.this,par_main_screen.class);
                startActivity(i);
            }
        });


        small=(Button)findViewById(R.id.small);
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_newkid_inform.this,par_small_newkid.class);
                startActivity(i);
            }
        });

        middle=(Button)findViewById(R.id.middle);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_newkid_inform.this,par_middle_newkid.class);
                startActivity(i);
            }
        });
        big=(Button)findViewById(R.id.big);
        big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_newkid_inform.this,par_big_newkid.class);
                startActivity(i);
            }
        });
        PSODF=(Button)findViewById(R.id.PSODF);
        PSODF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_newkid_inform.this,par_newkid_show.class);
                startActivity(i);
            }
        });


        curriculum=(Button)findViewById(R.id.curriculum);
        curriculum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_newkid_inform.this,par_class.class);
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
