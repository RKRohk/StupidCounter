package com.example.mystupidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mystupidapp.databinding.CountFragmentBinding
import com.example.mystupidapp.ui.count.CountFragment
import kotlinx.android.synthetic.main.count_activity.*

class countActivity : AppCompatActivity() {
    private lateinit var binding: CountFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(
            layoutInflater,R.layout.count_fragment,container,false
        )
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CountFragment.newInstance())
                .commitNow()
        }
    }

}
