package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class par_babycar_move extends AppCompatActivity {
    private Button par_car_inform;
    private Button par_notify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_babycar_move);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        par_car_inform=(Button)findViewById(R.id.par_car_inform);
        par_car_inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_babycar_move.this,par_babycar_inform.class);
                startActivity(i);
            }
        });

        par_notify=(Button)findViewById(R.id.par_notify);
        par_notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(par_babycar_move.this,par_babynotify.class);
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
