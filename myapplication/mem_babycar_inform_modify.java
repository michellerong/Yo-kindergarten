package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_babycar_inform_modify extends AppCompatActivity {

    private Button mem_car_move;
    private Button mem_edit_md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_babycar_inform_modify);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_car_move=(Button)findViewById(R.id.mem_car_move);
        mem_car_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_babycar_inform_modify.this,mem_babycar_modify.class);
                startActivity(i);
            }
        });

        mem_edit_md=(Button)findViewById(R.id.mem_edit_md);
        mem_edit_md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_babycar_inform_modify.this,mem_babycar_inform.class);
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
