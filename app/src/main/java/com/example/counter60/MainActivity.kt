package com.example.counter60

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter60.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CountView {

    lateinit var binding: ActivityMainBinding
    val presenter = Injector.getPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            presenter.increment()
        }
        binding.btnMinus.setOnClickListener {
            presenter.decrement()
        }
    }

    override fun showChangeCount(count: Int) {
        binding.countTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Congratulate!!",Toast.LENGTH_SHORT).show()
    }

    override fun showIncreasedColor() {
        binding.countTv.setTextColor(Color.GREEN)
    }

    override fun showDecreaseColor() {
        binding.countTv.setTextColor(Color.BLACK)
    }

}