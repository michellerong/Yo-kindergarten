package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class member_manage extends AppCompatActivity {

    private ImageButton car,chat,post,book;
    private Button mem_edit_pw,mem_edit,mem_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_manage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        car=(ImageButton)findViewById(R.id.login_baby);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_manage.this,mem_babycar_inform_modify.class);
                startActivity(i);
            }
        });

//        chat=(ImageButton)findViewById(R.id.login_inform);
//
//        chat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(member_manage.this,mem_babycar_inform.class);
//                startActivity(i);
//            }
//        });
        mem_edit=(Button) findViewById(R.id.mem_edit);
        mem_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_manage.this,member_data.class);
                startActivity(i);
            }
        });
        post=(ImageButton)findViewById(R.id.login_post);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_manage.this,mem_post.class);
                startActivity(i);
            }
        });

        book=(ImageButton)findViewById(R.id.login_book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_manage.this,mem_book_show.class);
                startActivity(i);
            }
        });

        mem_edit_pw=(Button) findViewById(R.id.mem_edit_pw);
        mem_edit_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_manage.this,mem_password_modify.class);
                startActivity(i);
            }
        });



        mem_logout=(Button) findViewById(R.id.mem_logout);
        mem_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_manage.this,indentity.class);
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