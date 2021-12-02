package den.project.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private var temp = mutableListOf<String>()

    private val _someText = MutableLiveData<List<String>>()
    val someText: LiveData<List<String>> get() = _someText

    fun set(value: List<String>) {
        _someText.value = value
    }

    init {
        for (i in 1..10) {
            temp.add("$i\tSome text")
            _someText.value = temp
        }
    }
}


