package com.example.dz1_month5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz1_month5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {

    private lateinit var binding: ActivityMainBinding
    var count = 0
    var presenter = Injector.fillPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun updateText(count: String) {
        binding.resultTv.text = count
    }

    override fun showToastIncrement() {
        this.showToast("Поздравляю 10")
    }

    override fun getColor() {
        binding.resultTv.setTextColor(Color.GREEN)
    }
}