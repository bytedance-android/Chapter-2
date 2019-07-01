package com.ss.android.ugc.chapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView textView = new TextView(this);
//        textView.setText("哈哈哈哈哈");
//        textView.setTextSize(20);
        setContentView(R.layout.activity_relative);
    }
}
