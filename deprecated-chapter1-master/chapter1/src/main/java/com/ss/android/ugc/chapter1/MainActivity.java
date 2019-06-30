package com.ss.android.ugc.chapter1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Fn +F2
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        ListViewBaseAdapter adapter = new ListViewBaseAdapter(this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "点击了第：" + position, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override protected void onStart() {
        super.onStart();
    }

    @Override protected void onResume() {
        super.onResume();
    }

    @Override protected void onPause() {
        super.onPause();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
    }

    @Override protected void onStop() {
        super.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
    }
}
