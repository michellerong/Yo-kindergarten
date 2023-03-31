package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class member_data extends AppCompatActivity {
    private Button memTransfer;

    EditText mem_name;
    RadioButton mem_sex_boy,mem_sex_girl;
    EditText mem_btd_date;
    EditText mem_phone,mem_add;
    Button mem_clean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_data);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText mem_name=(EditText)findViewById(R.id.mem_name);
        //final EditText mem_btd_date=(EditText)findViewById(R.id.mem_btd_date);
        final EditText mem_phone=(EditText)findViewById(R.id.mem_phone);
        final EditText mem_add=(EditText)findViewById(R.id.mem_add);

        memTransfer=(Button) findViewById(R.id.memTransfer);
        memTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(member_data.this,member_manage.class);
                startActivity(i);
            }
        });


        mem_clean=(Button)findViewById(R.id.mem_clean);

        mem_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem_name.setText("");
//               mem_btd_date.setText("");
                mem_phone.setText("");
                mem_add.setText("");

                mem_name.getText().clear();
//                mem_btd_date.getText().clear();
                mem_phone.getText().clear();
                mem_add.getText().clear();

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