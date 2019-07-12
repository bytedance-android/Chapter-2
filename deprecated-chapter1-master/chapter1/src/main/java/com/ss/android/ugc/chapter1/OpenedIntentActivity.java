package com.ss.android.ugc.chapter1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class OpenedIntentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opened_intent);
        String data = getIntent().getStringExtra("data");
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}
