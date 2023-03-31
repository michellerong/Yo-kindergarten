package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class indentity extends AppCompatActivity {

    private Button par_btn,teacher_btn,par_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indentity);

        par_btn = (Button) findViewById(R.id.par_btn);
        par_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(indentity.this, par_login.class);
                startActivity(i);
            }
        });

        teacher_btn = (Button) findViewById(R.id.teacher_btn);
        teacher_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(indentity.this, mem_login.class);
                startActivity(i);
            }
        });

        par_reg = (Button) findViewById(R.id.par_reg);

        par_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(indentity.this, register_par.class);
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