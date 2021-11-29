package den.project.news.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import den.project.news.R
import den.project.news.data.SourceList

class RecyclerAdapter : RecyclerView.Adapter<RecyclerHolder>() {
    private val listShow = ArrayList<SourceList>()

    companion object {
        fun newInstance() = RecyclerAdapter()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.resource_fragment, parent, false)
        return RecyclerHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        return holder.bind(listShow[position])
    }

    override fun getItemCount(): Int {
        return listShow.size
    }

    fun showList(list: ArrayList<SourceList>) {
        listShow.clear()
        listShow.addAll(list)
        notifyDataSetChanged()
    }
}