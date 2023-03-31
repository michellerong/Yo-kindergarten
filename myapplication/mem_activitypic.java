package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mem_activitypic extends AppCompatActivity {
    private Button mem_edit_md;
    ImageButton mem_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_activitypic);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mem_edit_md=(Button)findViewById(R.id.mem_edit_md);
        mem_edit_md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mem_activitypic.this,mem_activitypic_show.class);
                startActivity(i);
            }
        });

        mem_add=(ImageButton)findViewById(R.id.mem_add);
        mem_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(); //呼叫照相機
                intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
                startActivity(intent);
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