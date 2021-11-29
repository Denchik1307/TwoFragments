package den.project.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import den.project.news.databinding.ActivityMainBinding
import den.project.news.presentation.FragmentOne

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.showFragmentOne.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_one, FragmentOne.newInstance())
                .commit()
        }
    }
}