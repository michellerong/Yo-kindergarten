package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register_teacher extends AppCompatActivity {

    EditText email_text;
    EditText pw_text;
    EditText check_text;
    Button clean_btn;

    private Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_teacher);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText email_text=(EditText)findViewById(R.id.email_text);
        final EditText pw_text=(EditText)findViewById(R.id.email_text);
        final EditText check_text=(EditText)findViewById(R.id.check_text);
        clean_btn=(Button)findViewById(R.id.clean_btn);

        clean_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email_text.setText("");
                pw_text.setText("");
                check_text.setText("");

                email_text.getText().clear();
                pw_text.getText().clear();
                check_text.getText().clear();

            }
        });


        btn_send = (Button)findViewById(R.id.ok_btn);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register_teacher.this, par_login.class);
                startActivity(i);
            }
        });
    }
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
//            return true;
//        }
//        return false;
//    }
}