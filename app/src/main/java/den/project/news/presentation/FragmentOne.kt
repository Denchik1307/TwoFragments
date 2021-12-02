package den.project.news.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import den.project.news.HomeViewModel
import den.project.news.R
import den.project.news.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    private lateinit var binding: FragmentOneBinding
    private val someText: HomeViewModel by viewModels()

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
        binding.buttonFragmentOne.setOnClickListener {
            openFragmentTwo()
        }
        binding.buttonTwoFragmentOne.setOnClickListener {
            val temp = mutableListOf<String>()
            for (i in 1..15) {
                temp.add("$i oder text")
            }
            Toast.makeText(context, temp.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    private fun openFragmentTwo() {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_two, FragmentTwo.newInstance())
            .commit()
    }
}