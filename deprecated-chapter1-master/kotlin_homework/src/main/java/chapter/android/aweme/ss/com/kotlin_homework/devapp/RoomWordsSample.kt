package chapter.android.aweme.ss.com.kotlin_homework.devapp

import android.app.Activity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import chapter.android.aweme.ss.com.kotlin_homework.R
import kotlinx.android.synthetic.main.activity_words.*

class RoomWordsSample : AppCompatActivity() {

    private lateinit var wordViewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_words)
        val adapter = WordListAdapter(this)
        word_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        word_list.setHasFixedSize(true)
        word_list.adapter = adapter
        fab.setOnClickListener {
            startActivityForResult(Intent(this, NewWordActivity::class.java), newWordActivityRequestCode)
        }

        wordViewModel = ViewModelProviders.of(this).get(WordViewModel::class.java)
        wordViewModel.allWords.observe(this, Observer { words ->
            words?.let { adapter.setWords(it) }
        })
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == newWordActivityRequestCode) {
            when (resultCode) {
                Activity.RESULT_CANCELED -> Toast.makeText(this, "word should not be null!", Toast.LENGTH_SHORT).show()
                Activity.RESULT_OK -> {
                    wordViewModel.insert(Word(data?.getStringExtra(NewWordActivity.EXTRA_REPLY)!!))
                }
            }
        }
    }

    companion object {
        const val newWordActivityRequestCode = 1
    }
}