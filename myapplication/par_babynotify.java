package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class par_babynotify extends AppCompatActivity {
    private Button par_car_move;
    private Button par_car_inform;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_babynotify);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        par_car_move=(Button)findViewById(R.id.par_car_move);
        par_car_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_babynotify.this,par_babycar_move.class);
                startActivity(i);
            }
        });

        par_car_inform=(Button)findViewById(R.id.par_car_inform);
        par_car_inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_babynotify.this,par_babycar_inform.class);
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
