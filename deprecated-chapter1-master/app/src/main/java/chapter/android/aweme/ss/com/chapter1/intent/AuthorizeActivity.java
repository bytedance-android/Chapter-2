package chapter.android.aweme.ss.com.chapter1.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

import chapter.android.aweme.ss.com.chapter1.R;

public class AuthorizeActivity extends AppCompatActivity {

    public static final int AUTHOR_CODE = 102;
    public static final String AUTHOR_STATE = "AUTHOR_STATE";

    private ContentLoadingProgressBar mAuthorizeLoading;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorize);
        mAuthorizeLoading = findViewById(R.id.pb_loading);
        TextView mUserContent = findViewById(R.id.tv_user_content);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Bundle user = extras.getBundle("user");
            if (user != null) {
                String id = user.getString("douyin_id");
                String name = user.getString("name");
                int age = user.getInt("age");
                mUserContent.setText(getResources().getString(R.string.user_content, id, name, age));
            }
        }
    }

    public void authorize(View view) {
        mAuthorizeLoading.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mAuthorizeLoading.hide();
                Intent data = new Intent();
                data.putExtra(AUTHOR_STATE, "success!");
                setResult(AUTHOR_CODE, data);//代表返回的标识符
                finish();
            }
        }, 1500L);
    }
}
