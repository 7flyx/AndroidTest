package com.example.mytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button login;
    private EditText user_Login;
    private EditText password_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                //跳转到相应的界面
                Intent intent = new Intent(LoginActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        user_Login = findViewById(R.id.user_Login);
        user_Login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //监听输入框的内容
                Log.e("editText", s.toString()); //s即就是当前输入框的内容
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        password_Login = findViewById(R.id.password_Login);
        password_Login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //监听密码框的内容
                Log.e("editPassword", s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}