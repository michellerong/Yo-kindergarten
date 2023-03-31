package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_babycar_inform extends AppCompatActivity {


    private Button mem_edit_pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_babycar_inform);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        mem_edit_pw=(Button)findViewById(R.id.mem_edit_pw);
        mem_edit_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_babycar_inform.this,mem_babycar_inform_modify.class);
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