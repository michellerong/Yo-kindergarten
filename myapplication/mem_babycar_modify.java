package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_babycar_modify extends AppCompatActivity {
    private Button mem_edit;
    private Button mem_car_inform;
    private ImageButton nfc;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_babycar_modify);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_car_inform=(Button)findViewById(R.id.mem_car_inform);
        mem_car_inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_babycar_modify.this,mem_babycar_inform_modify.class);
                startActivity(i);

            }
        });
        mem_edit=(Button)findViewById(R.id.mem_edit);
        mem_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_babycar_modify.this,mem_babycar_move.class);
                startActivity(i);

            }
        });
        nfc=(ImageButton)findViewById(R.id.nfc);
        nfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_babycar_modify.this,nfc.class);
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
