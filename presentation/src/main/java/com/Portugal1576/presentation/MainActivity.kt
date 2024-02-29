package com.Portugal1576.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Portugal1576.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = (application as ProvideViewModel).viewModel()

        viewModel.liveData.observe(this){
            binding.mainText.text = it
        }
        viewModel.load()
    }
}