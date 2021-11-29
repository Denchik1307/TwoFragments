package den.project.news.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import den.project.news.resources.GetResource
import den.project.news.data.SourceList
import den.project.news.databinding.FragmentTwoBinding
import den.project.news.presentation.recycler.RecyclerAdapter

class FragmentTwo : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    private val list = RecyclerAdapter.newInstance()
    private val arrayList = GetResource()
    private val res = arrayList.getRes()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        fun newInstance() = FragmentTwo()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showListItem(res)
    }

    fun showListItem(item: ArrayList<SourceList>) {
        binding.apply {
            recyclerInFragmentTwo.layoutManager = LinearLayoutManager(context)
            recyclerInFragmentTwo.adapter = list
            list.showList(item)
        }
    }

}


