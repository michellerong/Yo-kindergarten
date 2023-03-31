package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import java.net.SocketTimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class mem_selectpost extends AppCompatActivity {
    EditText context;
    private Button mem_edit_pw;
    Spinner category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_selectpost);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        context=(EditText)findViewById(R.id.context);
        category=(Spinner)findViewById(R.id.select_post);


        mem_edit_pw=(Button)findViewById(R.id.mem_edit_pw);
        mem_edit_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String post_context = context.getText().toString();
                String post_category=category.getSelectedItem().toString();

                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://163.17.135.245:80/app_php/post.php/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                RequestInterface request = retrofit.create(RequestInterface.class);
                Call<JsonResponse> call = request.post(post_context,post_category);
                call.enqueue(new Callback<JsonResponse>() {
                    @Override
                    public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {
                        if(response.code()==200){
                            JsonResponse jsonResponse = response.body();
                            Toast.makeText(getApplicationContext(),jsonResponse.getResponse().toString(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(),String.valueOf(response.code()),Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<JsonResponse> call, Throwable t) {
                        Log.d("msg","t="+t.toString());
                        if (t == null) {
                            return;
                        }
                        String message ;
                        if(t instanceof SocketTimeoutException){
                            message = "網路連線逾時" ;
                        }else if(t instanceof IOException){
                            message = "網路連線失敗，請檢查網路！" ;
                        }else {
                            message = "伺服器問題，請稍後再試！";
                        }
                        Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                    }
                });
                Intent i = new Intent(mem_selectpost.this,mem_post.class);
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
