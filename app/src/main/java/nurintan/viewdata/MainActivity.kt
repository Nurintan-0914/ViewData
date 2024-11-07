package nurintan.viewdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nurintan.viewdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnViewList.setOnClickListener{
            startActivity(Intent(applicationContext,
                ListviewActivity::class.java))
        }
    }
}