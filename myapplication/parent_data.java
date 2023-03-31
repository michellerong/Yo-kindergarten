package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class parent_data extends AppCompatActivity {
    private Button parTransfer;

    EditText par_name;
    RadioButton par_sex_girl;
    RadioButton par_sex_boy;
    EditText par_btd_date;
    EditText par_phone,par_add;
    Button par_clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_data);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final EditText par_name=(EditText)findViewById(R.id.par_name);
        //final EditText par_btd_date=(EditText)findViewById(R.id.par_btd_date);
        final EditText par_phone=(EditText)findViewById(R.id.par_phone);
        final EditText par_add=(EditText)findViewById(R.id.par_add);
        // final RadioButton par_sex_girl=(RadioButton)findViewById(R.id. par_sex_girl);
        // final  RadioButton  par_sex_boy=(RadioButton)findViewById(R.id. par_sex_boy);

        parTransfer=(Button)findViewById(R.id. parTransfer);
        parTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parent_data.this,child_data.class);
                startActivity(i);
            }
        });
        par_clean=(Button)findViewById(R.id.par_clean);

        par_clean.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                par_name.setText("");
//                par_btd_date.setText("");
                par_phone.setText("");
                par_add.setText("");
                // par_sex_girl.setText("");
                //  par_sex_boy.setText("");




                par_name.getText().clear();
//                par_btd_date.getText().clear();
                par_phone.getText().clear();
                par_add.getText().clear();
                //par_sex_girl.getText().clear();
                //  par_sex_boy.getText().clear();

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