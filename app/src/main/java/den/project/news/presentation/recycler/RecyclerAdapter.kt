package den.project.news.presentation.recycler

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import den.project.news.R
import den.project.news.data.SourceItem

class RecyclerAdapter : RecyclerView.Adapter<RecyclerHolder>() {
    private val listShow = ArrayList<SourceItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.resource_fragment, parent, false)
        return RecyclerHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        holder.bind(listShow[position])
    }

    override fun getItemCount(): Int {
        return listShow.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun showList(item: ArrayList<SourceItem>) {
        listShow.addAll(item)
        notifyDataSetChanged()
    }
}