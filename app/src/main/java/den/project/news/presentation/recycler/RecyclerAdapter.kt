package den.project.news.presentation.recycler

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import den.project.news.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerHolder>() {
    private var listShow = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.resource_fragment, parent, false)
        return RecyclerHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        holder.bind(listShow[position])
    }

    override fun getItemCount(): Int {
        return listShow.size
    }

    fun submitList(item: List<String>) {
        listShow = item as MutableList<String>
        notifyDataSetChanged()
    }
}