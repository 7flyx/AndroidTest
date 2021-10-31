package com.example.mytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView text_4;
    private TextView text_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        text_4 = findViewById(R.id.text_4);
        text_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG); //设置中划线

        text_5 = findViewById(R.id.text_5);
        text_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //设置下划线
    }
}
