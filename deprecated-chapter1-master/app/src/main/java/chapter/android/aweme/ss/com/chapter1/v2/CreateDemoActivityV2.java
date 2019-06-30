package chapter.android.aweme.ss.com.chapter1.v2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class CreateDemoActivityV2 extends Activity {

    private static final String TAG = "CreateDemoActivityV";

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ABC", "onCreate");
    }

    @Override protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}
