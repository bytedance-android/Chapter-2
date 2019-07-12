package com.ss.android.ugc.chapter2demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

public class ListViewAtcivty extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_atcivty);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new ListVieListViewAdapterV2(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Intent intent = new Intent(ListViewAtcivty.this, SplashActivity.class);
//                intent.putExtra("position",position);
//                startActivity(intent);
            }
        });
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(ListViewAtcivty.this, "当前位置" + position, Toast.LENGTH_SHORT).show();
////                Intent intent = null;
////                try {
////                    intent = new Intent(ListViewActivity.this, Class.forName("com.ss.android.ugc.chapter1.MainActivity"));
////                } catch (ClassNotFoundException e) {
////                    e.printStackTrace();
////                }
//            }
//        });
    }

    public static class ListVieListViewAdapterV2 extends BaseAdapter {
        private Context mContext;

        private int[] args =
                new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9,
                        10,
                        11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5,
                        7,
                        8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};

        public ListVieListViewAdapterV2(Context context) {
            mContext = context;
        }


        @Override public int getCount() {
            return args.length;
        }

        @Override public Object getItem(int i) {
            return null;
        }

        @Override public long getItemId(int i) {
            return i;
        }

        @Override public View getView(int position, View view, ViewGroup viewGroup) {

            View getView;
            if (view == null) {
                getView = LayoutInflater.from(mContext).inflate(R.layout.activity_splash, null);
                Log.d("ABC",
                        "getView() called with: position = [" + position + "], view = [" + view + "], viewGroup = [" + viewGroup +
                                "]");
            } else {
                getView = view;
            }

//            VIewHorlder
            TextView viewById = getView.findViewById(R.id.txt_tv1);
            viewById.setText("" + args[position]);
            return getView;
        }
    }

}
