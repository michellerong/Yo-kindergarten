package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class child_data extends  AppCompatActivity{
    private Button parTransfer;

    EditText child_name;
    EditText child_date;
    EditText child_else;
    RadioButton child_boy,child_girl;
    Button parclean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_data);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText child_name=(EditText)findViewById(R.id.child_name);

        final EditText child_else=(EditText)findViewById(R.id.child_else);


        parTransfer=(Button)findViewById(R.id. parTransfer);
        parTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( child_data.this,parent_manage.class);
                startActivity(i);
            }
        });

        parclean=(Button)findViewById(R.id.parclean);

        parclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                child_name.setText("");

                child_else.setText("");

                child_name.getText().clear();

                child_else.getText().clear();

            }
        });


    }
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
//            return true;
//        }
//        return false;
    //  }
}