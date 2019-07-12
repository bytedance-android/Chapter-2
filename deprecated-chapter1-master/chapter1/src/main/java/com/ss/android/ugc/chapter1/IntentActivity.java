package com.ss.android.ugc.chapter1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        findViewById(R.id.txt_intent).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this, OpenedIntentActivity.class);
                intent.putExtra("data", "我是IntentActivity");
                startActivity(intent);
            }
        });
    }
}
