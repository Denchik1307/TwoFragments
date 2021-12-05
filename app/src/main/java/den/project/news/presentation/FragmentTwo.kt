package den.project.news.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import den.project.news.databinding.FragmentTwoBinding
import den.project.news.presentation.recycler.RecyclerAdapter
import den.project.news.presentation.vievmodel.HomeViewModel
import org.koin.android.viewmodel.ext.android.sharedViewModel

class FragmentTwo : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    private val list = RecyclerAdapter()
    private val homeViewModel: HomeViewModel by sharedViewModel()

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
        initObserve()
    }

    private fun showList(item: List<String>) {
        binding.apply {
            recyclerInFragmentTwo.layoutManager = LinearLayoutManager(context)
            recyclerInFragmentTwo.adapter = list
            Log.d("MyLog", "ShowList item -> $item")
            list.submitList(item)
        }
    }

    private fun initObserve() {
        Log.d("MyLog", "initObserve")
        homeViewModel.someText.observe(viewLifecycleOwner) { someText ->
            showList(someText)
        }
    }

}