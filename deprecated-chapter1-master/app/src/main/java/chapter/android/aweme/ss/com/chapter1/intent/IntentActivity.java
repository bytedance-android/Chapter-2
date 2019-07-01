package chapter.android.aweme.ss.com.chapter1.intent;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import chapter.android.aweme.ss.com.chapter1.R;

public class IntentActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 101;

    private TextView mContactName;
    private Button mButtonSetting;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        mContactName = findViewById(R.id.tv_contact);
        mButtonSetting = findViewById(R.id.btn_setting);
    }


    public void noMatch(View view) {
        Intent it = new Intent();
        it.setAction("this is a not match action");
        startActivity(it);
    }

    /**
     * 隐式intent预埋
     *
     * @param view
     */
    public void openBrowser(View view) {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_DIAL);
        it.setData(Uri.parse("tel:188888888"));
        startActivity(it);
    }

    /**
     * 自定义的隐式intent  携带data&type
     *
     * @param view
     */
    public void customImplicit(View view) {
        Intent it = new Intent();
        Uri uri = Uri.parse("ispring://blog.github.net/huohuo");
        it.setDataAndType(uri, "text/plain");
        it.setAction("my_action");
        it.addCategory("my_category");
        startActivity(it);
    }


    /**
     * startActivityForResult with Bundle  显式
     *
     * @param view
     */
    public void wechatAuthorize(View view) {
        Intent intent = new Intent(this, AuthorizeActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("douyin_id", "huohuo666");
        bundle.putString("name", "CALL ME 火火");
        bundle.putInt("age", 18);
        intent.putExtra("user", bundle);
        startActivityForResult(intent, REQUEST_CODE);//带着讲 forResult
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == AuthorizeActivity.AUTHOR_CODE) {
            if (data != null) {
                String authMsg = data.getStringExtra(AuthorizeActivity.AUTHOR_STATE);
                Toast.makeText(this, authMsg, Toast.LENGTH_SHORT).show();
                mButtonSetting.setTextColor(getResources().getColor(R.color.colorAccent));
                mButtonSetting.setText(authMsg);
            }
        }
    }


}
