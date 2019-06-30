package chapter.android.aweme.ss.com.kotlin_homework.devapp

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

/**
 * As an example, if you keep a reference of an Activity in the ViewModel, you may end up with a reference to a destroyed Activity.
 *
 * This is a memory leak.
 *
 * If you need the application context, use AndroidViewModel, as shown in this codelab.
 */
class WordViewModel(app: Application) : AndroidViewModel(app) {

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)

    private val repository: WordRepository
    val allWords: LiveData<List<Word>>

    init {
        val wordDao: WordDao = WordRoomDatabase.getDatabase(app, scope).wordDao()
        repository = WordRepository(wordDao)
        allWords = repository.allWords
    }

    fun insert(word: Word) = scope.launch(Dispatchers.IO) {
        repository.insert(word)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}