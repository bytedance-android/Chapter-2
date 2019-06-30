package chapter.android.aweme.ss.com.kotlin_homework

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val messageList = PullParser.pull2xml(assets.open("data.xml"))
        rv_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = MyAdapter(messageList)
    }
}
