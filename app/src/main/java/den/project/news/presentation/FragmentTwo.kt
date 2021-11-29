package den.project.news.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import den.project.news.data.SourceItem
import den.project.news.databinding.FragmentTwoBinding
import den.project.news.presentation.recycler.RecyclerAdapter
import den.project.news.resources.GetResource
import den.project.news.resources.impl.GetResourceImpl

class FragmentTwo : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    private val list = RecyclerAdapter()
    private val arrayList: GetResource = GetResourceImpl()
    private val res = arrayList.getRes()

    companion object {
        fun newInstance() = FragmentTwo()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showList(res)
    }

    private fun showList(item: ArrayList<SourceItem>) {
        binding.apply {
            recyclerInFragmentTwo.layoutManager = LinearLayoutManager(context)
            recyclerInFragmentTwo.adapter = list
            list.showList(item)
        }
    }

}


