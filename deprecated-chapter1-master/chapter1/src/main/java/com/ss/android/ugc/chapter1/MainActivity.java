package com.ss.android.ugc.chapter1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        ListViewBaseAdapter adapter = new ListViewBaseAdapter(this);
        listView.setAdapter(adapter);
    }
}
