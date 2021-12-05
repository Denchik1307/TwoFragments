package den.project.news

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import den.project.news.databinding.ActivityMainBinding
import den.project.news.presentation.FragmentOne
import den.project.news.presentation.vievmodel.HomeViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.showFragmentOne.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_one, FragmentOne.newInstance())
                .commit()
        }
    }
}