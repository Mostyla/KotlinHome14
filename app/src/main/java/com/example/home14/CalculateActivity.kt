package com.example.home14

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.home14.databinding.ActivityCalculateBinding

class CalculateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button10.setOnClickListener {
            binding.tvAnswer.setText("")
        }
        init()
    }


    private fun init() {

        binding.btnSum.setOnClickListener {
            if (binding.etNum1.text.isNotEmpty() && binding.etNum2.text.isNotEmpty()) {
                val num1 = binding.etNum1.text.toString()
                val num2 = binding.etNum2.text.toString()
                val result = num1.toFloat() + num2.toFloat()
                binding.tvAnswer.text = result.toString()
            } else {
                Toast.makeText(this@CalculateActivity, "Введите числа!", Toast.LENGTH_LONG)
                    .show()
            }
        }

        binding.btnDel.setOnClickListener {
            if (binding.etNum1.text.isNotEmpty() && binding.etNum2.text.isNotEmpty()) {
                val num1 = binding.etNum1.text.toString()
                val num2 = binding.etNum2.text.toString()
                val result = num1.toFloat() / num2.toFloat()
                binding.tvAnswer.text = result.toString()
            } else {
                Toast.makeText(this@CalculateActivity, "Введите числа!", Toast.LENGTH_LONG)
                    .show()
            }
        }

        binding.btnRazn.setOnClickListener {
            if (binding.etNum1.text.isNotEmpty() && binding.etNum2.text.isNotEmpty()) {
                val num1 = binding.etNum1.text.toString()
                val num2 = binding.etNum2.text.toString()
                val result = num1.toFloat() - num2.toFloat()
                binding.tvAnswer.text = result.toString()
            } else {
                Toast.makeText(this@CalculateActivity, "Введите числа!", Toast.LENGTH_LONG)
                    .show()
            }
        }

        binding.btnUmn.setOnClickListener {
            if (binding.etNum1.text.isNotEmpty() && binding.etNum2.text.isNotEmpty()) {
                val num1 = binding.etNum1.text.toString()
                val num2 = binding.etNum2.text.toString()
                val result = num1.toFloat() * num2.toFloat()
                binding.tvAnswer.text = result.toString()
            } else {
                Toast.makeText(this@CalculateActivity, "Введите числа!", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}
