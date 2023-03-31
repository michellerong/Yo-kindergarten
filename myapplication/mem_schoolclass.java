package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_schoolclass extends AppCompatActivity {
    private Button mem_edit_md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_schoolclass);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_edit_md=(Button) findViewById(R.id.mem_edit_md);
        mem_edit_md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_schoolclass.this,mem_schoolclass_show.class);
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
