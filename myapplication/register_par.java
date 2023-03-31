package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.net.SocketTimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class register_par extends AppCompatActivity {

    EditText email,name,password;
    Button register,clean_btn;
    private Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_par);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText email=(EditText)findViewById(R.id.email);
        final EditText name=(EditText)findViewById(R.id.name);
        final EditText password=(EditText)findViewById(R.id.password);

        clean_btn=(Button)findViewById(R.id.clean_btn);
        clean_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                password.setText("");

                name.getText().clear();
                email.getText().clear();
                password.getText().clear();

            }
        });


        register=(Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_email = email.getText().toString();
                String user_name = name.getText().toString();
                String user_password = password.getText().toString();
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://163.17.135.245:80/app_php/par_login/register.php/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                RequestInterface request = retrofit.create(RequestInterface.class);
                Call<JsonResponse> call = request.create(user_name,user_password,user_email);
                call.enqueue(new Callback<JsonResponse>() {
                    @Override
                    public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {
                        if(response.code()==200){
                            JsonResponse response1 = response.body();
                            Toast.makeText(getApplicationContext(),response1.getResponse().toString(),Toast.LENGTH_SHORT).show();
                        }
                        else{
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

                        //Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();


                    }
                });
                Intent i = new Intent(register_par.this,par_login.class);
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
