package com.example.mytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void singUp(View view) {
        //以一个黑色小窗的形式输出登录成功这个消息
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }
}
