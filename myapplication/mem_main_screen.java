package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class mem_main_screen extends AppCompatActivity {
    private ImageButton main01;
    private ImageButton main02,main04,main05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_main_screen);
        main02 = (ImageButton) findViewById(R.id.main02);
        main01 = (ImageButton) findViewById(R.id.main01);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        main01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_main_screen.this, mem_post.class);
                startActivity(i);
            }
        });

        main02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_main_screen.this, mem_babycar_inform_modify.class);

                startActivity(i);
            }
        });


        main04 = (ImageButton) findViewById(R.id.main04);
        main04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_main_screen.this, member_manage.class);
                startActivity(i);
            }
        });

        main05 = (ImageButton) findViewById(R.id.main05);
        main05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_main_screen.this, mem_book_show.class);
                startActivity(i);
            }
        });



    }
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                return true;
            }
            return false;
        }

    }
