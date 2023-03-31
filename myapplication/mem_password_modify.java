package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class mem_password_modify extends AppCompatActivity {


    EditText mem_pw;
    EditText mem_new_pw;
    EditText mem_check;
    Button clean_btn;
    private Button ok_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_password_modify);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText mem_pw=(EditText)findViewById(R.id.mem_pw);
        final EditText  mem_new_pw=(EditText)findViewById(R.id. mem_new_pw);
        final EditText mem_check=(EditText)findViewById(R.id.mem_check);
        clean_btn=(Button)findViewById(R.id.clean_btn);

        clean_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem_pw.setText("");
                mem_new_pw.setText("");
                mem_check.setText("");

                mem_pw.getText().clear();
                mem_new_pw.getText().clear();
                mem_check.getText().clear();

            }
        });

        ok_btn=(Button) findViewById(R.id.ok_btn);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_password_modify .this,member_manage.class);
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