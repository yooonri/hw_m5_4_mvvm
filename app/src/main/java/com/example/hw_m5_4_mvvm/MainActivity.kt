package com.example.hw_m5_4_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hw_m5_4_mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by lazy {
        ViewModelProvider(this)[CounterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        observe()
        listeners()
    }

    private fun listeners() = with(binding) {
        btnInc.setOnClickListener {
            viewModel.inc()
        }
        btnDec.setOnClickListener {
            viewModel.dec()
        }

    }

    private fun observe() {
        viewModel.counter.observe(this) {
            binding.tvCount.text = it.toString()
        }
    }

}