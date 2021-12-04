package den.project.news.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import den.project.news.R
import den.project.news.databinding.FragmentOneBinding
import den.project.news.presentation.vievmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentOne : Fragment() {
    private lateinit var binding: FragmentOneBinding
    private val someText: HomeViewModel by viewModel()
    private var temp = mutableListOf<String>()

    companion object {
        fun newInstance() = FragmentOne()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonOneFragmentOne.setOnClickListener {
            openFragmentTwo()
            temp = arrayListOf(binding.tvEditText.text.toString())
            someText.set(temp)
        }

    }

    private fun openFragmentTwo() {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_two, FragmentTwo.newInstance())
            .commit()
    }
}