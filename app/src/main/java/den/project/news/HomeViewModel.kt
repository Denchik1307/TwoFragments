package den.project.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    var temp = mutableListOf<String>()

    private var _someText = MutableLiveData<List<String>>()
    var value: LiveData<List<String>>
        get() = _someText
        set(value) {
            _someText = value as MutableLiveData<List<String>>
        }


    init {
        for (i in 1..10) {
            temp.add("$i Some text")
        }
        _someText.value = temp
    }

    fun setText(list: List<String>) {
        _someText.value = list
    }
}



