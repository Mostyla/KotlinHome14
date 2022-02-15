package com.example.home14

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.home14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editText = binding.eT
        val textView = binding.tV



        binding.button.setOnClickListener {
            val result: String = editText.getText().toString()
            val result2: String = result.replace("а", "о")
            textView.setText(result2)
        }

        val intent = Intent(this@MainActivity,MagicActivity::class.java)
        binding.nextBtn.setOnClickListener {
            startActivity(intent)
        }


    }
}