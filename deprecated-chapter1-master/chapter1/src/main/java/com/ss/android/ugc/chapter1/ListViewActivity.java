package com.ss.android.ugc.chapter1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new ListViewAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "当前位置" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ListViewActivity.this, MainActivity.class);
                intent.putExtra("position", position);
//                Intent intent = null;
//                try {
//                    intent = new Intent(ListViewActivity.this, Class.forName("com.ss.android.ugc.chapter1.MainActivity"));
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
                startActivity(intent);
            }
        });
    }

    public static class ListViewAdapter extends BaseAdapter {
        private int[] args =
                new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9,
                        10,
                        11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5,
                        7,
                        8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};


        private Context mContext;

        public ListViewAdapter(Context context) {
            mContext = context;
        }

        @Override public int getCount() {
            return args.length;
        }

        @Override public Object getItem(int position) {
            return null;
        }

        @Override public long getItemId(int position) {
            return 0;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.activity_main2, null);
                Log.d("ListViewAdapter",
                        "getView() called with: position = [" + position + "], convertView = [" + convertView + "], parent = [" +
                                parent + "]");
            } else {
                //!=null
                view = convertView;
            }

            return view;
        }
    }
}
