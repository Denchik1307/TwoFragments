package den.project.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private var someText: MutableLiveData<List<String>> = MutableLiveData()
    var temp = mutableListOf<String>()

    init {
        for (i in 1..10) {
            temp.add("$i Somthig text")
        }
        someText.value = temp
    }

    fun getSomeText(): LiveData<List<String>> {
        return someText
    }


}
