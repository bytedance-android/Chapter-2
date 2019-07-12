package com.ss.android.ugc.chapter1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RelativeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView textView = new TextView(this);
//        textView.setText("哈哈哈哈哈");
//        textView.setTextSize(20);
        setContentView(R.layout.activity_relative);
    }
}
