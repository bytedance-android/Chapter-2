package com.ss.android.ugc.chapter1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewBaseAdapter extends BaseAdapter {

    private int[] args =
            new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10,
                    11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7,
                    8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};

    private Context mContext;

    public ListViewBaseAdapter(Context context) {
        mContext = context;
    }

    @Override public int getCount() {
        return args.length;
    }

    @Override public Object getItem(int i) {
        return null;
    }

    @Override public long getItemId(int i) {
        return 0;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            textView = new TextView(mContext);
        } else {
            textView = (TextView) convertView;
        }

        textView.setText(" " + args[position]);
        textView.setTextSize(18);
        return textView;
    }
}
