package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class mem_register extends AppCompatActivity {

    Button mem_clean;
    private Button mem_ok;
    EditText mem_email,mem_pw,mem_check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_ok=(Button) findViewById(R.id.mem_ok);
        mem_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_register.this,member_manage.class);
                startActivity(i);
            }
        });
        mem_email = (EditText)findViewById(R.id.mem_email);
        mem_pw = (EditText)findViewById(R.id.mem_pw);
        mem_check = (EditText)findViewById(R.id.mem_check);
        mem_clean = (Button)findViewById(R.id.mem_clean);

        mem_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem_email.setText("");
                mem_pw.setText("");
                mem_check.getText().clear();
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
