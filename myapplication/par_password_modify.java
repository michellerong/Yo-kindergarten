package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class par_password_modify extends AppCompatActivity {
    private Button ok_btn;

    EditText par_pw;
    EditText par_new_pw;
    EditText par_check;
    Button clean_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_password_modify);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText par_pw=(EditText)findViewById(R.id.par_pw);
        final EditText  par_new_pw=(EditText)findViewById(R.id. par_new_pw);
        final EditText par_check=(EditText)findViewById(R.id.par_check);
        clean_btn=(Button)findViewById(R.id.clean_btn);

        clean_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                par_pw.setText("");
                par_new_pw.setText("");
                par_check.setText("");

                par_pw.getText().clear();
                par_new_pw.getText().clear();
                par_check.getText().clear();

            }
        });


        ok_btn=(Button)findViewById(R.id. ok_btn);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( par_password_modify.this,parent_manage.class);
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