package den.project.news.presentation.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import den.project.news.data.SourceItem
import den.project.news.databinding.ResourceFragmentBinding

class RecyclerHolder(item: View) : RecyclerView.ViewHolder(item) {
    private val binding = ResourceFragmentBinding.bind(item)

    fun bind(text: SourceItem) {
        binding.textForRecycler.text = text.text
    }
}