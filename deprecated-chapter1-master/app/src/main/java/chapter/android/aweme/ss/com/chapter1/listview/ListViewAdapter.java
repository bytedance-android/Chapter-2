package chapter.android.aweme.ss.com.chapter1.listview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ListViewAdapter extends BaseAdapter {

    private int[] args = new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};

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
        return null;
    }
}
