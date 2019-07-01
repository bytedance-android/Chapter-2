package com.ss.android.ugc.chapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * <TextView
 * android:id="@+id/txt_name"
 * android:layout_width="match_parent"
 * android:layout_height="300dp"
 * android:ellipsize="end"
 * android:gravity="center"
 * android:lines="4"
 * android:onClick="onClick"
 * android:text="今日头条今日头条今日头条今日头条今日头条今日头日头条今日头条今日头条今日头条日头条今日头条今日头条今日头条条今日头条今日头条今日头条今日头条今日头条日头条今日头条今日头条今日头条"
 * android:textColor="@color/blue"
 * android:textSize="20dp"
 * />
 */
public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView txtClick = findViewById(R.id.txt_click);
        final TextView txtName = findViewById(R.id.txt_name);
        ImageView imgIcon = findViewById(R.id.img_icon);
        imgIcon.setImageResource(R.drawable.icon_girl);

        txtClick.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                txtClick.setText("北航 今日头条");
            }
        });
//        viewById.setOnClickListener(new View.OnClickListener() {
//            @Override public void onClick(View v) {
//
//            }
//        });
//        findViewById(R.id.txt_click).setOnClickListener(new View.OnClickListener() {
////            @Override public void onClick(View v) {
////                viewById.setVisibility(View.VISIBLE);
////            }
////        });
    }


//    public void onClick(View view) {
//        if (view.getId() == R.id.txt_name) {
//            Toast.makeText(Main4Activity.this, "今日头条 txt_name", Toast.LENGTH_SHORT).show();
//        } else if (view.getId() == R.id.txt_click) {
//            Toast.makeText(Main4Activity.this, "今日头条 txt_click", Toast.LENGTH_SHORT).show();
//        }
//    }

}
