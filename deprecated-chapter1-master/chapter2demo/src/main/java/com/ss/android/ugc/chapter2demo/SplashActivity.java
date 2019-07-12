package com.ss.android.ugc.chapter2demo;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SplashActivity extends Activity {


    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override public void onClick(View view) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_actiivty);

        final TextView txtTv1 = findViewById(R.id.txt_tv1);
        txtTv1.setOnClickListener(mOnClickListener);

        int position = getIntent().getIntExtra("position", -1);
        txtTv1.setText(String.valueOf(position));
        Toast.makeText(SplashActivity.this, "position:" + position, Toast.LENGTH_LONG).show();

    }

//    public void onClick(View view) {
//        if (view.getId() == R.id.txt_tv1) {
//            Toast.makeText(SplashActivity.this, "北京理工大学 XML", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(SplashActivity.this, "XML", Toast.LENGTH_LONG).show();
//        }
//
//
//    }
}
