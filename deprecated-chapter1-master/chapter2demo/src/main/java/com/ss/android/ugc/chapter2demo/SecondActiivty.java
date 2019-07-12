package com.ss.android.ugc.chapter2demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActiivty extends Activity {

    private static final String TAG = "SecondActiivty";

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }

    /**
     * 页面可见
     */
    @Override protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    /**
     * 页面可见并且获取焦点 用户可以操作
     */
    @Override protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    /**
     * 页面不可见
     */
    @Override protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    /**
     * 页面可见但是失去焦点
     */
    @Override protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }


    @Override protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}
