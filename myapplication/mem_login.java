package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class mem_login extends AppCompatActivity {

    EditText email,password;
    Button login;
    private Button mem_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mem_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_mail = email.getText().toString();
                String user_password=password.getText().toString();

                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://163.17.135.245:80/app_php/mem_login/login.php/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                RequestInterface request = retrofit.create(RequestInterface.class);
                Call<JsonResponse> call = request.login(user_mail,user_password);
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
                        Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();

                    }


                });
                Intent i = new Intent(mem_login.this,mem_main_screen.class);
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