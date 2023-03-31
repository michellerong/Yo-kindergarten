package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class parent_manage extends AppCompatActivity {
    private Button par_edit,mem_edit_pw,mem_logout;
    private ImageButton car,chat,post,book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_manage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        par_edit=(Button)findViewById(R.id. par_edit);
        par_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_manage.this,parent_data.class);
                startActivity(i);
            }
        });

        post=(ImageButton)findViewById(R.id.login_post);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_manage.this,par_post.class);
                startActivity(i);
            }
        });

        book=(ImageButton)findViewById(R.id.login_book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_manage.this,par_book.class);
                startActivity(i);
            }
        });

        car=(ImageButton)findViewById(R.id.login_baby);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_manage.this,par_babycar_inform.class);
                startActivity(i);
            }
        });

        mem_edit_pw=(Button)findViewById(R.id.mem_edit_pw);
        mem_edit_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_manage.this,par_password_modify.class);
                startActivity(i);
            }
        });

//        chat=(ImageButton)findViewById(R.id.login_baby);
//        chat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(parent_manage.this,par_chat.class);
//                startActivity(i);
//            }
//        });

        mem_logout=(Button) findViewById(R.id.mem_logout);
        mem_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_manage.this,indentity.class);
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
